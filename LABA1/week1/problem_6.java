import java.util.Scanner;

public class problem_6 {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
        String s2 = reverseString(s);

        if(s.equals(s2)){
            System.out.println("This word is polindrome");
        }else{
            System.out.println("This is not polindrome");
        }
	}

}