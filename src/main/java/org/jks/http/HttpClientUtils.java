package org.jks.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
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
    /**
     * 最大线程池
     */
    public static final int THREAD_POOL_SIZE = 5;

    public interface HttpClientDownLoadProgress {
        public void onProgress(int progress);
    }

    private static HttpClientUtils httpClientDownload;

    private ExecutorService downloadExcutorService;

    private HttpClientUtils() {
        downloadExcutorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    }

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
    public void download(final String url, final String filePath) {
        downloadExcutorService.execute(new Runnable() {

            public void run() {
                httpDownloadFile(url, filePath, null, null);
            }
        });
    }

    /**
     * 下载文件
     *
     * @param url
     * @param filePath
     * @param progress 进度回调
     */
    public void download(final String url, final String filePath,
                         final HttpClientDownLoadProgress progress) {
        downloadExcutorService.execute(new Runnable() {

            public void run() {
                httpDownloadFile(url, filePath, progress, null);
            }
        });
    }

    /**
     * 下载文件
     *
     * @param url
     * @param filePath
     */
    private void httpDownloadFile(String url, String filePath,
                                  HttpClientDownLoadProgress progress, Map<String, String> headMap) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {

            HttpGet httpGet = new HttpGet(url);
            setGetHead(httpGet, headMap);
            CloseableHttpResponse response = httpclient.execute(httpGet);
            try {
                HttpEntity httpEntity = response.getEntity();

                String fileName = response.getFirstHeader("Etag").getValue();

                long contentLength = httpEntity.getContentLength();
                InputStream is = httpEntity.getContent();
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int r = 0;
                long totalRead = 0;
                while ((r = is.read(buffer)) > 0) {
                    output.write(buffer, 0, r);
                    totalRead += r;
                    if (progress != null) {// 回调进度
                        progress.onProgress((int) (totalRead * 100 / contentLength));
                    }
                }
                File dir = new File(filePath);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                fileName = filePath + File.separator + fileName.replaceAll("\"","");

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
