package com.wcy.basic.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.wcy.basic.domain.Person;

public class Reflect3 {
	
	public static void main(String[] args) throws Exception {
		Class personClass = Person.class;
		Field[] fields = personClass.getFields();
		Constructor constructor = personClass.getConstructor(String.class,int.class);
		System.out.println(constructor);
		//构造
		Object person = constructor.newInstance("张三",23);
		System.out.println(person);
		System.out.println("===========");
		//构造
		Constructor constructor1 = personClass.getConstructor();
		System.out.println(constructor1);
		//构造
		Object person1 = constructor1.newInstance();
		System.out.println(person1);
		Object o = personClass.newInstance();
		System.out.println(o);
	}
}
