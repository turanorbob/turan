package com.jf.authentication.device.template.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * Created by turan on 2017/8/8 0008.
 */
@Data
@XStreamAlias("protocal")
public class ProtocalFlow {
    @XStreamAlias("authentication")
    private Flow authentication;
    @XStreamAlias("authentication")
    private Flow logout;
}
