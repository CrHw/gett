package com.itheima.IAccountService.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.IAccountDao.IAccountDao;
import com.itheima.IAccountService.IaccountService;
import com.itheima.domain.Account;

@Service("IaccountImp")
public class IaccountserImp implements IaccountService {
	@Autowired
	private IAccountDao dao;
	@Override
	public List<Account> findall() {
		System.out.println("这个是可以的");
		return dao.findall();
		
		
	}

	@Override
	public void save(Account account) {
		dao.save(account);
	}

	@Override
	public Account findById(Integer accountId) {
		return dao.findById(accountId);
	}

}
