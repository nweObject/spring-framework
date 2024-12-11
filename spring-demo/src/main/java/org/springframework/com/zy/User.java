package org.springframework.com.zy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 标题：User
 * 说明：
 * 时间：2024/10/31 21:42
 *
 * @author zy
 * @version 1.0.0
 */
@Component
public class User extends Person {

	private String userName;

	private Integer age;

	@Autowired
	private Person person;


	public User() {
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
