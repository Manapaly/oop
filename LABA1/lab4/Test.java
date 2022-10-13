
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Course webka = new Course("INFT2205", "Web Development", "CSCI2104", 6);
		GradeBook book = new GradeBook(webka);
		Scanner sc = new Scanner(System.in);
		System.out.println(book.displayMessage());
		for(int i = 0; i < 5; i++) {
			Student tmp = new Student(Character.toString(i + 65));
			System.out.print("Student " + tmp.getName() + ": ");
			tmp.setGrade(sc.nextDouble());
			book.addToCourse(tmp);
		}
		System.out.println(book);
		sc.close();
		
	}

}
