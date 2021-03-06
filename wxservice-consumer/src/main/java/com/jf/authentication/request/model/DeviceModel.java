package com.jf.authentication.request.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by turan on 2017/8/5 0005.
 */
@Data
@ApiModel
public class DeviceModel {
    @ApiModelProperty("设备ID，创建时不需要传")
    private Integer id;
    /**
     * 设备名称
     */
    @ApiModelProperty("设备名称")
    private String name;
    /**
     * 设备URL或IP
     */
    @ApiModelProperty("设备URL或IP")
    private String internetAddress;
    @ApiModelProperty("设备mac")
    private String mac;
    /**
     * 设备端口
     */
    @ApiModelProperty("设备端口")
    private Integer port;
    /**
     * 设备上报消息地址
     */
    @ApiModelProperty("设备上报消息地址")
    private String reportAddress;
    /**
     * 设备上报消息端口
     */
    @ApiModelProperty("设备上报消息端口")
    private Integer reportPort;
    /**
     * 处理设备协议的具体类名
     */
    @ApiModelProperty("处理设备协议的具体类名")
    private String protocolClass;
    /**
     * 公共秘钥
     */
    @ApiModelProperty("公共秘钥")
    private String secret;
    /**
     * 认证服务器地址
     */
    @ApiModelProperty("认证服务器地址")
    private String proxyAddress;
    /**
     * 默认用户
     */
    @ApiModelProperty("默认用户")
    private String defaultUser;
    /**
     * 默认密码
     */
    @ApiModelProperty("默认密码")
    private String defaultPassword;
    /**
     * 预放行时间，秒
     */
    @ApiModelProperty("预放行时间，秒")
    private Integer freeOnlineTime;
    /**
     * 每日上网时长策略id
     */
    @ApiModelProperty("每日上网时长策略id")
    private Integer offlinePolicyId;
    /**
     * 设备自定义属性
     */
    @ApiModelProperty("设备自定义属性")
    private String extra;
}
