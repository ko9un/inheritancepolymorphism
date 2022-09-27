package sec03_methodoverriding.EX02_MethodOverriding_2;

/*�޼��� �������̵��� ��ǥ�� ����*/

class Animal {
	void cry() {}
}
class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("±±");
	}
}
class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

public class MethodOverriding_2 {
	public static void main(String[] args) {		
		//#1. ������ Ÿ������ ���� + ������ Ÿ������ ����
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		//#2. Animal Ÿ������ ���� + �ڽ�Ŭ���� Ÿ������ ����
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();		
		ab.cry();
		ac.cry();
		ad.cry();		
		System.out.println();
		
		//#3. �迭�� ����
		Animal[] animals = {ab, ac, ad};
		for(Animal animal : animals) {
			animal.cry();
		}
	}
}





























