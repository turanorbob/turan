package com.jf.authentication.device.template.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;

/**
 * Created by turan on 2017/8/8 0008.
 */
@Data
@XStreamAlias("field")
public class Field {
    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;
    @XStreamAlias("value")
    @XStreamAsAttribute
    private String value;
    @XStreamAlias("type")
    @XStreamAsAttribute
    private String type;
    @XStreamAlias("attrType")
    @XStreamAsAttribute
    private String attrType;
    @XStreamAlias("description")
    @XStreamAsAttribute
    private String description;
}
