package com.yueyuehe.develop.system.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * 
 * @author yueyuehe 功能操作表
 */
@Entity
@Table(name = "SYS_ACTION")
public class Action {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACTION_ID")
	private Long action_id;

	// 操作名称
	@Column(nullable = false)
	private String action_name;

	// url
	@Column(nullable = false)
	private String action_url;

	// 描述
	private String description;

	// 权限表
	@ManyToMany(targetEntity = Right.class)
	@JoinTable(name = "SYS_RIGHT_ACTION", joinColumns = @JoinColumn(name = "ACTION_ID", referencedColumnName = "ACTION_ID"), inverseJoinColumns = @JoinColumn(name = "RIGHT_ID", referencedColumnName = "RIGHT_ID"))
	private Set<Right> rights = new HashSet<Right>();

	public Long getAction_id() {
		return action_id;
	}

	public void setAction_id(Long action_id) {
		this.action_id = action_id;
	}

	public String getAction_name() {
		return action_name;
	}

	public void setAction_name(String action_name) {
		this.action_name = action_name;
	}

	public String getAction_url() {
		return action_url;
	}

	public void setAction_url(String action_url) {
		this.action_url = action_url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Right> getRights() {
		return rights;
	}

	public void setRights(Set<Right> rights) {
		this.rights = rights;
	}

	@Override
	public String toString() {
		return "Action [action_id=" + action_id + ", action_name=" + action_name + ", action_url=" + action_url
				+ ", description=" + description + ", rights=" + rights + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action_id == null) ? 0 : action_id.hashCode());
		result = prime * result + ((action_name == null) ? 0 : action_name.hashCode());
		result = prime * result + ((action_url == null) ? 0 : action_url.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((rights == null) ? 0 : rights.hashCode());
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
		Action other = (Action) obj;
		if (action_id == null) {
			if (other.action_id != null)
				return false;
		} else if (!action_id.equals(other.action_id))
			return false;
		if (action_name == null) {
			if (other.action_name != null)
				return false;
		} else if (!action_name.equals(other.action_name))
			return false;
		if (action_url == null) {
			if (other.action_url != null)
				return false;
		} else if (!action_url.equals(other.action_url))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (rights == null) {
			if (other.rights != null)
				return false;
		} else if (!rights.equals(other.rights))
			return false;
		return true;
	}

	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
