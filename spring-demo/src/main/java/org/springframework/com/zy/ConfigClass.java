package org.springframework.com.zy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 标题：ConfigClass
 * 说明：
 * 时间：2024/12/6 17:22
 *
 * @author zy
 * @version 1.0.0
 */
//@Configuration
public class ConfigClass {

//	@Bean
	public ConfigTest configTest() {
		return new ConfigTest();
	}
}
