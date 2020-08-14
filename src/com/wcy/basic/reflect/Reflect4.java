package com.wcy.basic.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.wcy.basic.domain.Person;

public class Reflect4 {
	
	public static void main(String[] args) throws Exception {
		Class personClass = Person.class;
		Method eat_method = personClass.getMethod("eat");
		Person p = new Person();
		eat_method.invoke(p);
		
		Method eat_method2 =  personClass.getMethod("eat",String.class);
		eat_method2.invoke(p, "饭");
		System.out.println("-------------------");
		Method[] methods = personClass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
			String name = method.getName();
			System.out.println(name);
//			method.setAccessible(true);// 暴力反射
		}
	}
}
