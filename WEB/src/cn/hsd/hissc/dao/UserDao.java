package com.dao;
import com.bean.User;;

/**
 * @author 张世超
 *
 */
public interface UserDao{
	/**
	 * 根据id获取user对象
	 * @param id 用户名
	 * @return	用户对象，如果用户不存在，则返回 null
	 */
	public User getUserById(String id);
	
	/**
	 * 根据登录名获取user对象
	 * @param UserName 登录名
	 * @return user对象
	 */
	public User getUserByUserName(String UserName);
	
	/**
	 * 根据登录名和密码获取user对象
	 * @param UserName 登录名
	 * @param password 密码
	 * @return user对象
	 */
	public User getUserByUserName(String UserName,String password);
	
	/**
	 * 添加user实例
	 * @param user user对象
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String addUser(User user);
	
	/**
	 * @param user user对象
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String deleteUser(User user);
	
	/**
	 * @param user user对象
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String updataUser(User user);
	
}
