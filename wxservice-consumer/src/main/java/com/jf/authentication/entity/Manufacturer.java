package com.jf.authentication.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 设备厂商
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@TableName("auth_manufacturer")
@ApiModel
public class Manufacturer extends Model<Manufacturer> {

    private static final long serialVersionUID = 1L;

    @TableId("manufacturer_name")
	@ApiModelProperty("厂商名称")
	private String manufacturerName;

	@ApiModelProperty("描述")
	private String description;

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	protected Serializable pkVal() {
		return this.manufacturerName;
	}

	@Override
	public String toString() {
		return "Manufacturer{" +
			"manufacturerName=" + manufacturerName +
			", description=" + description +
			"}";
	}
}
