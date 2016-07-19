package com.liu.builder;

import org.junit.Test;

public class Client {
	@Test
	public void testBuilder(){
		Director director = new Director();
		//�������ʹ�ò�ͬ��builder
		Product product = director.Construct(new ConcreteBuilder());
		System.out.println(product.toString());
	}
}
