package ConstuctorEx;

public class main {
	String studentName;
	int studentAge;
	//constructor
	main(String name, int age) {
		studentName = name;
		studentAge = age;
		age=16;
	}
    void display() {
    	System.out.println(studentName+" "+studentAge);
    }
	public static void main(String[] args) {
		main myObj = new main("Apsal" , 60);
		myObj.display();

	}

}
