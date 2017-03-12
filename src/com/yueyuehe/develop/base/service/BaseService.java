package com.yueyuehe.develop.base.service;

import java.util.List;

public interface BaseService<T> {


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
