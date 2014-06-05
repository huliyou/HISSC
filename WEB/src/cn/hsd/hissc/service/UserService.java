package cn.hsd.hissc.service;

import cn.hsd.hissc.model.Pager;
import cn.hsd.hissc.model.User;

public interface UserService {
	/**
	 * ����û�
	 * @param user	Ҫ��ӵ��û�
	 */
	public void addUser(User user);
	/**
	 * ���ݵ�½�ź������ȡ�û�����
	 * @param userid	�û���
	 * @param password	����
	 * @return	�û���������û������ڣ��򷵻� null
	 */
	public User getUserByUserId(String userid,String password);
	/**
	 * �����û�����ȡ�û�����
	 * @param username	�û���
	 * @param password	����
	 * @return	�û���������û������ڣ��򷵻� null
	 */
	public User getUserByName(String username);
	/**
	 * �����û���¼�Ż�ȡ�û�����
	 * @param userid ��¼��
	 * @return �û�����
	 */
	public User getUserByUserId(String userid);
	
	/**
	 * ��ҳ��ȡ�û���Ϣ
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
	/**
	 * ɾ��ָ�����û�����
	 * @param user Ҫɾ�����û�
	 */
	public void deleteUser(User user);
	/**
	 * ���� id ��ѯ�û�����
	 * @param id	������ id
	 * @return
	 */
	public User getUser(int id);
	/**
	 * �޸��û���Ϣ
	 * @param loginUser	��ǰ��¼�û�	
	 * @param user Ҫ�޸ĵ��û�
	 */
	public void updateUser(User user);
	

}
