import java.util.Scanner;

public class problem_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int area = a*a;
        int perimeter = 4*a;
        double diagonal = Math.sqrt(2) * a;
		System.out.println("The area of square is " + area);
		System.out.println("The perimeter of square is " + perimeter);
		System.out.println("The length of diagonal of square is " + a * Math.sqrt(2));
		
		scan.close();
	}

}