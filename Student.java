package week1.day1;

public class Student {

String name="riyana";
int rollNo=133122;
public void college(String name) {
	System.out.println(name);
}

private void collegeName(String collegeName) {
	System.out.println(collegeName);
	
}

public static void main(String []args) {
	Student Student=new Student();
	Student.collegeName("PEC");
	Student.Dept("EEE");

	
}

private void Dept(String string) {
	// TODO Auto-generated method stub
	
}
}
