package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.service.MyExpression;

public class MyExpressionDAO {

	private static List<MyExpression> exp;
	public MyExpressionDAO() {
		exp = new ArrayList<>();

		MyExpression exp1 = new MyExpression();
		exp1.setName("calories");
		exp1.setExpression("4*Carbohydrates+9*Fat+4*Protein");

		MyExpression exp2 = new MyExpression();
		exp2.setName("bmi");
		exp2.setExpression("WeightKG/(HeightM * 2)");
		
		MyExpression exp3 = new MyExpression();
		exp3.setName("hypotenuse");
		exp3.setExpression("(a*a)+(2*a*b)+(b*b)");

		exp.add(exp1);
		exp.add(exp2);
		exp.add(exp3);
	}


	public static List<MyExpression> getExpressions()
	{
		return exp;
	}
	public MyExpression getExpression(String name) {

		for(MyExpression item : exp) 
		{
			if(item.getName().equals(name))
			{
				return item;
			}
		}
		return new MyExpression();
	}

	public MyExpression create(MyExpression e) 
	{
		MyExpression exp1 = new MyExpression();
		exp1.setName(e.getName());
		exp1.setExpression(e.getExpression());
		exp.add(exp1);
		return exp1;
	}
}
