package sec02_typecasting.EX01_Typecasting_1;

/*Ŭ������ ��ĳ���� �� �ٿ�ĳ����*/

//# Ŭ������ ��Ӱ���
class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting_1 {
	public static void main(String[] args) {		
		//#1. ��ĳ���� (�ڵ���ȯ): ������ �����Ϸ��� �ڵ� �߰�
		A ac = (A)new C(); // C->A ��ĳ���� (�ڵ���ȯ)
		B bc = (B)new C(); // C->B ��ĳ���� (�ڵ���ȯ)
		
		B bb = new B();
		A a = (A)bb; //B->A ��ĳ���� (�ڵ���ȯ)
		
		//#2-1. �ٿ�ĳ���� (������ȯ) : ĳ������ �Ұ����� ��� (����� ���ܹ߻�)
		A aa = new A();
//		B b = (B)aa; //A->B �ٿ�ĳ���� (������ȯ)
//		C c = (C)aa; //A->C �ٿ�ĳ���� (������ȯ)
		
		//#2-2. �ٿ�ĳ���� (������ȯ) : ĳ������ ������ ��� 
		A ab = new B();
		B b = (B)ab; //A->B �ٿ�ĳ���� (������ȯ)
//		C c = (C)ab; //A->C �ٿ�ĳ���� (������ȯ) : �Ұ���
		
		B bd = new D();
		D d = (D)bd; //B->D �ٿ�ĳ���� (������ȯ)
		
		A ad = new D();
		B b1 = (B)ad; //A->B �ٿ�ĳ���� (������ȯ)
		D d1 = (D)ad; //A->D �ٿ�ĳ���� (������ȯ)				
	}
}
