package com.jf.authentication.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 设备版本
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@TableName("auth_manufacturer_version")
@ApiModel
public class ManufacturerVersion extends Model<ManufacturerVersion> {

    private static final long serialVersionUID = 1L;

    @TableField("manufacturer_version")
	@ApiModelProperty("厂商版本")
	private String manufacturerVersion;

	@TableField("manufacturer_name")
	@ApiModelProperty("厂商名称")
	private String manufacturerName;


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

	@Override
	protected Serializable pkVal() {
		return this;
	}

	@Override
	public String toString() {
		return "ManufacturerVersion{" +
			"manufacturerVersion=" + manufacturerVersion +
			", manufacturerName=" + manufacturerName +
			"}";
	}
}
