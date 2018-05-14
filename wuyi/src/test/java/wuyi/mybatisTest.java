package wuyi;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itheima.IAccountDao.IAccountDao;
import com.itheima.domain.Account;

public class mybatisTest {
	public static void main(String[] args) throws IOException {
		
		InputStream in = Resources.getResourceAsStream("SqlMapconfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		SqlSession op = factory.openSession();
		IAccountDao mapper = op.getMapper(IAccountDao.class);
		List<Account> findall = mapper.findall();
		for(Account a:findall) {
			System.out.println(a);
			
			
		}
		
	}
}
