package com.liu.builder;

public class Director {
	public Product Construct(Builder builder){
		builder.buildPart();//����ǰ�Ĳ���
		return builder.getResult();
	}
}
