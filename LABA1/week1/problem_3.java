import java.util.Scanner;

public class problem_3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
        if(95 <= n && n <= 100) System.out.print("A");
        else if(90 <= n) System.out.print("A-");
        else if(85 <= n) System.out.print("B+");
        else if(80 <= n) System.out.print("B");
        else if(75 <= n) System.out.print("B-");
        else if(70 <= n) System.out.print("C+");
        else if(65 <= n) System.out.print("C");
        else if(60 <= n) System.out.print("C-");
        else if(55 <= n) System.out.print("D+");
        else if(50 <= n) System.out.print("D");
        else if(n <= 50) System.out.print("F");
  }
}