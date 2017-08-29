package com.jf.authentication.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 映射参数
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@TableName("auth_parameters")
@ApiModel
public class Parameters extends Model<Parameters> {

    private static final long serialVersionUID = 1L;

	@TableField("device_config_name")
	@ApiModelProperty("设备参数")
	private String deviceConfigName;

	@TableField("parameter_name")
	@ApiModelProperty("系统参数")
	private String parameterName;


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
		return this;
	}

	@Override
	public String toString() {
		return "Parameters{" +
			"deviceConfigName=" + deviceConfigName +
			", parameterName=" + parameterName +
			"}";
	}
}
