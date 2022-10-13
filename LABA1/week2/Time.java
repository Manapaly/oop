public class Time {
	public int hour;
	public int minute;
	public int second;
	
	Time(){}
	
	Time(int hour){
		this.hour = hour;
	}

	Time(int hour, int minute){
		this(hour);
		this.minute = minute;
	}
	Time(int hour, int minute, int second){
		this(hour,minute);
		this.second = second;
	}
	
	public  void setHour(int hour) {
		this.hour = hour;
	}
	public  void setMinute(int minute) {
		this.minute = minute;
	}
	public  void setSecond(int second) {
		this.second = second;
	}
	public void fixTime(){
	    if(second > 59){
	        minute += second / 60;
	        hour += minute / 60;
	        minute = minute % 60;
	        second = second % 60;
	    }else if(minute > 59){
	        hour += minute / 60;
	        minute = minute % 60;
	    }else if(hour > 23){
	        hour = hour % 24;
	    }
	}
	public  String Universal() {			
		String h = String.valueOf(this.hour), m = String.valueOf(this.minute), s = String.valueOf(this.second);
	
		if(hour < 10)
			h = "0" + h;
		if(minute < 10)
			m = "0" + m;
		if(second < 10)
			s = "0" + s;
		
		return h + ":" + m + ":" + s;
	}
	
	public  String Standard() {
		String mode;
		
		if(hour < 12) {
			mode = "AM";
		}	
		else if(hour == 12 && minute == 0 && second == 0) {
				mode = " AM";
		} else {
			mode = " PM";
			hour -= 12;
		}
			
		String h = String.valueOf(hour), m = String.valueOf(minute), s = String.valueOf(second);

		if(hour < 10){
		    h = "0" + h;
		}
		if(minute < 10){
		    m = "0" + m;
		}
		if(second < 10){
		    s = "0" + s;
		}	
		
		return h + ":" + m + ":" + s + " " + mode;
	}
	

	
	public void add(Time new_t) {
		int last_h = this.hour += new_t.hour;
		int last_m = this.minute += new_t.minute;
		int last_s = this.second += new_t.second;

	}
}