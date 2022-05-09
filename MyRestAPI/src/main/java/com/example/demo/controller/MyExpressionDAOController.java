package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.MyExpressionDAO;
import com.example.demo.service.MyExpression;
import com.example.demo.service.Value;

@RestController
public class MyExpressionDAOController {

	MyExpressionDAO expDao = new MyExpressionDAO();

	@RequestMapping(value="/api/v1/getExpressions",method=RequestMethod.GET)
	public List<MyExpression> getExpression()
	{
		return MyExpressionDAO.getExpressions();
	}

	@RequestMapping(value="/api/v1/expressions",method=RequestMethod.POST)
	public MyExpression setExpression(@RequestBody MyExpression exp)
	{
		return expDao.create(exp);
	}

}
