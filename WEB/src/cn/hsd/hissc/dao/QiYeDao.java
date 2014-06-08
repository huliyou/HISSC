package com.dao;

import com.bean.QiYe;

/**
 * @author ������
 *
 */
public interface QiYeDao {
	
	/**
	 * @param userName ��¼��
	 * @return QiYe����
	 */
	public QiYe getTePaiYuanByUserName(String userName);
	
	/**
	 * @param qiye QiYe���� 
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String addQiYe(QiYe qiye);
	
	/**
	 * @param qiye QiYe����
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String deleteQiYe (QiYe qiye);
	
	/**
	 * @param qiye QiYe����
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String updataQiYe (QiYe qiye);

}
