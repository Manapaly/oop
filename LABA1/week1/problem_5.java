import java.util.Scanner;

public class problem_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int starts_sum = scan.nextInt();
		int percent = scan.nextInt();
        double konechii = starts_sum + (starts_sum*percent)/100;
		System.out.println("Teper v vashem schete " + konechii );

		
		scan.close();
	}

}