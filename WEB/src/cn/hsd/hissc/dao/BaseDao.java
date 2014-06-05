package cn.hsd.hissc.dao;

import java.io.Serializable;
import java.util.List;

import cn.hsd.hissc.model.Pager;

public interface BaseDao<T> {
	/**
	 * ��Ӷ���
	 * 
	 * @param obj
	 *            Ҫ��ӵĶ���
	 */
	public void add(T obj);

	/**
	 * ���¶���
	 * 
	 * @param obj
	 *            Ҫ���µĶ���
	 */
	public void update(T obj);

	/**
	 * ���� id ��ȡָ���Ķ���
	 * 
	 * @param id �����Ψһ��ʶ
	 *            
	 * @return ���ҵ��Ķ������û��ƥ������򷵻� null
	 */
	public T get(Serializable id);

	/**
	 * ɾ��ָ������
	 * 
	 * @param obj
	 *            Ҫɾ���Ķ���
	 */
	public void delete(T obj);

	/**
	 * �������еĶ���
	 * 
	 * @return �����б�
	 */
	public List<T> list(String hql);
	/**
	 * ��ȡ��ǰ��������Ӧ������������ݼ�¼
	 * @return
	 */
	public List<T> list();
	
	/**
	 * ���� hql ����ȡ�����б�
	 * 
	 * @param hql
	 *            Ҫִ�� hql ���
	 * @param parms
	 *            �滻 hql �� ? λ�ô���ֵ�����û�� ? ,����Բ���ֵ
	 * @return �����б�
	 */
	public List<T> listByHql(String hql, Object... parms);

	/**
	 * ��ҳ��ѯ����
	 * 
	 * @param hql
	 *            ��ҳ��Ҫ�� hql ���
	 * @param pagenum
	 *            ��ǰҳ
	 * @param pageline
	 *            ÿҳ��ʾ��������¼
	 * @return
	 */
	@Deprecated
	public Pager<T> findPager(String hql, int pagenum, int pageline);

	/**
	 * ��ҳ��ѯ����
	 * 
	 * @param hql
	 * @return
	 */
	public Pager<T> findPager(String hql);
	/**
	 * ���¶��󣬴��кϲ��־û�����Ĺ���
	 * @param obj
	 */
	public void merge(T obj);
}
