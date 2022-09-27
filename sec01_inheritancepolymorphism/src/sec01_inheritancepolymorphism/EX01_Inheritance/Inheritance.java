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
	//human 按眉 积己
	Human h = new Human();
	h.name = "锐急";
	h.age = 23;
	h.eat();
	h.sleep();
	
	// student 按眉积己
	Student s = new Student();
	s.name = "绊怕快";
	s.age = 27;
	s.studentID = 126;
	s.eat();
	s.sleep();
	s.goToschool();
	
	//WOKER按眉 积己
	Worker w = new Worker();
	w.name = "壶拱酒";
	w.age= 23;
	w.wokerID = 123;
	w.eat();
	w.sleep();
	w.goTowork();
			
	
	
	}

}
