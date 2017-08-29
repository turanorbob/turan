package com.jf.authentication.device.template.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.util.List;

/**
 * Created by turan on 2017/8/14 0014.
 */
@Data
@XStreamAlias("wifidog")
public class Wifidog {
    @XStreamImplicit
    List<Action> actionList;
}
