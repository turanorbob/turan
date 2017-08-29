package com.jf.authentication.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 版本参数映射
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@TableName("auth_manufacturer_version_parameters")
@ApiModel
public class ManufacturerVersionParameters extends Model<ManufacturerVersionParameters> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("版本号")
	@TableField("manufacturer_version")
	private String manufacturerVersion;

	@TableField("manufacturer_name")
	@ApiModelProperty("厂商名称")
	private String manufacturerName;

	@ApiModelProperty("设备参数")
	@TableField("device_config_name")
	private String deviceConfigName;

	@ApiModelProperty("系统参数")
	@TableField("parameter_name")
	private String parameterName;


	public String getManufacturerVersion() {
		return manufacturerVersion;
	}

	public void setManufacturerVersion(String manufacturerVersion) {
		this.manufacturerVersion = manufacturerVersion;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getDeviceConfigName() {
		return deviceConfigName;
	}

	public void setDeviceConfigName(String deviceConfigName) {
		this.deviceConfigName = deviceConfigName;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	@Override
	protected Serializable pkVal() {
		return this.manufacturerVersion+this.deviceConfigName+this.parameterName;
	}

	@Override
	public String toString() {
		return "ManufacturerVersionParameters{" +
			"manufacturerVersion=" + manufacturerVersion +
			", deviceConfigName=" + deviceConfigName +
			", parameterName=" + parameterName +
			"}";
	}
}
