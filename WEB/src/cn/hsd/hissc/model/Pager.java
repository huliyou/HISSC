package cn.hsd.hissc.model;

import java.util.List;

/**
 * ר��������װ��ҳ��Ϣ�Ķ��� 
 * 
 * @param <T>
 */
public class Pager<T> {
	// ��ǰҳ
	private int pagenum = 1;
	// ÿҳ��ʾ��������¼
	private int pageline = 10;
	// �ܼ�¼��
	private int count;
	// ���ж���ҳ
	private int pagesize;
	// ��ҳ��ѯ�������ݼ�
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
