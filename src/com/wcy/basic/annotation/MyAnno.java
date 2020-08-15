package com.wcy.basic.annotation;

public @interface MyAnno {
//	String value();
	int show1();
	String name() default "张三";
	MyAnno2 anno2();
//	String show2();
//	Person per();
	String[] strs();

}
