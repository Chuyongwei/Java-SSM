package com.wcy.basic.annotation;

import java.util.Date;

/**
 * 
 * @author Administrator
 * @version 1.0
 * @since 1.5
 *
 */
//@SuppressWarnings("all")
public class AnnoDemo2 {
	/**
	 * 计算两数的和
	 * @param a 整数
	 * @param b 整数
	 * @return 两数的和
	 */
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Deprecated
	public void show1() {
		//有缺陷
	}
	
	
	public void show2() {
		//替代show1方法
	}
	
	@SuppressWarnings("all") //压制全部警告
	public void demo() {
		show1();
		Date date = new Date();
	}
}

