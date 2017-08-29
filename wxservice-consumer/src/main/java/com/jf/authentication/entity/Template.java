package com.jf.authentication.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 认证模板
 * </p>
 *
 * @author turan
 * @since 2017-08-04
 */
@TableName("auth_template")
@ApiModel
public class Template extends Model<Template> {

    private static final long serialVersionUID = 1L;

    @TableId("template_name")
	@ApiModelProperty("模板名称")
	private String templateName;

	@TableField("manufacturer_name")
	@ApiModelProperty("厂商名称")
	private String manufacturerName;

	@TableField("manufacturer_version")
	@ApiModelProperty("厂商版本")
	private String manufacturerVersion;

	@TableField("auth_type")
	@ApiModelProperty("认证类型（1：portal 2:wifidog）")
	private Integer authType;

	@TableField("auth_type_version")
	@ApiModelProperty("认证类型版本")
	private String authTypeVersion;

	@TableField("template_content")
	@ApiModelProperty("模板内容")
	private String templateContent;


	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getManufacturerVersion() {
		return manufacturerVersion;
	}

	public void setManufacturerVersion(String manufacturerVersion) {
		this.manufacturerVersion = manufacturerVersion;
	}

	public Integer getAuthType() {
		return authType;
	}

	public void setAuthType(Integer authType) {
		this.authType = authType;
	}

	public String getAuthTypeVersion() {
		return authTypeVersion;
	}

	public void setAuthTypeVersion(String authTypeVersion) {
		this.authTypeVersion = authTypeVersion;
	}

	public String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	@Override
	protected Serializable pkVal() {
		return this.templateName;
	}

	@Override
	public String toString() {
		return "Template{" +
			"templateName=" + templateName +
			", manufacturerName=" + manufacturerName +
			", manufacturerVersion=" + manufacturerVersion +
			", authType=" + authType +
			", authTypeVersion=" + authTypeVersion +
			", templateContent=" + templateContent +
			"}";
	}
}
