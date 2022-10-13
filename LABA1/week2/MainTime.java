import java.util.Scanner;

public class MainTime {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Time t1 = new Time(scan.nextInt(), scan.nextInt(), scan.nextInt());	
		t1.fixTime();


// 		Time t2 = new Time(15,98,62);
        Time t2 = new Time();
		
		t2.setHour(15);
		t2.setMinute(98);
		t2.setSecond(62);
		System.out.println(t1.Standard());
		System.out.println(t2.Universal());
		t1.add(t2);
		t1.fixTime();
// 		t2.setTime();
		
		System.out.println(t1.Standard());
		System.out.println(t2.Universal());
	}
}