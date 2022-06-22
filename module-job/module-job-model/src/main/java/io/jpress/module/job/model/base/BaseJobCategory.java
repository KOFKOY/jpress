package io.jpress.module.job.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseSortOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseJobCategory<M extends BaseJobCategory<M>> extends BaseSortOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 父id
     */
	public void setPid(java.lang.Long pid) {
		set("pid", pid);
	}

    /**
     * 父id
     */
	public java.lang.Long getPid() {
		return getLong("pid");
	}

    /**
     * 创建分类的用户id
     */
	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

    /**
     * 创建分类的用户id
     */
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

    /**
     * 分类名称
     */
	public void setName(java.lang.String name) {
		set("name", name);
	}

    /**
     * 分类名称
     */
	public java.lang.String getName() {
		return getStr("name");
	}

    /**
     * 内容描述
     */
	public void setContent(java.lang.String content) {
		set("content", content);
	}

    /**
     * 内容描述
     */
	public java.lang.String getContent() {
		return getStr("content");
	}

    /**
     * 摘要
     */
	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}

    /**
     * 摘要
     */
	public java.lang.String getSummary() {
		return getStr("summary");
	}

    /**
     * 该分类下的岗位数量
     */
	public void setCount(java.lang.Integer count) {
		set("count", count);
	}

    /**
     * 该分类下的岗位数量
     */
	public java.lang.Integer getCount() {
		return getInt("count");
	}

    /**
     * 图标
     */
	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}

    /**
     * 图标
     */
	public java.lang.String getIcon() {
		return getStr("icon");
	}

    /**
     * 排序编码
     */
	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}

    /**
     * 排序编码
     */
	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

    /**
     * 标识
     */
	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}

    /**
     * 标识
     */
	public java.lang.String getFlag() {
		return getStr("flag");
	}

    /**
     * SEO关键字
     */
	public void setMetaKeywords(java.lang.String metaKeywords) {
		set("meta_keywords", metaKeywords);
	}

    /**
     * SEO关键字
     */
	public java.lang.String getMetaKeywords() {
		return getStr("meta_keywords");
	}

    /**
     * SEO描述内容
     */
	public void setMetaDescription(java.lang.String metaDescription) {
		set("meta_description", metaDescription);
	}

    /**
     * SEO描述内容
     */
	public java.lang.String getMetaDescription() {
		return getStr("meta_description");
	}

    /**
     * 创建日期
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建日期
     */
	public java.util.Date getCreated() {
		return getDate("created");
	}

    /**
     * 修改日期
     */
	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

    /**
     * 修改日期
     */
	public java.util.Date getModified() {
		return getDate("modified");
	}

}

