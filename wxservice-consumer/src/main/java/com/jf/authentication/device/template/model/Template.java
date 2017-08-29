package com.jf.authentication.device.template.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * Created by turan on 2017/8/7 0007.
 */
@Data
@XStreamAlias("template")
public class Template {
    private Protocal protocal;
    private ProtocalFlow flow;
    private Wifidog wifidog;

}
