package com.liu.memento;

import org.junit.Test;

public class Cleint {
	@Test
	public void test() {
		Originator org = new Originator();
		Caretaker care = new Caretaker();
		//�޸�ԭ����״̬
		org.changeState("StateA");
		//�����˴洢��ǰ״̬
		care.setMemento(org.createMemento());
		//�޸�ԭ����״̬
		org.changeState("StateB");
		//ʹ�ø����˴洢��״̬�ָ�ԭ����״̬
		org.setMemento(care.getMemento());
		//��ȡ��ǰ��״̬
		System.out.println(org.createMemento().getState());
	}
}
