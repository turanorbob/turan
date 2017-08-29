package com.jf.authentication.device.template.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;

/**
 * Created by turan on 2017/8/7 0007.
 */
@Data
@XStreamAlias("protocal")
public class Protocal {
    @XStreamAsAttribute
    @XStreamAlias("type")
    private String type;
    @XStreamAsAttribute
    @XStreamAlias("version")
    private String version;
    private Authentication authentication;
    private Logout logout;
}
