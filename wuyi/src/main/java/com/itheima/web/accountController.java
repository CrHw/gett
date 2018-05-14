package com.itheima.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.IAccountService.IaccountService;
import com.itheima.domain.Account;
@Controller()
@RequestMapping("account/")
public class accountController {
	@Autowired
	private IaccountService ser;
	
	@RequestMapping("findall")
	public ModelAndView findall() {
		
		List<Account> findall = ser.findall();
		ModelAndView md = new ModelAndView();
		md.setViewName("userlist");
		md.addObject("list", findall);
		return md;
		
		
	}
}
