package com.jf.authentication.model;

public class AuthDevice {
    /**
     * 设备id
     */
    private Integer id;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备URL或IP
     */
    private String internetAddress;

    /**
     * 
     */
    private String mac;

    /**
     * 设备端口
     */
    private Integer port;

    /**
     * 设备上报消息地址
     */
    private String reportAddress;

    /**
     * 设备上报消息端口
     */
    private Integer reportPort;

    /**
     * 处理设备协议的具体类名
     */
    private String protocolClass;

    /**
     * 公共秘钥
     */
    private String secret;

    /**
     * 认证服务器地址
     */
    private String proxyAddress;

    /**
     * 默认用户
     */
    private String defaultUser;

    /**
     * 默认密码
     */
    private String defaultPassword;

    /**
     * 预放行时间，秒
     */
    private Integer freeOnlineTime;

    /**
     * 每日上网时长策略id
     */
    private Integer offlinePolicyId;

    /**
     * 设备自定义属性
     */
    private String extra;

    /**
     * 设备id
     * @return id 设备id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设备id
     * @param id 设备id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 设备名称
     * @return name 设备名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设备名称
     * @param name 设备名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 设备URL或IP
     * @return internet_address 设备URL或IP
     */
    public String getInternetAddress() {
        return internetAddress;
    }

    /**
     * 设备URL或IP
     * @param internetAddress 设备URL或IP
     */
    public void setInternetAddress(String internetAddress) {
        this.internetAddress = internetAddress == null ? null : internetAddress.trim();
    }

    /**
     * 
     * @return mac 
     */
    public String getMac() {
        return mac;
    }

    /**
     * 
     * @param mac 
     */
    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    /**
     * 设备端口
     * @return port 设备端口
     */
    public Integer getPort() {
        return port;
    }

    /**
     * 设备端口
     * @param port 设备端口
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * 设备上报消息地址
     * @return report_address 设备上报消息地址
     */
    public String getReportAddress() {
        return reportAddress;
    }

    /**
     * 设备上报消息地址
     * @param reportAddress 设备上报消息地址
     */
    public void setReportAddress(String reportAddress) {
        this.reportAddress = reportAddress == null ? null : reportAddress.trim();
    }

    /**
     * 设备上报消息端口
     * @return report_port 设备上报消息端口
     */
    public Integer getReportPort() {
        return reportPort;
    }

    /**
     * 设备上报消息端口
     * @param reportPort 设备上报消息端口
     */
    public void setReportPort(Integer reportPort) {
        this.reportPort = reportPort;
    }

    /**
     * 处理设备协议的具体类名
     * @return protocol_class 处理设备协议的具体类名
     */
    public String getProtocolClass() {
        return protocolClass;
    }

    /**
     * 处理设备协议的具体类名
     * @param protocolClass 处理设备协议的具体类名
     */
    public void setProtocolClass(String protocolClass) {
        this.protocolClass = protocolClass == null ? null : protocolClass.trim();
    }

    /**
     * 公共秘钥
     * @return secret 公共秘钥
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 公共秘钥
     * @param secret 公共秘钥
     */
    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    /**
     * 认证服务器地址
     * @return proxy_address 认证服务器地址
     */
    public String getProxyAddress() {
        return proxyAddress;
    }

    /**
     * 认证服务器地址
     * @param proxyAddress 认证服务器地址
     */
    public void setProxyAddress(String proxyAddress) {
        this.proxyAddress = proxyAddress == null ? null : proxyAddress.trim();
    }

    /**
     * 默认用户
     * @return default_user 默认用户
     */
    public String getDefaultUser() {
        return defaultUser;
    }

    /**
     * 默认用户
     * @param defaultUser 默认用户
     */
    public void setDefaultUser(String defaultUser) {
        this.defaultUser = defaultUser == null ? null : defaultUser.trim();
    }

    /**
     * 默认密码
     * @return default_password 默认密码
     */
    public String getDefaultPassword() {
        return defaultPassword;
    }

