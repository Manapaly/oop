import java.util.Scanner;

public class MainStudent{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Student s1 = new Student("Ernat", 2025);	
		
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getYear());
        s1.Increment_year(15);
        s1.print();

 		Student s2 = new Student();
		
	}
}
