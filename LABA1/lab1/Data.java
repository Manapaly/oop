public class Data {
	private double LargestDigit = Integer.MIN_VALUE;
	private int NumOfDigits = 0;
	private double SumOfDigits = 0;
	
	Data(){
	}
	public double getLargestDigit(){
		return LargestDigit;
	}
	public int getNumOfDigits(){
		return NumOfDigits;
	}
	public double getSumOfDigits(){
		return SumOfDigits;
	}
	public void AddData(double Digit){
	    if(Digit > LargestDigit){
	        LargestDigit = Digit;
	    }
	    SumOfDigits+=Digit;
	    NumOfDigits++;
	}

	
	
}
