package com.jf.authentication.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@TableName("auth_device")
@ApiModel
public class Device extends Model<Device> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("设备id")
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;

	@ApiModelProperty("设备名称")
	private String name;

	@ApiModelProperty("设备URL或IP")
	@TableField("internet_address")
	private String internetAddress;

	@ApiModelProperty("设备mac")
	private String mac;

	@ApiModelProperty("设备端口")
	private Integer port;

	@ApiModelProperty("设备上报消息地址")
	@TableField("report_address")
	private String reportAddress;

	@ApiModelProperty("设备上报消息端口")
	@TableField("report_port")
	private Integer reportPort;

	@ApiModelProperty("处理设备协议的具体类名")
	@TableField("protocol_class")
	private String protocolClass;

	@ApiModelProperty("公共秘钥")
	private String secret;

	@ApiModelProperty("认证服务器地址")
	@TableField("proxy_address")
	private String proxyAddress;

	@ApiModelProperty("默认用户")
	@TableField("default_user")
	private String defaultUser;

	@ApiModelProperty("默认密码")
	@TableField("default_password")
	private String defaultPassword;

	@ApiModelProperty("预放行时间，秒")
	@TableField("free_online_time")
	private Integer freeOnlineTime;

	@ApiModelProperty("每日上网时长策略id")
	@TableField("offline_policy_id")
	private Integer offlinePolicyId;

	@ApiModelProperty("设备自定义属性")
	private String extra;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInternetAddress() {
		return internetAddress;
	}

	public void setInternetAddress(String internetAddress) {
		this.internetAddress = internetAddress;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getReportAddress() {
		return reportAddress;
	}

	public void setReportAddress(String reportAddress) {
		this.reportAddress = reportAddress;
	}

	public Integer getReportPort() {
		return reportPort;
	}

	public void setReportPort(Integer reportPort) {
		this.reportPort = reportPort;
	}

	public String getProtocolClass() {
		return protocolClass;
	}

	public void setProtocolClass(String protocolClass) {
		this.protocolClass = protocolClass;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getProxyAddress() {
		return proxyAddress;
	}

	public void setProxyAddress(String proxyAddress) {
		this.proxyAddress = proxyAddress;
	}

	public String getDefaultUser() {
		return defaultUser;
	}

	public void setDefaultUser(String defaultUser) {
		this.defaultUser = defaultUser;
	}

	public String getDefaultPassword() {
		return defaultPassword;
	}

	public void setDefaultPassword(String defaultPassword) {
		this.defaultPassword = defaultPassword;
	}

	public Integer getFreeOnlineTime() {
		return freeOnlineTime;
	}

	public void setFreeOnlineTime(Integer freeOnlineTime) {
		this.freeOnlineTime = freeOnlineTime;
	}

	public Integer getOfflinePolicyId() {
		return offlinePolicyId;
	}

	public void setOfflinePolicyId(Integer offlinePolicyId) {
		this.offlinePolicyId = offlinePolicyId;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Device{" +
			"id=" + id +
			", name=" + name +
			", internetAddress=" + internetAddress +
			", mac=" + mac +
			", port=" + port +
			", reportAddress=" + reportAddress +
			", reportPort=" + reportPort +
			", protocolClass=" + protocolClass +
			", secret=" + secret +
			", proxyAddress=" + proxyAddress +
			", defaultUser=" + defaultUser +
			", defaultPassword=" + defaultPassword +
			", freeOnlineTime=" + freeOnlineTime +
			", offlinePolicyId=" + offlinePolicyId +
			", extra=" + extra +
			"}";
	}
}
