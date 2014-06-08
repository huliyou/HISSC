package com.dao;
import com.bean.User;;

/**
 * @author ������
 *
 */
public interface UserDao{
	/**
	 * ����id��ȡuser����
	 * @param id �û���
	 * @return	�û���������û������ڣ��򷵻� null
	 */
	public User getUserById(String id);
	
	/**
	 * ���ݵ�¼����ȡuser����
	 * @param UserName ��¼��
	 * @return user����
	 */
	public User getUserByUserName(String UserName);
	
	/**
	 * ���ݵ�¼���������ȡuser����
	 * @param UserName ��¼��
	 * @param password ����
	 * @return user����
	 */
	public User getUserByUserName(String UserName,String password);
	
	/**
	 * ���userʵ��
	 * @param user user����
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String addUser(User user);
	
	/**
	 * @param user user����
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String deleteUser(User user);
	
	/**
	 * @param user user����
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String updataUser(User user);
	
}
