package sec04_overlapmember.EX02_OverlapStaticField;

/*���� �ʵ��� �ߺ�*/

class A {
	static int m = 3;
}
class B extends A {
	static int m = 4;
}
public class OverlapStaticField {
	public static void main(String[] args) {		
		//#1.Ŭ���� �̸����� �ٷ� ����
		System.out.println(A.m); //3
		System.out.println(B.m); //4
		System.out.println();
		
		//#2.��ü ����
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//#3. ��ü ������ ���� static field
		System.out.println(aa.m); //3		
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3
	}
}
