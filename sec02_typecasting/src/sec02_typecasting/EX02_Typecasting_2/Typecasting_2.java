package sec02_typecasting.EX02_Typecasting_2;

/*����Ÿ�Կ� ���� ��밡���� ���*/

class A {
	int m=3;
	void abc() {
		System.out.println("A Ŭ����");
	}
}
class B extends A {
	int n=4;
	void bcd() {
		System.out.println("B Ŭ����");
	}
}
public class Typecasting_2 {
	public static void main(String[] args) {		
		//#1. A Ÿ��   / A ������
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		//#2. B Ÿ�� / B ������
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		//#3. A Ÿ�� / B ������ : ������ ǥ��
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();
	}
}


















