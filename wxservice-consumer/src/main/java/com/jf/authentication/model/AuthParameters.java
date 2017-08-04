package com.jf.authentication.model;

public class AuthParameters {
    /**
     * 设备参数
     */
    private String deviceConfigName;

    /**
     * 系统参数
     */
    private String parameterName;

    /**
     * 设备参数
     * @return device_config_name 设备参数
     */
    public String getDeviceConfigName() {
        return deviceConfigName;
    }

    /**
     * 设备参数
     * @param deviceConfigName 设备参数
     */
    public void setDeviceConfigName(String deviceConfigName) {
        this.deviceConfigName = deviceConfigName == null ? null : deviceConfigName.trim();
    }

    /**
     * 系统参数
     * @return parameter_name 系统参数
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * 系统参数
     * @param parameterName 系统参数
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName == null ? null : parameterName.trim();
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
        sb.append(", deviceConfigName=").append(deviceConfigName);
        sb.append(", parameterName=").append(parameterName);
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
        AuthParameters other = (AuthParameters) that;
        return (this.getDeviceConfigName() == null ? other.getDeviceConfigName() == null : this.getDeviceConfigName().equals(other.getDeviceConfigName()))
            && (this.getParameterName() == null ? other.getParameterName() == null : this.getParameterName().equals(other.getParameterName()));
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeviceConfigName() == null) ? 0 : getDeviceConfigName().hashCode());
        result = prime * result + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        return result;
    }
}