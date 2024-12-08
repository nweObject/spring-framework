package org.springframework.com.zy;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 标题：MyFactoryBean
 * 说明：
 * 时间：2024/12/8 20:43
 *
 * @author zy
 * @version 1.0.0
 */
@Component
public class MyFactoryBean implements FactoryBean<FBTest> {
	@Override
	public FBTest getObject() throws Exception {
		return new FBTest();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
