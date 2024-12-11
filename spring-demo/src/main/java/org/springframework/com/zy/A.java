package org.springframework.com.zy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 标题：A
 * 说明：
 * 时间：2024/12/4 19:52
 *
 * @author zy
 * @version 1.0.0
 */
//@Component
public class A implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
