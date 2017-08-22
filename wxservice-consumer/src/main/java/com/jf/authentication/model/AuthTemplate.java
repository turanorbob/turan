package com.jf.authentication.model;

public class AuthTemplate {
    /**
     * 
     */
    private String templateName;

    /**
     * 厂商名称
     */
    private String manufacturerName;

    /**
     * 厂商版本
     */
    private String manufacturerVersion;

    /**
     * 认证类型（1：portal 2:wifidog）
     */
    private Integer authType;

    /**
     * 认证类型版本
     */
    private String authTypeVersion;

    /**
     * 模板内容
     */
    private String templateContent;

    /**
     * 
     * @return template_name 
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * 
     * @param templateName 
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    /**
     * 厂商名称
     * @return manufacturer_name 厂商名称
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * 厂商名称
     * @param manufacturerName 厂商名称
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName == null ? null : manufacturerName.trim();
    }

    /**
     * 厂商版本
     * @return manufacturer_version 厂商版本
     */
    public String getManufacturerVersion() {
        return manufacturerVersion;
    }

    /**
     * 厂商版本
     * @param manufacturerVersion 厂商版本
     */
    public void setManufacturerVersion(String manufacturerVersion) {
        this.manufacturerVersion = manufacturerVersion == null ? null : manufacturerVersion.trim();
    }

    /**
     * 认证类型（1：portal 2:wifidog）
     * @return auth_type 认证类型（1：portal 2:wifidog）
     */
    public Integer getAuthType() {
        return authType;
    }

    /**
     * 认证类型（1：portal 2:wifidog）
     * @param authType 认证类型（1：portal 2:wifidog）
     */
    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    /**
     * 认证类型版本
     * @return auth_type_version 认证类型版本
     */
    public String getAuthTypeVersion() {
        return authTypeVersion;
    }

    /**
     * 认证类型版本
     * @param authTypeVersion 认证类型版本
     */
    public void setAuthTypeVersion(String authTypeVersion) {
        this.authTypeVersion = authTypeVersion == null ? null : authTypeVersion.trim();
    }

    /**
     * 模板内容
     * @return template_content 模板内容
     */
    public String getTemplateContent() {
        return templateContent;
    }

    /**
     * 模板内容
     * @param templateContent 模板内容
     */
    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent == null ? null : templateContent.trim();
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", templateName=").append(templateName);
        sb.append(", manufacturerName=").append(manufacturerName);
        sb.append(", manufacturerVersion=").append(manufacturerVersion);
        sb.append(", authType=").append(authType);
        sb.append(", authTypeVersion=").append(authTypeVersion);
        sb.append(", templateContent=").append(templateContent);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AuthTemplate other = (AuthTemplate) that;
        return (this.getTemplateName() == null ? other.getTemplateName() == null : this.getTemplateName().equals(other.getTemplateName()))
            && (this.getManufacturerName() == null ? other.getManufacturerName() == null : this.getManufacturerName().equals(other.getManufacturerName()))
            && (this.getManufacturerVersion() == null ? other.getManufacturerVersion() == null : this.getManufacturerVersion().equals(other.getManufacturerVersion()))
            && (this.getAuthType() == null ? other.getAuthType() == null : this.getAuthType().equals(other.getAuthType()))
            && (this.getAuthTypeVersion() == null ? other.getAuthTypeVersion() == null : this.getAuthTypeVersion().equals(other.getAuthTypeVersion()))
            && (this.getTemplateContent() == null ? other.getTemplateContent() == null : this.getTemplateContent().equals(other.getTemplateContent()));
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        result = prime * result + ((getManufacturerName() == null) ? 0 : getManufacturerName().hashCode());
        result = prime * result + ((getManufacturerVersion() == null) ? 0 : getManufacturerVersion().hashCode());
        result = prime * result + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        result = prime * result + ((getAuthTypeVersion() == null) ? 0 : getAuthTypeVersion().hashCode());
        result = prime * result + ((getTemplateContent() == null) ? 0 : getTemplateContent().hashCode());
        return result;
    }
}