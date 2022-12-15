package variables;
class Student
{
	//Static variable
	public static double fees;
	public static String name="Apsal";
}

public class StaticVar {

	public static void main(String[] args) {
		Student.fees=6666.66;
		System.out.println(Student.name +"Student fees;"+Student.fees);

	}

}
