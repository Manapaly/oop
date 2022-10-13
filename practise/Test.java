package OOP_week5_6.pr1;
import java.util.Vector;
import java.util.Scanner;
 
public class Test { 
    public static void main (String[] args) { 
        Scanner input = new Scanner(System.in); 
        Vector <Person> people = new Vector<Person>(); 
        
        while (true) { 
            System.out.println("If you want to print information about all added people, type 1.\nIf you want to add a new person, type 2.Type Q to exit."); 
            String str = input.nextLine(); 
            if(str.equals("Q")) { 
                break; 
            } 
            int oper = Integer.parseInt(str); 
            if(oper == 1) { 
                for(Person p: people) { 
                    System.out.println("\n" + p.toString() + "\n"); 
                } 
                
            } else if(oper == 2) { 
                System.out.println("Please write the number of the person you want to add.\nPerson - 1\nStudent - 2\nStaff - 3\nType Q for exit."); 
                String str2 = input.nextLine(); 
                if(str2.equals("Q")){ 
                    break; 
                } 
                int oper2 = Integer.parseInt(str2); 
                if(oper2 == 1) { 
                    System.out.print("Name of the person: "); 
                    String name = input.nextLine(); 
                    System.out.print("Address of the person: "); 
                    String address = input.nextLine(); 
                    Person p = new Person(name, address); 
                    people.add(p); 
                } else if(oper2 == 2) { 
                    System.out.print("Name of the student: "); 
                    String name = input.nextLine(); 
                    System.out.print("Address of the student: "); 
                    String address = input.nextLine(); 
                    System.out.print("Program of the student: "); 
                    String program = input.nextLine(); 
                    System.out.print("Year of the student: "); 
                    int year = input.nextInt(); 
                    System.out.print("Fee of the student: "); 
                    double fee = input.nextDouble(); 
                    Student s = new Student(name, address, program, year, fee); 
                    people.add(s); 
                } else if(oper2 == 3) { 
                    System.out.print("Name of the staff: "); 
                    String name = input.nextLine(); 
                    System.out.print("Address of the staff: "); 
                    String address = input.nextLine(); 
                    System.out.print("School of the staff: "); 
                    String school = input.nextLine(); 
                    System.out.print("Pay  of the staff: "); 
                    double pay = input.nextDouble(); 
                    Staff st = new Staff(name, address, school, pay); 
                    people.add(st); 
                } 
            } 
        } 
    input.close(); 
    } 
} 
        
