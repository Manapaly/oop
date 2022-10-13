import java.util.*;

public class GradeBook {
	private static Vector<Student> studentsOfCourse;
	Course myCourse;
	static {
		studentsOfCourse = new Vector<>();
	}
	
	GradeBook(){ }
	
	GradeBook(Course c){
		this.myCourse = c;
	}
	
	
	
	public void addToCourse(Student s) {
		studentsOfCourse.add(s);
	}
	
	
	public String displayMessage() {
		return "Welcome to the grade book for " + this.myCourse + "!\nPlease, input grades for the students:\n";
	}
	
	public String displayBarChart() {
		String res = "";
		String[] barChart = {"00-09: ", "10-19: ", "20-29: ", "30-39: ", "40-49: ", "50-59: ", "60-69: ", "70-79: ", "80-89: ", "90-99: ", "100: "};
		for(Student k: studentsOfCourse) {
			barChart[(int)Math.round((int)(k.getGrade() / 10))] += "*";
		}
		
		for(int i = 0; i < barChart.length; i++) {
			res += barChart[i];
			res += '\n';
		}
			
		return "Grades distribution:\n" + res;
	}
		
	public String displayGradeReport() {
		double sum = 0, min = 1e9, max = -1e9;
		Student bestStudent = new Student();
		Student worstStudent = new Student();
		for(Student k: studentsOfCourse) {
			if(k.getGrade() < min) {
				min = k.getGrade();
				worstStudent = k;
			}
			if(k.getGrade() > max) {
				max = k.getGrade();
				bestStudent = k;
			}
			sum += k.getGrade();
		}
		return "\nClass average is " + (sum / studentsOfCourse.size()) + ". Lowest grade is "
		+ worstStudent + "Highest grade is " + bestStudent + "\n";
	}
	
	public String toString() {
		return this.displayGradeReport() + this.displayBarChart();
	}
	
}
