package sec01_inheritancepolymorphism.EX01_Inheritance;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep(){}
}
class Student extends Human{
	int studentID;
	void goToschool(){}
}
class Worker extends Human{
	int wokerID;
	void goTowork() {}
	
}


public class Inheritance {
	public static void main(String[] args) {
	//human ��ü ����
	Human h = new Human();
	h.name = "��";
	h.age = 23;
	h.eat();
	h.sleep();
	
	// student ��ü����
	Student s = new Student();
	s.name = "���¿�";
	s.age = 27;
	s.studentID = 126;
	s.eat();
	s.sleep();
	s.goToschool();
	
	//WOKER��ü ����
	Worker w = new Worker();
	w.name = "������";
	w.age= 23;
	w.wokerID = 123;
	w.eat();
	w.sleep();
	w.goTowork();
			
	
	
	}

}
