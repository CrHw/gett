package com.itheima.IAccountService;

import java.util.List;

import com.itheima.domain.Account;

public interface IaccountService {
	
	List<Account>findall();
	
	void save(Account account);
	
	Account findById(Integer accountId);
	
}
