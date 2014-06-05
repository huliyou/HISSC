package cn.hsd.hissc.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PagerFilter implements Filter {
	private int pageline;
	public void destroy() {

	}
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		try {
			String pagen = request.getParameter("pagenum");
			String pageln = request.getParameter("pageline");
			int pagenum = 1;
			if (pagen != null && !"".equals(pagen.trim())) {
				pagenum = Integer.parseInt(pagen);
			}
			if (pageln != null && !"".equals(pageln.trim())) {
				pageline = Integer.parseInt(pageln);
			}
			SystemContext.setPagenum(pagenum);
			SystemContext.setPageline(pageline);
			chain.doFilter(request, response);
		} finally {
			SystemContext.removePagenum();
			SystemContext.removePageline();
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		pageline = Integer.parseInt(fConfig.getInitParameter("pageline"));
	}
}
