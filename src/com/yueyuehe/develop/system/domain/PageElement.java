package com.yueyuehe.develop.system.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

///页面元素
@Entity
@Table(name = "SYS_PAGEELEMENT")
public class PageElement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ELEMENT_ID")
	private Long element_id;

	// 元素名称
	@Column(nullable = false)
	private String name;

	// 元素描述
	private String description;

	// 元素url
	@Column(nullable = false)
	private String pageurl;

	// 元素在html页面的ID
	@Column(nullable = false)
	private String htmlID;

	// 状态
	@Column(nullable = false)
	private String status;

	// 权限表
	@ManyToMany(targetEntity = Right.class)
	@JoinTable(name = "SYS_RIGHT_PAGEELEMENT", joinColumns = @JoinColumn(name = "ELEMENT_ID", referencedColumnName = "ELEMENT_ID"), inverseJoinColumns = @JoinColumn(name = "RIGHT_ID", referencedColumnName = "RIGHT_ID"))
	private Set<Right> rights = new HashSet<Right>();

	public Long getElement_id() {
		return element_id;
	}

	public void setElement_id(Long element_id) {
		this.element_id = element_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPageurl() {
		return pageurl;
	}

	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}

	public String getHtmlID() {
		return htmlID;
	}

	public void setHtmlID(String htmlID) {
		this.htmlID = htmlID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Right> getRights() {
		return rights;
	}

	public void setRights(Set<Right> rights) {
		this.rights = rights;
	}

	@Override
	public String toString() {
		return "PageElement [element_id=" + element_id + ", name=" + name + ", description=" + description
				+ ", pageurl=" + pageurl + ", htmlID=" + htmlID + ", status=" + status + ", rights=" + rights + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((element_id == null) ? 0 : element_id.hashCode());
		result = prime * result + ((htmlID == null) ? 0 : htmlID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pageurl == null) ? 0 : pageurl.hashCode());
		result = prime * result + ((rights == null) ? 0 : rights.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PageElement other = (PageElement) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (element_id == null) {
			if (other.element_id != null)
				return false;
		} else if (!element_id.equals(other.element_id))
			return false;
		if (htmlID == null) {
			if (other.htmlID != null)
				return false;
		} else if (!htmlID.equals(other.htmlID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pageurl == null) {
			if (other.pageurl != null)
				return false;
		} else if (!pageurl.equals(other.pageurl))
			return false;
		if (rights == null) {
			if (other.rights != null)
				return false;
		} else if (!rights.equals(other.rights))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	
}
