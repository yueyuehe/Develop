package com.yueyuehe.develop.base.dao;

import java.util.List;

import org.hibernate.Session;

/**
 * 
 * @ClassName BaseDao
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author yueyuehe
 * @Date 2017年3月11日 下午9:45:03
 * @version 1.0.0
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * 插入
	 * @Description 
	 * @param t
	 * @return
	 */
	public void insert(T t);

	/**
	 * 批量插入
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param t
	 * @return
	 */
	public void insertBatch(List<T> t);

	/**
	 * 批量删除
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param ids
	 * @return
	 */
	public void deleteBatchById(Long[] ids);

	/**
	 * 删除
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param id
	 * @return
	 */
	public void deleteById(Long id);

	/**
	 * 更新
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param t
	 * @return
	 */
	public void update(T t);

	/**
	 * 批量更新
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param t
	 */
	public void update(List<T> t);
	
	/**
	 * 更据ID查询
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param parameter
	 * @return
	 */
	public T findById(Long id);

	/**
	 * 查询所有记录数据
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param parameter
	 * @return
	 */
	public List<T> findAll();

}
