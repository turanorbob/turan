package org.jks.test;

import org.jks.http.HttpClientUtils;

/**
 * Created by turan on 2017/7/24 0024.
 */
public class HttpUtilTest {
    public static void main(String args[]){
        HttpClientUtils instantce = HttpClientUtils.getInstance();
        instantce.download("http://7xiyfb.com0.z0.glb.qiniucdn.com/FgHYaPmVv7wSqEf4xO6xlE7SHwVJ", "D:/temp");
    }
}
