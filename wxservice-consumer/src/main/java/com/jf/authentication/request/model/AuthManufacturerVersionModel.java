package com.jf.authentication.request.model;

import lombok.Data;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
public class AuthManufacturerVersionModel {
    private String manufacturerVersion;

    /**
     * 厂商名称
     */
    private String manufacturerName;
}