    /**
     * 默认密码
     * @param defaultPassword 默认密码
     */
    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword == null ? null : defaultPassword.trim();
    }

    /**
     * 预放行时间，秒
     * @return free_online_time 预放行时间，秒
     */
    public Integer getFreeOnlineTime() {
        return freeOnlineTime;
    }

    /**
     * 预放行时间，秒
     * @param freeOnlineTime 预放行时间，秒
     */
    public void setFreeOnlineTime(Integer freeOnlineTime) {
        this.freeOnlineTime = freeOnlineTime;
    }

    /**
     * 每日上网时长策略id
     * @return offline_policy_id 每日上网时长策略id
     */
    public Integer getOfflinePolicyId() {
        return offlinePolicyId;
    }

    /**
     * 每日上网时长策略id
     * @param offlinePolicyId 每日上网时长策略id
     */
    public void setOfflinePolicyId(Integer offlinePolicyId) {
        this.offlinePolicyId = offlinePolicyId;
    }

    /**
     * 设备自定义属性
     * @return extra 设备自定义属性
     */
    public String getExtra() {
        return extra;
    }

    /**
     * 设备自定义属性
     * @param extra 设备自定义属性
     */
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
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
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", internetAddress=").append(internetAddress);
        sb.append(", mac=").append(mac);
        sb.append(", port=").append(port);
        sb.append(", reportAddress=").append(reportAddress);
        sb.append(", reportPort=").append(reportPort);
        sb.append(", protocolClass=").append(protocolClass);
        sb.append(", secret=").append(secret);
        sb.append(", proxyAddress=").append(proxyAddress);
        sb.append(", defaultUser=").append(defaultUser);
        sb.append(", defaultPassword=").append(defaultPassword);
        sb.append(", freeOnlineTime=").append(freeOnlineTime);
        sb.append(", offlinePolicyId=").append(offlinePolicyId);
        sb.append(", extra=").append(extra);
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
        AuthDevice other = (AuthDevice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getInternetAddress() == null ? other.getInternetAddress() == null : this.getInternetAddress().equals(other.getInternetAddress()))
            && (this.getMac() == null ? other.getMac() == null : this.getMac().equals(other.getMac()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getReportAddress() == null ? other.getReportAddress() == null : this.getReportAddress().equals(other.getReportAddress()))
            && (this.getReportPort() == null ? other.getReportPort() == null : this.getReportPort().equals(other.getReportPort()))
            && (this.getProtocolClass() == null ? other.getProtocolClass() == null : this.getProtocolClass().equals(other.getProtocolClass()))
            && (this.getSecret() == null ? other.getSecret() == null : this.getSecret().equals(other.getSecret()))
            && (this.getProxyAddress() == null ? other.getProxyAddress() == null : this.getProxyAddress().equals(other.getProxyAddress()))
            && (this.getDefaultUser() == null ? other.getDefaultUser() == null : this.getDefaultUser().equals(other.getDefaultUser()))
            && (this.getDefaultPassword() == null ? other.getDefaultPassword() == null : this.getDefaultPassword().equals(other.getDefaultPassword()))
            && (this.getFreeOnlineTime() == null ? other.getFreeOnlineTime() == null : this.getFreeOnlineTime().equals(other.getFreeOnlineTime()))
            && (this.getOfflinePolicyId() == null ? other.getOfflinePolicyId() == null : this.getOfflinePolicyId().equals(other.getOfflinePolicyId()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()));
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getInternetAddress() == null) ? 0 : getInternetAddress().hashCode());
        result = prime * result + ((getMac() == null) ? 0 : getMac().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getReportAddress() == null) ? 0 : getReportAddress().hashCode());
        result = prime * result + ((getReportPort() == null) ? 0 : getReportPort().hashCode());
        result = prime * result + ((getProtocolClass() == null) ? 0 : getProtocolClass().hashCode());
        result = prime * result + ((getSecret() == null) ? 0 : getSecret().hashCode());
        result = prime * result + ((getProxyAddress() == null) ? 0 : getProxyAddress().hashCode());
        result = prime * result + ((getDefaultUser() == null) ? 0 : getDefaultUser().hashCode());
        result = prime * result + ((getDefaultPassword() == null) ? 0 : getDefaultPassword().hashCode());
        result = prime * result + ((getFreeOnlineTime() == null) ? 0 : getFreeOnlineTime().hashCode());
        result = prime * result + ((getOfflinePolicyId() == null) ? 0 : getOfflinePolicyId().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        return result;
    }
}