package com.yueyuehe.develop.system.domain;

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

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "SYS_MENU")
public class Menu {
	// 菜单ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long menu_id;

	// 菜单名称
	@Column(nullable=false)
	private String menu_name;

	// 菜单u r l
	@Column(nullable=false)
	private String menu_url;

	// 父菜单
	@ManyToOne(targetEntity = Menu.class)
	@JoinColumn(name = "PARENT_ID",referencedColumnName="menu_id")
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	private Menu parentMenu;

	/**
	 * 子菜单
	 */
	@OneToMany(targetEntity=Menu.class,mappedBy="parentMenu")
	private Set<Menu> childs = new HashSet<Menu>();
	// 排序号
	private Integer menu_order;

	// 图标
	private String menu_icon;

	// 类型 系统为0，用户为1 暂时都是系统类型以后扩展使用
	@Column(nullable=false)
	private String menu_type;

	//权限表
	@ManyToMany(targetEntity = Right.class)
	@JoinTable(name = "SYS_RIGHT_MENU",joinColumns = @JoinColumn(name="MENU_ID",referencedColumnName = "MENU_ID"), inverseJoinColumns = @JoinColumn(name="RIGHT_ID",referencedColumnName = "RIGHT_ID"))
	private Set<Right> rights = new HashSet<Right>();

	public Long getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenu_url() {
		return menu_url;
	}

	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}

	public Menu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}

	public Set<Menu> getChilds() {
		return childs;
	}

	public void setChilds(Set<Menu> childs) {
		this.childs = childs;
	}

	public Integer getMenu_order() {
		return menu_order;
	}

	public void setMenu_order(Integer menu_order) {
		this.menu_order = menu_order;
	}

	public String getMenu_icon() {
		return menu_icon;
	}

	public void setMenu_icon(String menu_icon) {
		this.menu_icon = menu_icon;
	}

	public String getMenu_type() {
		return menu_type;
	}

	public void setMenu_type(String menu_type) {
		this.menu_type = menu_type;
	}

	public Set<Right> getRights() {
		return rights;
	}

	public void setRights(Set<Right> rights) {
		this.rights = rights;
	}

	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", menu_name=" + menu_name + ", menu_url=" + menu_url + ", parentMenu="
				+ parentMenu + ", childs=" + childs + ", menu_order=" + menu_order + ", menu_icon=" + menu_icon
				+ ", menu_type=" + menu_type + ", rights=" + rights + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childs == null) ? 0 : childs.hashCode());
		result = prime * result + ((menu_icon == null) ? 0 : menu_icon.hashCode());
		result = prime * result + ((menu_id == null) ? 0 : menu_id.hashCode());
		result = prime * result + ((menu_name == null) ? 0 : menu_name.hashCode());
		result = prime * result + ((menu_order == null) ? 0 : menu_order.hashCode());
		result = prime * result + ((menu_type == null) ? 0 : menu_type.hashCode());
		result = prime * result + ((menu_url == null) ? 0 : menu_url.hashCode());
		result = prime * result + ((parentMenu == null) ? 0 : parentMenu.hashCode());
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
		Menu other = (Menu) obj;
		if (childs == null) {
			if (other.childs != null)
				return false;
		} else if (!childs.equals(other.childs))
			return false;
		if (menu_icon == null) {
			if (other.menu_icon != null)
				return false;
		} else if (!menu_icon.equals(other.menu_icon))
			return false;
		if (menu_id == null) {
			if (other.menu_id != null)
				return false;
		} else if (!menu_id.equals(other.menu_id))
			return false;
		if (menu_name == null) {
			if (other.menu_name != null)
				return false;
		} else if (!menu_name.equals(other.menu_name))
			return false;
		if (menu_order == null) {
			if (other.menu_order != null)
				return false;
		} else if (!menu_order.equals(other.menu_order))
			return false;
		if (menu_type == null) {
			if (other.menu_type != null)
				return false;
		} else if (!menu_type.equals(other.menu_type))
			return false;
		if (menu_url == null) {
			if (other.menu_url != null)
				return false;
		} else if (!menu_url.equals(other.menu_url))
			return false;
		if (parentMenu == null) {
			if (other.parentMenu != null)
				return false;
		} else if (!parentMenu.equals(other.parentMenu))
			return false;
		if (rights == null) {
			if (other.rights != null)
				return false;
		} else if (!rights.equals(other.rights))
			return false;
		return true;
	}
	
	
}
