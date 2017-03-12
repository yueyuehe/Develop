package com.yueyuehe.develop.system.domain;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "sys_right")
public class Right {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long right_id;

	//名称
	@Column(nullable=false)
	private String name;
	
	//创建时间
	@Column(nullable=false)
	private Date create_time;
	//描述
	private String description;
	
	//权限与角色多对多
	@ManyToMany(targetEntity=Role.class)
	@JoinTable(name = "sys_right_role", joinColumns = @JoinColumn(name="right_id",referencedColumnName = "right_id"), inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "role_id"))
	private Set<Role> users = new HashSet<Role>();

	//权限与文件资源多对多
	@ManyToMany(targetEntity=FileResource.class)
	@JoinTable(name = "sys_right_fileresource", joinColumns = @JoinColumn(name="right_id",referencedColumnName = "right_id"), inverseJoinColumns = @JoinColumn(name="file_id",referencedColumnName = "file_id"))
	private Set<FileResource> fileresources = new HashSet<FileResource>();
	
	//权限与页面元素资源多对多
	@ManyToMany(targetEntity=PageElement.class)
	@JoinTable(name = "sys_right_pageelement", joinColumns = @JoinColumn(name="right_id",referencedColumnName = "right_id"), inverseJoinColumns = @JoinColumn(name="element_id",referencedColumnName = "element_id"))
	private Set<PageElement> pageelements = new HashSet<PageElement>();
	
	//权限与操作多对多
	@ManyToMany(targetEntity=Action.class)
	@JoinTable(name = "sys_right_action", joinColumns = @JoinColumn(name="right_id",referencedColumnName = "right_id"), inverseJoinColumns = @JoinColumn(name="action_id",referencedColumnName = "action_id"))
	private Set<Action> actions = new HashSet<Action>();
	
	//权限与菜单多对多
	@ManyToMany(targetEntity=Menu.class)
	@JoinTable(name = "sys_right_menu", joinColumns = @JoinColumn(name="right_id",referencedColumnName = "right_id"), inverseJoinColumns = @JoinColumn(name="menu_id",referencedColumnName = "menu_id"))
	private Set<Menu> menus = new HashSet<Menu>();

	public Long getRight_id() {
		return right_id;
	}

	public void setRight_id(Long right_id) {
		this.right_id = right_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Role> getUsers() {
		return users;
	}

	public void setUsers(Set<Role> users) {
		this.users = users;
	}

	public Set<FileResource> getFileresources() {
		return fileresources;
	}

	public void setFileresources(Set<FileResource> fileresources) {
		this.fileresources = fileresources;
	}

	public Set<PageElement> getPageelements() {
		return pageelements;
	}

	public void setPageelements(Set<PageElement> pageelements) {
		this.pageelements = pageelements;
	}

	public Set<Action> getActions() {
		return actions;
	}

	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}

	public Set<Menu> getMenus() {
		return menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "Right [right_id=" + right_id + ", name=" + name + ", create_time=" + create_time + ", description="
				+ description + ", users=" + users + ", fileresources=" + fileresources + ", pageelements="
				+ pageelements + ", actions=" + actions + ", menus=" + menus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
		result = prime * result + ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((fileresources == null) ? 0 : fileresources.hashCode());
		result = prime * result + ((menus == null) ? 0 : menus.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pageelements == null) ? 0 : pageelements.hashCode());
		result = prime * result + ((right_id == null) ? 0 : right_id.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Right other = (Right) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		if (create_time == null) {
			if (other.create_time != null)
				return false;
		} else if (!create_time.equals(other.create_time))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (fileresources == null) {
			if (other.fileresources != null)
				return false;
		} else if (!fileresources.equals(other.fileresources))
			return false;
		if (menus == null) {
			if (other.menus != null)
				return false;
		} else if (!menus.equals(other.menus))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pageelements == null) {
			if (other.pageelements != null)
				return false;
		} else if (!pageelements.equals(other.pageelements))
			return false;
		if (right_id == null) {
			if (other.right_id != null)
				return false;
		} else if (!right_id.equals(other.right_id))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}
	
	
}
