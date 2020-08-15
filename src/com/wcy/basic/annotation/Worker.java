package com.wcy.basic.annotation;

@MyAnno(show1 = 1,anno2 = @MyAnno2,strs = {"abc","bbb"})
@MyAnno3
public class Worker {
	
	@MyAnno3
	public String name = "aaa";
	
	@MyAnno3
	public void show() {
		// TODO Auto-generated method stub

	}
}
