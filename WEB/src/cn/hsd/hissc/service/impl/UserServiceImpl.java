package cn.hsd.hissc.service.impl;


import cn.hsd.hissc.dao.UserDao;
import cn.hsd.hissc.model.Pager;
import cn.hsd.hissc.model.User;
import cn.hsd.hissc.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		userDao.add(user);
	}

	public User getUserByUserId(String userid, String password) {
		return userDao.getUserByUserId(userid, password);
	}
	public User getUserByName(String username) {
		return userDao.getUserByName(username);
	}
	public User getUserByUserId(String userid){
		return userDao.getUserByUserId(userid);
	}

	public Pager<User> getUserPager() {
		return userDao.getUserPager();
	}

	public void deleteUser(User user) {
		userDao.delete(user);
	}

	public User getUser(int id) {
		return userDao.get(id);
	}

	public void updateUser(User user) {
		userDao.update(user);
	}

	public void deleteChooseUser(int[] ids) {
		for (int id : ids) {
			User user = new User();
			user.setId(id);
			userDao.delete(user);
		}
	}

	public Pager<User> getUserPagerByName(String name) {
		return userDao.getUserPagerByName(name);
	}

	public Pager<User> getUserPagerByDe(String department) {
		
		return userDao.getUserPagerByDe(department);
	}
}
