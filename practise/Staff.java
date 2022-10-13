package OOP_week5_6.pr1;
public class Staff extends Person 
{ 
    
        private String school; 
        private double pay; 
        
        Staff(){}  
        
        public Staff(String name, String address){ 
            super(name, address); 
        } 
        public Staff(String name, String address, String school) { 
            super(name, address); 
            this.school = school; 
        } 
        public Staff(String name, String address, String school, double pay) { 
            this(name, address, school); 
            this.pay = pay; 
        } 
        public String getSchool(String school) { 
            return school; 
        } 
        public void setSchool(String school) { 
            this.school = school; 
        } 
        public double getPay(double pay) { 
            return pay; 
        } 
        public void setPay(double pay) { 
            this.pay = pay; 
        } 
        public String toString() { 
            return name + " " + address + " " + school + " " + pay; 
        } 
    
}
