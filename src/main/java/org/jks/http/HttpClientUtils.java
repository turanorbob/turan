package org.jks.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jks.model.CacheFile;
import org.springframework.util.FileSystemUtils;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by turan on 2017/7/24 0024.
 */
public class HttpClientUtils {

    private static HttpClientUtils httpClientDownload;

    public static HttpClientUtils getInstance() {
        if (httpClientDownload == null) {
            httpClientDownload = new HttpClientUtils();
        }
        return httpClientDownload;
    }

    /**
     * 下载文件
     *
     * @param url
     * @param filePath
     */
    public CacheFile download(final String url, final String filePath) {
        return httpDownloadFile(url, filePath, null);
    }

    /**
     * 下载文件
     *
     * @param url
     * @param filePath
     */
    private CacheFile httpDownloadFile(String url, String filePath, Map<String, String> headMap) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CacheFile cacheFile = new CacheFile();
        String fileName = null;
        try {
            HttpGet httpGet = new HttpGet(url);
            setGetHead(httpGet, headMap);
            CloseableHttpResponse response = httpclient.execute(httpGet);
            try {
                HttpEntity httpEntity = response.getEntity();
                String contentType = httpEntity.getContentType().getValue();
                cacheFile.setContentType(contentType);
                fileName = response.getFirstHeader("Etag").getValue();

                InputStream is = httpEntity.getContent();
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int r = 0;
                while ((r = is.read(buffer)) > 0) {
                    output.write(buffer, 0, r);
                }
                File dir = new File(filePath);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                fileName = filePath + File.separator + fileName.replaceAll("\"","");
                cacheFile.setPath(fileName);
                FileOutputStream fos = new FileOutputStream(fileName);
                output.writeTo(fos);
                output.flush();
                output.close();
                fos.close();
                EntityUtils.consume(httpEntity);
            } finally {
                response.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return cacheFile;
        }
    }

    /**
     * 设置http的HEAD
     *
     * @param httpGet
     * @param headMap
     */
    private void setGetHead(HttpGet httpGet, Map<String, String> headMap) {
        if (headMap != null && headMap.size() > 0) {
            Set<String> keySet = headMap.keySet();
            for (String key : keySet) {
                httpGet.addHeader(key, headMap.get(key));
            }
        }
    }

}
