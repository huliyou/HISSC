package cn.hsd.hissc.service;

import cn.hsd.hissc.model.Pager;
import cn.hsd.hissc.model.User;

public interface UserService {
	/**
	 * 添加用户
	 * @param user	要添加的用户
	 */
	public void addUser(User user);
	/**
	 * 根据登陆号和密码获取用户对象
	 * @param userid	用户名
	 * @param password	密码
	 * @return	用户对象，如果用户不存在，则返回 null
	 */
	public User getUserByUserId(String userid,String password);
	/**
	 * 根据用户名获取用户对象
	 * @param username	用户名
	 * @param password	密码
	 * @return	用户对象，如果用户不存在，则返回 null
	 */
	public User getUserByName(String username);
	/**
	 * 根据用户登录号获取用户对象
	 * @param userid 登录号
	 * @return 用户对象
	 */
	public User getUserByUserId(String userid);
	
	/**
	 * 分页获取用户信息
	 * @return
	 */
	public Pager<User> getUserPager();
	/**
	 * 根据用户名查询用户 并分页显示
	 * @param name
	 * @return
	 */
	public Pager<User> getUserPagerByName(String name);
	/**
	 * 根据用户行政单位查询用户并分页显示
	 * @param department
	 * @return
	 */
	public Pager<User> getUserPagerByDe(String department);
	/**
	 * 删除指定的用户对象
	 * @param user 要删除的用户
	 */
	public void deleteUser(User user);
	/**
	 * 根据 id 查询用户对象
	 * @param id	给定的 id
	 * @return
	 */
	public User getUser(int id);
	/**
	 * 修改用户信息
	 * @param loginUser	当前登录用户	
	 * @param user 要修改的用户
	 */
	public void updateUser(User user);
	

}
