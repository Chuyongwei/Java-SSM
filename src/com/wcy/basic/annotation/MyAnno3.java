package com.wcy.basic.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
  	* 元注解：用于描述注解的注解
		* @Target：描述注解能够作用的位置
		* @Retention：描述注解被保留的阶段
		* @Documented：描述注解是否被抽取到api文档中
		* @Inherited：描述注解是否被子类继承
*/
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//表示MyAnno3只能作用在类上
@Retention(RetentionPolicy.RUNTIME)
@Documented//抽取到文档中
@Inherited
public @interface MyAnno3 {
}
