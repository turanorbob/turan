package org.jks.test;

import redis.clients.jedis.Jedis;

/**
 * Created by turan on 2017/7/31 0031.
 */
public class JedisTest {
    public static void main(String args[]){
        Jedis jedis = new Jedis("192.168.254.128");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.println(value);

    }
}
