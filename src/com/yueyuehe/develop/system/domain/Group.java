package com.yueyuehe.develop.system.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author yueyuehe 组实体
 */
@Entity
@Table(name = "sys_group")
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long group_id;

	// 组名称
	@Column(nullable=false)
	private String name;

	// 创创建时间
	@Column(nullable=false)
	private Date create_time;
	// 组描述
	private String description;

	// 自关联
	@ManyToOne(targetEntity = Group.class)
	@JoinColumn(name = "parent_id", referencedColumnName = "group_id")
	private Group parent_group;

	// 自关联一对多
	@OneToMany(targetEntity = Group.class, mappedBy = "parent_group")
	private Set<Group> child_groups = new HashSet<Group>();
	
	// 与用户多对多
	@ManyToMany(targetEntity = User.class)
	@JoinTable(name = "sys_user_group", joinColumns = @JoinColumn(name = "group_id", referencedColumnName = "group_id"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"))
	private Set<Group> groups = new HashSet<Group>();

	// 与角色多对多
	@ManyToMany(targetEntity = Role.class)
	@JoinTable(name = "sys_group_role", joinColumns = @JoinColumn(name = "group_id", referencedColumnName = "group_id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"))
	private Set<Role> roles = new HashSet<Role>();

	public Long getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
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

	public Group getParent_group() {
		return parent_group;
	}

	public void setParent_group(Group parent_group) {
		this.parent_group = parent_group;
	}

	public Set<Group> getChild_groups() {
		return child_groups;
	}

	public void setChild_groups(Set<Group> child_groups) {
		this.child_groups = child_groups;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Group [group_id=" + group_id + ", name=" + name + ", create_time=" + create_time + ", description="
				+ description + ", parent_group=" + parent_group + ", child_groups=" + child_groups + ", groups="
				+ groups + ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((child_groups == null) ? 0 : child_groups.hashCode());
		result = prime * result + ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((group_id == null) ? 0 : group_id.hashCode());
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parent_group == null) ? 0 : parent_group.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
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
		Group other = (Group) obj;
		if (child_groups == null) {
			if (other.child_groups != null)
				return false;
		} else if (!child_groups.equals(other.child_groups))
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
		if (group_id == null) {
			if (other.group_id != null)
				return false;
		} else if (!group_id.equals(other.group_id))
			return false;
		if (groups == null) {
			if (other.groups != null)
				return false;
		} else if (!groups.equals(other.groups))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parent_group == null) {
			if (other.parent_group != null)
				return false;
		} else if (!parent_group.equals(other.parent_group))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}

	
}
