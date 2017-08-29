package com.jf.authentication.code;

import com.google.common.collect.Lists;
import com.jf.authentication.device.template.model.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.util.List;

/**
 * Created by turan on 2017/8/14 0014.
 */
public class TemplateTest {

    public static void portal(){
        Template template = new Template();
        Protocal protocal = new Protocal();
        protocal.setType("protocal");
        protocal.setVersion("2.0");
        template.setProtocal(protocal);

        Authentication authentication = new Authentication();
        List<Field> fieldList = Lists.newArrayList();
        Field field = new Field();
        field.setName("#if($!username) ${username} #else ${test} #end");
        field.setValue("bbbb");
        field.setAttrType("head");
        field.setType("0x01");
        field.setDescription("hello");
        fieldList.add(field);
        authentication.setFields(fieldList);
        protocal.setAuthentication(authentication);

        ProtocalFlow flows = new ProtocalFlow();
        Flow authenticationFlow = new Flow();
        List<String> actions = Lists.newArrayList();
        actions.add("challenge");
        authenticationFlow.setActions(actions);
        flows.setAuthentication(authenticationFlow);
        template.setFlow(flows);

        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(Template.class);
        String out = xstream.toXML(template);
        System.out.println(out);

        VelocityEngine ve = new VelocityEngine();
        VelocityContext context = new VelocityContext();
        context.put("username", "turan");
        context.put("test", "aaa");

        StringWriter writer = new StringWriter();
        ve.evaluate(context, writer, "", out);

        Template template1 = (Template) xstream.fromXML(writer.toString());
        System.out.println("ret:"+template1);
    }

    public static void wifidog(){
        Template template = new Template();
        Protocal protocal = new Protocal();
        protocal.setType("wifidog");
        protocal.setVersion("1.0");
        template.setProtocal(protocal);

        Authentication authentication = new Authentication();
        List<Field> fieldList = Lists.newArrayList();
        Field field = new Field();
        field.setName("#if($!username) ${username} #else ${test} #end");
        field.setValue("bbbb");
        field.setAttrType("head");
        field.setType("0x01");
        field.setDescription("hello");
        fieldList.add(field);
        authentication.setFields(fieldList);
        protocal.setAuthentication(authentication);

        Wifidog wifidog = new Wifidog();
        List<Action> actions = Lists.newArrayList();
        Action action = new Action();
        action.setName("authentication");
        action.setUrl("/auth");
        action.setMethod("GET");
        actions.add(action);
        wifidog.setActionList(actions);

        template.setWifidog(wifidog);

        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(Template.class);
        String out = xstream.toXML(template);
        System.out.println(out);

        VelocityEngine ve = new VelocityEngine();
        VelocityContext context = new VelocityContext();
        context.put("username", "turan");
        context.put("test", "aaa");

        StringWriter writer = new StringWriter();
        ve.evaluate(context, writer, "", out);

        Template template1 = (Template) xstream.fromXML(writer.toString());
        System.out.println("ret:"+template1);
    }

    public static void main(String args[]){
        //portal();
        wifidog();
    }
}
