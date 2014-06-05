package cn.hsd.hissc.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cn.hsd.hissc.dao.BaseDao;
import cn.hsd.hissc.model.Pager;
import cn.hsd.hissc.util.SystemContext;

@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {
	private SessionFactory sessionFactory;
	/**
	 * 创建一个Class的对象来获取泛型的class
	 */
	private Class<?> clz;
	protected Class<?> getClz() {
		if (clz == null) {
			// 获取泛型的Class对象
			clz = (Class<?>) (((ParameterizedType) (this.getClass()
					.getGenericSuperclass())).getActualTypeArguments()[0]);
		}
		return clz;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(T obj) {
		getSession().save(obj);
	}

	public void update(T obj) {
		getSession().update(obj);
	}

	public T get(Serializable id) {
		return (T) getSession().get(this.getClz(), id);
	}

	public void delete(T obj) {
		getSession().delete(obj);
	}

	public List<T> list(String hql) {
		return getSession().createQuery(hql).list();
	}

	public List<T> listByHql(String hql, Object... parms) {
		Query query = getSession().createQuery(hql);
		if (parms != null && parms.length > 0) {
			for (int i = 0; i < parms.length; i++) {
				query.setParameter(i, parms[i]);
			}
		}
		return query.list();
	}

	@Deprecated
	public Pager<T> findPager(String hql, int pagenum, int pageline) {
		Query query = getSession().createQuery(hql);
		query.setFirstResult((pagenum - 1) * pageline);
		query.setMaxResults(pageline);
		Pager<T> pager = new Pager<T>();
		pager.setPagenum(pagenum);
		pager.setPageline(pageline);
		int count = ((Long) getSession().createQuery("select count(*) " + hql)
				.uniqueResult()).intValue();
		pager.setCount(count);
		pager.setPagesize((int) Math.ceil(count * 1.0 / pageline));
		pager.setDatas(query.list());
		return pager;
	}

	public Pager<T> findPager(String hql) {
		Query query = getSession().createQuery(hql);
		query.setFirstResult((SystemContext.getPagenum() - 1)
				* SystemContext.getPageline());
		query.setMaxResults(SystemContext.getPageline());
		Pager<T> pager = new Pager<T>();
		pager.setPagenum(SystemContext.getPagenum());
		pager.setPageline(SystemContext.getPageline());
		if (hql.startsWith("select")) {
			hql = hql.substring(hql.indexOf("from"));
		}
		int count = ((Long) getSession().createQuery("select count(*) " + hql)
				.uniqueResult()).intValue();
		pager.setCount(count);
		pager.setPagesize((int) Math.ceil(count * 1.0
				/ SystemContext.getPageline()));
		pager.setDatas(query.list());
		return pager;
	}
	
	public Pager<T> findWithoutPager(String hql){
		Query query = getSession().createQuery(hql);
		Pager<T> pager = new Pager<T>();
		pager.setDatas(query.list());
		return pager;
	}

	public List<T> list() {
		return this.list("from " + this.getClz().getName());
	}

	public void merge(T obj) {
		getSession().merge(obj);
	}
}
