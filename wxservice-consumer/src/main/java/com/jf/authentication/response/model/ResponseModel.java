package com.jf.authentication.response.model;

import com.jf.authentication.constant.Constant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by turan on 2017/8/4 0004.
 */
@Data
@ApiModel
public class ResponseModel<T> {
    @ApiModelProperty("返回码，需查看后台错误码列表")
    private Integer code = Constant.OK;
    @ApiModelProperty("错误信息")
    private String message;
    @ApiModelProperty("内容")
    private T data;
}
