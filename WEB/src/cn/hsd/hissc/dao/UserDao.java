package cn.hsd.hissc.dao;

import cn.hsd.hissc.model.Pager;
import cn.hsd.hissc.model.User;

public interface UserDao extends BaseDao<User>{
	/**
	 * ���ݵ�½�ź������ѯ�û�����
	 * @param userid	�û���
	 * @param password	����
	 * @return	�û���������û������ڣ��򷵻� null
	 */
	public User getUserByUserId(String userid,String password);
	/**
	 * �����û���¼�� ��ȡ�û�����
	 * @param userid ��¼��
	 * @return �û�����
	 */
	public User getUserByUserId(String userid);
	/**
	 * �����û�����ѯ�û�����
	 * @param username	�û���
	 * @param password	����
	 * @return	�û���������û������ڣ��򷵻� null
	 */
	public User getUserByName(String username);
	
	/**
	 * ��ҳ��ȡ�û�����
	 * @return
	 */
	public Pager<User> getUserPager();
	/**
	 * �����û�����ѯ�û� ����ҳ��ʾ
	 * @param name
	 * @return
	 */
	public Pager<User> getUserPagerByName(String name);
	/**
	 * �����û�������λ��ѯ�û�����ҳ��ʾ
	 * @param department
	 * @return
	 */
	public Pager<User> getUserPagerByDe(String department);
}
