package cn.hsd.hissc.model;

import java.util.List;

/**
 * 专门用来封装分页信息的对象 
 * 
 * @param <T>
 */
public class Pager<T> {
	// 当前页
	private int pagenum = 1;
	// 每页显示多少条记录
	private int pageline = 10;
	// 总记录数
	private int count;
	// 共有多少页
	private int pagesize;
	// 分页查询到的数据集
	private List<T> datas;

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	public int getPageline() {
		return pageline;
	}

	public void setPageline(int pageline) {
		this.pageline = pageline;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
}
