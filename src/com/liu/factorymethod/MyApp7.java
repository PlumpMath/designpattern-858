package com.liu.factorymethod;

public class MyApp7 {
	//�����ģ�����������<T extends YourBaseEntity>
	public static <T> T getInstance(Class<T> clz) throws Exception{
		T obj = null;
		try {
			obj = clz.newInstance();
		} catch (Exception e) {
			throw new Exception("Can't instance: "+clz.getName());
		}
		return obj;
	}
}
