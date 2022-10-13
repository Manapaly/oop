public class Student {
	private String name;
	private int id;
	public int year;
	private double grade;
	static int cnt;
	
	{
		this.id = ++cnt;
	}
	
	public Student() { }
	public Student(String name){
		this.name = name;
		this.year = 1;
	}
	public String getName() {
		return this.name;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	public int getId() {
		return this.id;
	}
	public void increment() {
		this.year++;
	}
	
	public String toString() {
		return this.grade + " (Student " + this.name + ", id: " + this.id + ")\n";
	}
	
}