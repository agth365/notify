package com.agth.notify.other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * 写日志用拦截器
 * @author xinpeng
 *
 */
public class RecordLogInterceptor implements HandlerInterceptor {
	
	private static Logger logger =  LoggerFactory.getLogger(RecordLogInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse res, Object arg2) throws Exception {
		String uri = request.getRequestURI();
		logger.info("");
		logger.info("===请求-uri==="+uri);

		Enumeration<String> keys = request.getParameterNames();
        while(keys.hasMoreElements()) {
        	String key = keys.nextElement();
        	logger.info("==  {}:{}", key ,request.getParameter(key));
        }
		logger.info("");
		return true;
	}
}
