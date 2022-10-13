import java.util.*;

public class TestDragon{
  public static void main(String[] args) {  
    Scanner in = new Scanner(System.in);

    String s = in.nextLine();
    DragonLaunch d = new DragonLaunch();
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'B') {
        d.kidnap(new Person(Gender.BOY));
      }else{
        d.kidnap(new Person(Gender.GIRL));
      }
    }
    if(d.willDragonEatOrNot()) {
      System.out.println("Eat");
    }
    else System.out.println("No eat");
  }
}
