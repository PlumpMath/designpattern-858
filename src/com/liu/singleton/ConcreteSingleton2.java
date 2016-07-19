package com.liu.singleton;

import org.junit.Test;

public class ConcreteSingleton2 extends Singleton2{
	public ConcreteSingleton2(){
		register("ConcreteSingleton2", this);
	}
	
	@Test
	public void test(){
		//��ʼ��ʱ������ô��
		new ConcreteSingleton2();
		System.setProperty("SINGLETON", "ConcreteSingleton2");
		//ʵ��ʹ��ʱ
		Singleton2 s = Singleton2.getInstance();
		System.out.println(s);;
	}
}
