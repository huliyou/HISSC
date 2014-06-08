package com.dao;

import com.bean.TePaiYuan;

/**
 * @author ������
 *
 */
public interface TePaiYuanDao {
	/**
	 * ���ݵ�¼����ȡ����
	 * @param userName ��Ҫ��ȡ������Ա�ĵ�¼��
	 * @return TePaiYuan����
	 */
	public TePaiYuan getTePaiYuanByUserName(String userName);
	
	/**
	 * ��� ����Ա
	 * @param tepaiyuan Ҫ��ӵ�tepaiyuan����
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String addTePaiYuan (TePaiYuan tepaiyuan);
	
	/**
	 * ɾ�� ����Ա
	 * @param tepaiyuan Ҫɾ����tepaiyuan����
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String deleteTePaiYuan (TePaiYuan tepaiyuan);
	
	/**
	 * �޸� ����Ա
	 * @param tepaiyuan �޸ĺõ�tepaiyuan����
	 * @return �ַ���������success��ʾ�ɹ� ����fail��ʾʧ��
	 */
	public String updataTePaiYuan (TePaiYuan tepaiyuan);
	
}
