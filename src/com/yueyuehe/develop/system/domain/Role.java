package com.yueyuehe.develop.system.domain;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "sys_role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long role_id;

	// 角色名称
	@Column(nullable=false)
	private String role_name;
	
	// 创建时间
	@Column(nullable=false)
	private Date create_time;
	
	// 角色描述
	private String description;
	
	// 与父角色，多对一
	@ManyToOne(targetEntity = Role.class)
	@JoinColumn (name="parent_id",referencedColumnName="role_id")
	private Role parent_role;
	
	//与子角色多对一
	@OneToMany(targetEntity = Role.class,mappedBy="parent_role")
	private Set<Role> child_roles  = new HashSet<Role>();

	// 与权限表多对多
	@ManyToMany(targetEntity = Right.class)
	@JoinTable(name = "sys_right_role", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"), inverseJoinColumns = @JoinColumn(name = "right_id", referencedColumnName = "right_id"))
	private Set<Right> rights = new HashSet<Right>();

	/// 与用户表多对多
	@ManyToMany(targetEntity = User.class)
	@JoinTable(name = "sys_user_role", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"))
	private Set<User> users = new HashSet<User>();

	// 与组多对多
	@ManyToMany(targetEntity = Group.class)
	@JoinTable(name = "sys_group_role", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"), inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "group_id"))
	private Set<Group> groups = new HashSet<Group>();

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
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

	public Role getParent_role() {
		return parent_role;
	}

	public void setParent_role(Role parent_role) {
		this.parent_role = parent_role;
	}

	public Set<Role> getChild_roles() {
		return child_roles;
	}

	public void setChild_roles(Set<Role> child_roles) {
		this.child_roles = child_roles;
	}

	public Set<Right> getRights() {
		return rights;
	}

	public void setRights(Set<Right> rights) {
		this.rights = rights;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + ", create_time=" + create_time
				+ ", description=" + description + ", parent_role=" + parent_role + ", child_roles=" + child_roles
				+ ", rights=" + rights + ", users=" + users + ", groups=" + groups + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((child_roles == null) ? 0 : child_roles.hashCode());
		result = prime * result + ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((parent_role == null) ? 0 : parent_role.hashCode());
		result = prime * result + ((rights == null) ? 0 : rights.hashCode());
		result = prime * result + ((role_id == null) ? 0 : role_id.hashCode());
		result = prime * result + ((role_name == null) ? 0 : role_name.hashCode());
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
		Role other = (Role) obj;
		if (child_roles == null) {
			if (other.child_roles != null)
				return false;
		} else if (!child_roles.equals(other.child_roles))
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
		if (groups == null) {
			if (other.groups != null)
				return false;
		} else if (!groups.equals(other.groups))
			return false;
		if (parent_role == null) {
			if (other.parent_role != null)
				return false;
		} else if (!parent_role.equals(other.parent_role))
			return false;
		if (rights == null) {
			if (other.rights != null)
				return false;
		} else if (!rights.equals(other.rights))
			return false;
		if (role_id == null) {
			if (other.role_id != null)
				return false;
		} else if (!role_id.equals(other.role_id))
			return false;
		if (role_name == null) {
			if (other.role_name != null)
				return false;
		} else if (!role_name.equals(other.role_name))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	
	
}
