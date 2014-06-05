package cn.hsd.hissc.dao.impl;

import cn.hsd.hissc.dao.UserDao;
import cn.hsd.hissc.model.Pager;
import cn.hsd.hissc.model.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	
	public User getUserByUserId(String userid,String password) {
		String hql = "from User u where u.userid=?";
		if (password != null ){
			hql = hql + " AND password='" + password+"'";
		}
		return (User) super.getSession()
				.createQuery(hql)
				.setParameter(0, userid).uniqueResult();
	}
	public User getUserByName(String username) {
		String hql = "from User u where u.name=?";
		return (User) super.getSession()
				.createQuery(hql)
				.setParameter(0, username).uniqueResult();
	}

	public Pager<User> getUserPager() {
		return super.findPager("from User u WHERE u.adminFlag<>'Y'");
	}
	
	public User getUserByUserId(String userid) {
		String hgl = "from User u where u.userid=?";
		return (User)super.getSession().createQuery(hgl).setParameter(0, userid).uniqueResult();
	}
	public Pager<User> getUserPagerByName(String name) {
		return super.findPager("from User u WHERE u.adminFlag<>'Y' and u.name='"+name+"'");
	}
	public Pager<User> getUserPagerByDe(String department) {
		return super.findPager("from User u WHERE u.adminFlag<>'Y' and u.department='"+department+"'");
	}

}
