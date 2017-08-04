package com.jf.authentication.model;

public class AuthManufacturerVersion {
    /**
     * 
     */
    private String manufacturerVersion;

    /**
     * 厂商名称
     */
    private String manufacturerName;

    /**
     * 
     * @return manufacturer_version 
     */
    public String getManufacturerVersion() {
        return manufacturerVersion;
    }

    /**
     * 
     * @param manufacturerVersion 
     */
    public void setManufacturerVersion(String manufacturerVersion) {
        this.manufacturerVersion = manufacturerVersion == null ? null : manufacturerVersion.trim();
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
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", manufacturerVersion=").append(manufacturerVersion);
        sb.append(", manufacturerName=").append(manufacturerName);
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
        AuthManufacturerVersion other = (AuthManufacturerVersion) that;
        return (this.getManufacturerVersion() == null ? other.getManufacturerVersion() == null : this.getManufacturerVersion().equals(other.getManufacturerVersion()))
            && (this.getManufacturerName() == null ? other.getManufacturerName() == null : this.getManufacturerName().equals(other.getManufacturerName()));
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getManufacturerVersion() == null) ? 0 : getManufacturerVersion().hashCode());
        result = prime * result + ((getManufacturerName() == null) ? 0 : getManufacturerName().hashCode());
        return result;
    }
}