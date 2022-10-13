package OOP_week5_6.pr1;

public class Student extends Person { 
    private String program; 
    private int year; 
    private double fee; 
     
    Student(){ } 
     
    Student(String name){ 
        super(name); 
    } 
    Student(String name, String address){ 
        super(name, address); 
    } 
    Student(String name, String address, String program){ 
        super(name, address); 
        this.program = program; 
    } 
    Student(String name, String address, String program, int year){ 
        this(name, address, program); 
        this.year = year; 
    } 
    Student(String name, String address, String program, int year, double fee){ 
        this(name, address, program, year); 
        this.fee = fee; 
    } 
    public String getProgram(String program) { 
        return program; 
    } 
    public void setProgram(String program) { 
        this.program = program; 
    } 
    public int getYear(int year) { 
        return year; 
    } 
    public void setYear(int year) { 
        this.year = year; 
    } 
    public double getFee(double fee) { 
        return fee; 
    } 
    public void setFee(double fee) { 
        this.fee = fee; 
    } 
    public String toString() { 
        return name + " " + address + " " + program + " " + year + " " + fee;   
    } 
   }
