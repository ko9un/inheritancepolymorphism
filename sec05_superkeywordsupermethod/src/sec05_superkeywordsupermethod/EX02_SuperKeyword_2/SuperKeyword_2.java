package sec05_superkeywordsupermethod.EX02_SuperKeyword_2;

/*����տ� super Ű���带 ����� ����� �޼��� ȣ��*/

class A {
	void abc() {
		System.out.println("A Ŭ������ abc()");
	}
}
class B extends A{	
	void abc() {
		System.out.println("B Ŭ������ abc()");
	}
	void bcd() {
		super.abc(); //super.abc() : �θ�Ŭ���� ��ü�� abc() �޼��� ȣ��;
	}
}
public class SuperKeyword_2 {
	public static void main(String[] args) {
		//#1. ��ü ����
		B bb = new B();
		
		//#2. �޼��� ȣ��
		bb.bcd(); //A Ŭ������ abc()
	}
}
