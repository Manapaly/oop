package OOP_week5_6.pr1;

public class Person { 
    public String name; 
    public String address; 
    Person(){
    } 
    Person(String name){ 
        this.name = name; 
    } 
    Person(String name, String address){ 
        this(name); 
        this.address = address; 
    } 
    public String getName(String name) { 
        return name; 
    } 
    public String getAddres(String address) { 
        return address; 
    } 
    public void setAddress(String address) { 
        this.address = address; 
    } 
    public String toString() { 
        return name + " " + address; 
    } 
}