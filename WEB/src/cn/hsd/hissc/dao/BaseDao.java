package cn.hsd.hissc.dao;

import java.io.Serializable;
import java.util.List;

import cn.hsd.hissc.model.Pager;

public interface BaseDao<T> {
	/**
	 * 添加对象
	 * 
	 * @param obj
	 *            要添加的对象
	 */
	public void add(T obj);

	/**
	 * 更新对象
	 * 
	 * @param obj
	 *            要更新的对象
	 */
	public void update(T obj);

	/**
	 * 根据 id 获取指定的对象
	 * 
	 * @param id 对象的唯一标识
	 *            
	 * @return 查找到的对象，如果没有匹配对象，则返回 null
	 */
	public T get(Serializable id);

	/**
	 * 删除指定对象
	 * 
	 * @param obj
	 *            要删除的对象
	 */
	public void delete(T obj);

	/**
	 * 返回所有的对象
	 * 
	 * @return 对象列表
	 */
	public List<T> list(String hql);
	/**
	 * 获取当前泛型所对应的类的所有数据记录
	 * @return
	 */
	public List<T> list();
	
	/**
	 * 根据 hql 语句获取对象列表
	 * 
	 * @param hql
	 *            要执行 hql 语句
	 * @param parms
	 *            替换 hql 中 ? 位置处的值，如果没有 ? ,则可以不传值
	 * @return 对象列表
	 */
	public List<T> listByHql(String hql, Object... parms);

	/**
	 * 分页查询对象
	 * 
	 * @param hql
	 *            分页需要的 hql 语句
	 * @param pagenum
	 *            当前页
	 * @param pageline
	 *            每页显示多少条记录
	 * @return
	 */
	@Deprecated
	public Pager<T> findPager(String hql, int pagenum, int pageline);

	/**
	 * 分页查询对象
	 * 
	 * @param hql
	 * @return
	 */
	public Pager<T> findPager(String hql);
	/**
	 * 更新对象，带有合并持久化对象的功能
	 * @param obj
	 */
	public void merge(T obj);
}
