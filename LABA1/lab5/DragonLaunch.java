import java.util.Vector;

public class DragonLaunch {
    static Vector<Person> humans;
    static {
        humans = new Vector<Person>();
    }
    public DragonLaunch(){
    }
    public void kidnap(Person p) {
        humans.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boys = 0, BG = 0;
        for(int i = 0; i < humans.size(); i++) {
            if(humans.get(i).gender == Gender.BOY) {
              boys++;
            }else if(boys > 0) {
              boys--;
              BG++;
            }
        }
        if(BG*2 == humans.size()) {
          return false;
        }else {
          return true;
        }
    }
}