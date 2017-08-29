package com.jf.authentication.device.template.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.util.List;

/**
 * Created by turan on 2017/8/8 0008.
 */
@Data
@XStreamAlias("flow")
public class Flow {
    @XStreamImplicit(itemFieldName="action")
    private List<String> actions;


}
