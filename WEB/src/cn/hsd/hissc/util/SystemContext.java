package cn.hsd.hissc.util;

public class SystemContext {
	private static ThreadLocal<Integer> pagenum = new ThreadLocal<Integer>();
	private static ThreadLocal<Integer> pageline = new ThreadLocal<Integer>();

	public static int getPagenum() {
		return pagenum.get();
	}

	public static void setPagenum(int _pagenum) {
		pagenum.set(_pagenum);
	}

	public static void removePagenum() {
		pagenum.remove();
	}

	public static int getPageline() {
		return pageline.get();
	}

	public static void setPageline(int _pageline) {
		pageline.set(_pageline);
	}

	public static void removePageline() {
		pageline.remove();
	}
}
