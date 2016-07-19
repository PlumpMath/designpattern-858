package com.liu.factorymethod;

public class TestMain {

	//test����
	public static void testMyApp1(){
		Application app = new MyApp1();//����app��Ϊ�ͻ���
		app.openDocument();
	}
	//test����
	public static void testMyApp2(){
		Application2 app = new MyApp2();//����app��Ϊ�ͻ���
		app.openDocument("mydoc");
		app.openDocument("yourdoc");
	}
	//test����
	public static void testMyApp3(){
		MyApp3 factory = new MyApp3();
		Document doc = factory.createDocument("mydoc");
		doc.open();
	}
	//test����
	public static void testMyApp4(){
		MyApp4 factory = new MyApp4();
		Document doc = factory.createDefaultDocument();
		doc.open();
	}
	//test����
	public static void testMyApp5(){
		Document doc = MyApp5.createDefaultDocument();
		doc.open();
	}
	//test����
	public static void testMyApp6(){
		Document doc = (Document)MyApp6.createDefaultDocument(DefaultDocument.class.getName());
		doc.open();
	}
	//test����
	public static void testMyApp7(){
		Document doc = null;
		try {
			doc = MyApp7.getInstance(DefaultDocument.class);
			doc.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		testMyApp1();
		testMyApp2();
		testMyApp3();
		testMyApp4();
		testMyApp5();
		testMyApp6();
		testMyApp7();
	}
}
