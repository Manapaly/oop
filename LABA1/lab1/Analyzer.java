public class Analyzer {
	public double Avarage = 0;
	public double Maximum = 0;
	Analyzer(){
	}
	
	public double GetAvarageFromData(Data D){
	    if(D.getLargestDigit()==Integer.MIN_VALUE){
	        return 0;
	    }else{
	        return D.getSumOfDigits()/D.getNumOfDigits();
	    }

	}
	public double GetMaximumFromData(Data D){
	    if(D.getLargestDigit()==Integer.MIN_VALUE){
	        return 0;
	    }else{
	        return D.getLargestDigit();
	    }
	    
	}

}
