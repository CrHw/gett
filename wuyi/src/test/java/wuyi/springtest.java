package wuyi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.IAccountService.IaccountService;

public class springtest {
	@Test
	public void findall() {
		ApplicationContext ax = new ClassPathXmlApplicationContext("bean.xml");
		IaccountService bean = ax.getBean("IaccountImp",IaccountService.class);
		bean.findall();
		
		
	}
	
}
