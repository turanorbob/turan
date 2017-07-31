package org.jks.rest;

import org.apache.http.HttpResponse;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.jks.http.HttpClientUtils;
import org.jks.model.CacheFile;
import org.jks.model.ResponseModal;
import org.jks.service.IRedisService;
import org.jks.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by turan on 2017/7/31 0031.
 */
@RestController
public class ExampleController {

    @Autowired
    private IRedisService redisService;

    @RequestMapping("/redis/set")
    @ResponseBody
    public ResponseModal redisSet(@RequestParam("value")String value){
        boolean isOk = redisService.set("name", value);
        return new ResponseModal(isOk ? 200 : 500, isOk, isOk ? "success" : "error" , null);
    }

    @RequestMapping("/redis/get")
    @ResponseBody
    public ResponseModal redisGet(){
        String name = redisService.get("name");
        return new ResponseModal(200, true,"success",name);
    }

    @RequestMapping("/picture/{fileName}")
    public void picture(@PathVariable("fileName") String fileName, HttpServletResponse response){
        String json = redisService.get(fileName);
        CacheFile cacheFile;
        String path;
        if(StringUtils.isEmpty(json)){
            cacheFile = HttpClientUtils.getInstance().download("http://7xiyfb.com0.z0.glb.qiniucdn.com/"+fileName,"D:/temp");
            path = cacheFile.getPath();
            redisService.set(fileName, JSONUtil.toJson(cacheFile));
        }
        else{
            cacheFile = JSONUtil.toBean(json, CacheFile.class);
            path = cacheFile.getPath();
        }

        File file = new File(path);
        if(!file.exists()){
            cacheFile = HttpClientUtils.getInstance().download("http://7xiyfb.com0.z0.glb.qiniucdn.com/"+fileName,"D:/temp");
            path = cacheFile.getPath();
            redisService.set(fileName, JSONUtil.toJson(cacheFile));
        }

        InputStream in = null ;
        OutputStream out = null ;
        try
        {
            in = new FileInputStream(path);

            int len = 0;
            byte buf[] = new byte[1024];
            out = response.getOutputStream();
            response.setContentType(cacheFile.getContentType());
            response.setHeader("Cache-Control", "max-age=" + 3600);
            while( (len = in.read(buf)) > 0 )
            {
                out.write(buf, 0, len);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally
        {
            if(in!=null)
            {
                try{
                    in.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

            if(out!=null)
            {
                try{
                    out.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}