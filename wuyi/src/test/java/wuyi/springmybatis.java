package wuyi;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.IAccountService.IaccountService;
import com.itheima.domain.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class springmybatis {
	@Autowired
	private IaccountService IaccountImp;
	
	@Test
	public void findall() {
		List<Account> findall = IaccountImp.findall();
		for(Account a:findall) {
			System.out.println(a);
		}
		
		
	}
}
