import java.util.Scanner;

public class problem_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double D = b*b - 4*a*c;
        
        if(D<0){
            System.out.println("D is negative, error");
        }else{
            double x1 = (b + Math.sqrt(D))/(2*a);
            double x2 = (b - Math.sqrt(D))/(2*a);
            System.out.println("The roots of quadratic equation are " + x1 + " and " + x2);
        }
	}

}