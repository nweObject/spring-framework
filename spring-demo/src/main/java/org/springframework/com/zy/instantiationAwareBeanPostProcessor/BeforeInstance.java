package org.springframework.com.zy.instantiationAwareBeanPostProcessor;

import org.springframework.stereotype.Component;

/**
 * 标题：
 * 说明：
 * 时间：2024/12/9 17:08
 *
 * @author zy
 * @version 1.0.0
 */
//@Component
public class BeforeInstance {

	public void doSomeThing() {
		System.out.println("doSomeThing");
	}
}
