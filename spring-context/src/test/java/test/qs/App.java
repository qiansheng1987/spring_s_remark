package test.qs;

import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:<p></p>
 *
 * @author sheng.qian01@ucarinc.com
 * @version V1.0
 * @date 2019/9/18 10:42
 */
public class App {

	@Test
	public void testAop() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop/aop.xml");
		Dao dao = (Dao)ac.getBean("daoImpl");
		dao.select();
	}
}
