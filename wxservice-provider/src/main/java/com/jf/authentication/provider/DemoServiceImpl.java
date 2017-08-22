package com.jf.authentication.provider;

import com.jf.authentication.service.DemoService;

/**
 * Created by turan on 2017/8/1 0001.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
