package file;

public class Learner {
	 
		int rollno;
		String name;
		static String institution = "Edubridge";
		Learner (int r,String n) {
			rollno = r;
			name =n;
		}
	
	void display () {
		System.out.println(rollno+" "+name+" "+institution);
	}

	public static void main(String[] args) {
		Learner l1 = new Learner(666,"Apsal");
		Learner l2 = new Learner(777,"Rohini");
		l1.display();
		l2.display();
		

	}

}
