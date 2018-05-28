package com.cd2cd.domain.gen;

import java.io.Serializable;
import java.util.Date;

public class SuperProFun implements Serializable {
    private Long id;

    private Long cid;

    private String name;

    private String comment;

    /**
     * request method: post/get/del/put
     */
    private String reqMethod;

    /**
     * request mapping
     */
    private String reqPath;

    /**
     * return type: vo / page
     */
    private String resType;

    /**
     * return vo
     */
    private Long voId;

    private Long pageId;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * request method: post/get/del/put
     */
    public String getReqMethod() {
        return reqMethod;
    }

    /**
     * request method: post/get/del/put
     */
    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }

    /**
     * request mapping
     */
    public String getReqPath() {
        return reqPath;
    }

    /**
     * request mapping
     */
    public void setReqPath(String reqPath) {
        this.reqPath = reqPath;
    }

    /**
     * return type: vo / page
     */
    public String getResType() {
        return resType;
    }

    /**
     * return type: vo / page
     */
    public void setResType(String resType) {
        this.resType = resType;
    }

    /**
     * return vo
     */
    public Long getVoId() {
        return voId;
    }

    /**
     * return vo
     */
    public void setVoId(Long voId) {
        this.voId = voId;
    }

    public Long getPageId() {
        return pageId;
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
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
        sb.append(", cid=").append(cid);
        sb.append(", name=").append(name);
        sb.append(", comment=").append(comment);
        sb.append(", reqMethod=").append(reqMethod);
        sb.append(", reqPath=").append(reqPath);
        sb.append(", resType=").append(resType);
        sb.append(", voId=").append(voId);
        sb.append(", pageId=").append(pageId);
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
        SuperProFun other = (SuperProFun) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getReqMethod() == null ? other.getReqMethod() == null : this.getReqMethod().equals(other.getReqMethod()))
            && (this.getReqPath() == null ? other.getReqPath() == null : this.getReqPath().equals(other.getReqPath()))
            && (this.getResType() == null ? other.getResType() == null : this.getResType().equals(other.getResType()))
            && (this.getVoId() == null ? other.getVoId() == null : this.getVoId().equals(other.getVoId()))
            && (this.getPageId() == null ? other.getPageId() == null : this.getPageId().equals(other.getPageId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getReqMethod() == null) ? 0 : getReqMethod().hashCode());
        result = prime * result + ((getReqPath() == null) ? 0 : getReqPath().hashCode());
        result = prime * result + ((getResType() == null) ? 0 : getResType().hashCode());
        result = prime * result + ((getVoId() == null) ? 0 : getVoId().hashCode());
        result = prime * result + ((getPageId() == null) ? 0 : getPageId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}