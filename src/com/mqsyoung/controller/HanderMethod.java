package com.mqsyoung.controller;

import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mqsyoung.bean.User;



@Controller
public class HanderMethod {

	private static final String SUCCESS ="success";
	
	
	@RequestMapping("/getUserJson")
	@ResponseBody
	public User  getUserJson(){
		User user = new User();
		user.setDate(new Date());
		user.setEmail("12@11.com");
		user.setLastname("sdfghjk");
		
		
		return user;
	}
	
	@RequestMapping(value="testFormPost" ,method=RequestMethod.POST)
	public String testFormPost(@Valid User user , Errors error){
		
		if(error.hasErrors()){
			System.out.println("cuole");
			
			return "forward:/form.jsp";
		}
		//User user =(User) request.getAttribute("command");
		
		System.out.println(user);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testform" , method=RequestMethod.GET)
	public String testForm(Map<String , Object> map){
		
		 map.put("user", new User());
		
		System.out.println("testform");
		
		return "forward:/form.jsp";
	}
			
	
	/**
	 * redirect �ض���  1�� redirect �Ƿ���������߼�������һ��״̬�� �� 
	 *                  �������������ȥ�����Ǹ���ַ������������ĵ�ַ��ʾ�����µ�url
	 * @return
	 */
	@RequestMapping("/testredirect")
	public String testredirect(){
		
		System.out.println("testredirect");
		return "redirect:/user.jsp";
	}
	
	
	/**
	 *  forward  ת�� �� 1���Ƿ����� ������Դ�� ������ֱ�ӷ���Ŀ���ַ��url,��ȡurl ��Ӧ�����ݣ�Ȼ��������ٷ����������
	 *              �������֪�����������Ļ�ȡ������ �� ����������ĵ�ַ����仯
	 *                2�� forward ת��ҳ�� �� ת������ҳ����Թ���request ��������
	 * @return
	 */
	@RequestMapping("/testforward")
	public String testforward(){
		System.out.println("testforward");
		
		return "forward:/WEB-INF/success1.jsp";
	}
	
}
