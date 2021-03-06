package com.cd2cd.domain.gen;

import java.io.Serializable;
import java.util.Date;

public class SuperProProject implements Serializable {
    private Long id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目介绍
     */
    private String description;

    /**
     * 项目组织
     */
    private String groupId;

    /**
     * 项目名
     */
    private String artifactId;

    /**
     * 包结构类型：standard、module
     */
    private String packageType;

    /**
     * 项目版本
     */
    private String version;

    /**
     * 访问路径
     */
    private String contextPath;

    /**
     * 本地路径，用于本地开发使用
     */
    private String localPath;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 项目介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 项目介绍
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 项目组织
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 项目组织
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 项目名
     */
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * 项目名
     */
    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * 包结构类型：standard、module
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * 包结构类型：standard、module
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * 项目版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 项目版本
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 访问路径
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * 访问路径
     */
    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    /**
     * 本地路径，用于本地开发使用
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * 本地路径，用于本地开发使用
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", groupId=").append(groupId);
        sb.append(", artifactId=").append(artifactId);
        sb.append(", packageType=").append(packageType);
        sb.append(", version=").append(version);
        sb.append(", contextPath=").append(contextPath);
        sb.append(", localPath=").append(localPath);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

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
        SuperProProject other = (SuperProProject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getArtifactId() == null ? other.getArtifactId() == null : this.getArtifactId().equals(other.getArtifactId()))
            && (this.getPackageType() == null ? other.getPackageType() == null : this.getPackageType().equals(other.getPackageType()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getContextPath() == null ? other.getContextPath() == null : this.getContextPath().equals(other.getContextPath()))
            && (this.getLocalPath() == null ? other.getLocalPath() == null : this.getLocalPath().equals(other.getLocalPath()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getArtifactId() == null) ? 0 : getArtifactId().hashCode());
        result = prime * result + ((getPackageType() == null) ? 0 : getPackageType().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getContextPath() == null) ? 0 : getContextPath().hashCode());
        result = prime * result + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}