package com.wcy.basic.reflect;

import java.lang.reflect.Field;

import com.wcy.basic.domain.Person;

public class Reflect2 {
	public static void main(String[] args) throws Exception {
		Class personClass = Person.class;
		Field[] fields = personClass.getFields();
		//获取public的变量
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("=========");
		//获取某个变量
		java.lang.reflect.Field a = personClass.getField("a");
		Person p = new Person();
		Object value = a.get(p);
		System.out.println(value);
		//设置a变量
		a.set(p, "张三");
		System.out.println(a.get(p));
		System.out.println("=========");
		//获取所有的变量
		Field[] declared = personClass.getDeclaredFields();
		for (Field field : declared) {
			System.out.println(field);
		}
		Field d= personClass.getDeclaredField("d");
		d.setAccessible(true);//暴力反射
		Object value2 = d.get(p);
		System.out.println(value2);
	}
}
