package org.jks.demo.provider;

import org.jks.demo.service.DemoService;

/**
 * Created by turan on 2017/8/1 0001.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
