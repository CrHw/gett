package com.itheima.IAccountDao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itheima.domain.Account;

@Repository
public interface IAccountDao {
	
	@Select("select * from account")
	List<Account> findall();
	
	@Insert ("insert into account(name,money) values(#{name},#{money})")
	void save(Account account);
	
	@Select("select * from account where id=#{accountid}")
	Account findById(Integer accountId);

}
