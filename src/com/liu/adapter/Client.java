package com.liu.adapter;

import org.junit.Test;

public class Client {
	@Test
	public void test(){
		Adaptee adaptee = new ConcreteAdaptee();
		//ʹ��adaptee����adapter���ͱ���
		INeedAAdapter(new Adapter(adaptee));
		
	}
	//���Է���
	public void INeedAAdapter(Target target){
		target.request();
	}
}
