package com.dao;

import com.bean.TePaiYuan;

/**
 * @author 张世超
 *
 */
public interface TePaiYuanDao {
	/**
	 * 根据登录名获取对象
	 * @param userName 想要获取的特派员的登录名
	 * @return TePaiYuan对象
	 */
	public TePaiYuan getTePaiYuanByUserName(String userName);
	
	/**
	 * 添加 特派员
	 * @param tepaiyuan 要添加的tepaiyuan对象
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String addTePaiYuan (TePaiYuan tepaiyuan);
	
	/**
	 * 删除 特派员
	 * @param tepaiyuan 要删除的tepaiyuan对象
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String deleteTePaiYuan (TePaiYuan tepaiyuan);
	
	/**
	 * 修改 特派员
	 * @param tepaiyuan 修改好的tepaiyuan对象
	 * @return 字符串，返回success表示成功 返回fail表示失败
	 */
	public String updataTePaiYuan (TePaiYuan tepaiyuan);
	
}
