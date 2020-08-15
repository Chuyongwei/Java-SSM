package com.wcy.basic.annotation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import com.wcy.basic.domain.Person;

@Pro(className = "com.wcy.basic.annotation.Demo1",methodName = "show")
public class ReflectTest {
	public static void main(String[] args) throws Exception {
		//可以创建任意类的对象，可以执行任意方法
		//前提：不能改变任何带你吗，可以创建任意对象，任意方法
		//1.加载文件
		//1.1获取该类的字节码文件对象
		Class<ReflectTest> reflectTestClass = ReflectTest.class;
		//其实就是在内存中生成了一个该注解接口的子类实现对象
		Pro an = reflectTestClass.getAnnotation(Pro.class);
		//2.获取配置文件中定义的数据
		String className = an.className();
		String methodName = an.methodName();
		//3.加载该类内存
		Class cls = Class.forName(className);
		//4.创建对象
		Object obj = cls.newInstance();
		//5.获取方法对象
		Method method= cls.getMethod(methodName);
		//6.执行方法
		method.invoke(obj);
	}
}
