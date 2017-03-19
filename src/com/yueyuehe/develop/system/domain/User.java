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
import javax.persistence.Table;

/**
 * @author yueyuehe
 *用户表实体
 */
@Entity
@Table(name = "sys_user")
public class User {
	// id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	// 用户名
	@Column(nullable=false)
	private String username;
	// 密码
	@Column(nullable=false)
	private String password;
	// 姓名
	private String name;
	// 登录IP
	private String ip;
	// 皮肤
	private String skin;
	// 编号
	private String number;
	// 邮箱
	private String email;
	// 电话
	private String phone;
	// 状态
	@Column(nullable=false)
	private String status="0";
	// 备注
	private String remark;
	// 创建时间
	@Column(nullable=false)
	private Date create_time=new Date();
	// 创建时间
    private Date login_time;
	// 最后登录日期
	private Date last_login_time;
	//登录次数
	private Long login_count;
	// 与组 多对多
	@ManyToMany(targetEntity = Group.class)
	@JoinTable(name = "sys_user_group", joinColumns = @JoinColumn(name="user_id",referencedColumnName = "user_id"), inverseJoinColumns = @JoinColumn(name="group_id",referencedColumnName = "group_id"))
	private Set<Group> groups = new HashSet<Group>();
	
	// 与角色多对多
	@ManyToMany(targetEntity = Role.class)
	@JoinTable(name = "sys_user_role", joinColumns = @JoinColumn(name="user_id",referencedColumnName = "user_id"), inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "role_id"))
	private Set<Role> roles = new HashSet<Role>();

	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	public Date getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}

	public Long getLogin_count() {
		return login_count;
	}

	public void setLogin_count(Long login_count) {
		this.login_count = login_count;
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
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", ip=" + ip + ", skin=" + skin + ", number=" + number + ", email=" + email + ", phone=" + phone
				+ ", status=" + status + ", remark=" + remark + ", create_time=" + create_time + ", login_time=" + login_time
				+ ", last_login_time=" + last_login_time + ", login_count=" + login_count + ", groups=" + groups
				+ ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((last_login_time == null) ? 0 : last_login_time.hashCode());
		result = prime * result + ((login_count == null) ? 0 : login_count.hashCode());
		result = prime * result + ((login_time == null) ? 0 : login_time.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((skin == null) ? 0 : skin.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (create_time == null) {
			if (other.create_time != null)
				return false;
		} else if (!create_time.equals(other.create_time))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (groups == null) {
			if (other.groups != null)
				return false;
		} else if (!groups.equals(other.groups))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (last_login_time == null) {
			if (other.last_login_time != null)
				return false;
		} else if (!last_login_time.equals(other.last_login_time))
			return false;
		if (login_count == null) {
			if (other.login_count != null)
				return false;
		} else if (!login_count.equals(other.login_count))
			return false;
		if (login_time == null) {
			if (other.login_time != null)
				return false;
		} else if (!login_time.equals(other.login_time))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (skin == null) {
			if (other.skin != null)
				return false;
		} else if (!skin.equals(other.skin))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	
}