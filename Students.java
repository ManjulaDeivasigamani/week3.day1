package week3.day1;

public class Students {

	// Week3.day1 assigment4 (overload)
	public static void main(String[] args) {

		Students students = new Students();

		int studentID = students.getStudentInfo(1234);
		String studentEmailPhone = students.getStudentInfo("test1234@gmail.com", "8665473451");

		System.out.println("Studnet ID is: " + studentID);
		System.out.println("Studnet Email ID and Phone Number is: " + studentEmailPhone);
	}
	
 //Create two getStudentInfo method with different data types and arguments
	public int getStudentInfo(int a) {
		return (a);
	}

	public String getStudentInfo(String b, String c) {
		return (b + c);
	}

}
