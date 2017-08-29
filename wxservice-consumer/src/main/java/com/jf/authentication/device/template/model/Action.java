package com.jf.authentication.device.template.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;

/**
 * Created by turan on 2017/8/14 0014.
 */
@Data
@XStreamAlias("action")
public class Action {
    @XStreamAsAttribute
    @XStreamAlias("name")
    private String name;
    @XStreamAsAttribute
    @XStreamAlias("url")
    private String url;
    @XStreamAsAttribute
    @XStreamAlias("method")
    private String method;
}
