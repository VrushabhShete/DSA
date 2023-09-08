public class methodchallenge{
	public static void main(String args[]){
		Student s = new Student();
		char student_division = s.calculatedivision(77);
		s.displayrank("Vrushabh", student_division);
		
	}
}

class Student{
	String student_name; int student_score; char division;
	
	void displayrank(String student_name, char division) {
		System.out.println("Student name: "+ student_name + " Division: "+division);
	}
	
	char calculatedivision(int student_score) {
		if (student_score >= 80){
			division = 'A';
			return division;
		}
		else if (student_score >= 60 && student_score < 80)	{
			division = 'B';
			return division;
		}
		else if (student_score >= 40 && student_score < 60){
			division = 'C';
			return division;
		}
		else if (student_score < 40){
			division = 'F';
			return division;
		}
		return 0;
	}
}