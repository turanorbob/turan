package org.jks.demo.consumer;

import org.jks.demo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by turan on 2017/8/1 0001.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-dubbo.xml"});
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
    }
}
