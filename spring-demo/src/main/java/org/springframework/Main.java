package org.springframework;

//import com.sun.org.slf4j.internal.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * 标题：${NAME}
 * 说明：${DESC}
 * 时间：${DATE} ${TIME}
 *
 * @author zy
 * @version 1.0.0
 */
public class Main {

	public static void main(String[] args) {
//		Logger log = LoggerFactory.getLogger(Main.class);
		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Object person = classPathXmlApplicationContext.getBean("person");
		System.out.println(person);
//		log.debug("person:{}", person);
		ArrayList<String> strings = new ArrayList<>();
	}
}