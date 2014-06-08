package com.dao;

import com.bean.QiYe;

/**
 * @author 张世超
 *
 */
public interface QiYeDao {
	
	/**
	 * @param userName 登录名
	 * @return QiYe对象
	 */
	public QiYe getTePaiYuanByUserName(String userName);
	
	/**
	 * @param qiye QiYe对象 
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String addQiYe(QiYe qiye);
	
	/**
	 * @param qiye QiYe对象
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String deleteQiYe (QiYe qiye);
	
	/**
	 * @param qiye QiYe对象
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String updataQiYe (QiYe qiye);

}
