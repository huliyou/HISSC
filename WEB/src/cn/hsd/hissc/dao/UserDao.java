package cn.hsd.hissc.dao;

import cn.hsd.hissc.model.Pager;
import cn.hsd.hissc.model.User;

public interface UserDao extends BaseDao<User>{
	/**
	 * 根据登陆号和密码查询用户对象
	 * @param userid	用户名
	 * @param password	密码
	 * @return	用户对象，如果用户不存在，则返回 null
	 */
	public User getUserByUserId(String userid,String password);
	/**
	 * 根据用户登录号 获取用户对象
	 * @param userid 登录号
	 * @return 用户对象
	 */
	public User getUserByUserId(String userid);
	/**
	 * 根据用户名查询用户对象
	 * @param username	用户名
	 * @param password	密码
	 * @return	用户对象，如果用户不存在，则返回 null
	 */
	public User getUserByName(String username);
	
	/**
	 * 分页获取用户对象
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
}
