public class Student {
	private String name;
	private int id=10001;
	private int year_of_study;
	
	{
        id++;
    }
	Student(){
    }
	Student(String name){
		this.name = name;
	}

	Student(String name, int year){
		this(name);
		this.year_of_study = year;
	}
	public  String getName(){
        return this.name;
    }
	public  int getId(){
        return this.id;
    }
    public  int getYear(){
        return this.year_of_study;
    }
	public  void Increment_year(int year) {
		this.year_of_study += year;
	}
	public  void print() {
		System.out.println(this.getName() + " " + this.getId() + " " +this.getYear());
	}
	
}
