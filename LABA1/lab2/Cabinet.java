import java.util.Vector;
public class Cabinet {
	static final int CabinetsСaunt = 5;
	int NumOfCabinets;
	int NumOfSeatsInCabinet;
	String NameOfCabinet;
	String RoomsHead;
	Type type;
	static Vector<Cabinet> cabinets;
	static{
		cabinets = new Vector<Cabinet>();
	}
	{
	    cabinets.add(this);
	    if(cabinets.size()>CabinetsСaunt){
	        System.out.println("Этот кабинет превышает лимит");
	    }
	}
	Cabinet(){
	}
	Cabinet(String NameOfCabinet){
	    this.NameOfCabinet = NameOfCabinet;
	}
	String getName(Cabinet C){
		return NameOfCabinet;
	}
    Cabinet(String NameOfCabinet, int NumOfCabinets){
        this(NameOfCabinet);
        this.NumOfCabinets = NumOfCabinets;
    }
    Cabinet(String NameOfCabinet, int NumOfCabinets, String RoomsHead, int NumOfSeatsInCabinet, Type t){
        this(NameOfCabinet, NumOfCabinets);
        this.RoomsHead = RoomsHead;
        this.NumOfSeatsInCabinet = NumOfSeatsInCabinet;
		this.type = t;
    }	
	
	public String toString(){
	    return NameOfCabinet + " " + NumOfCabinets + " " + RoomsHead + " " + NumOfSeatsInCabinet + " " + type;
	}
	public String toString(Type t){
		if(this.type.equals(t) ){
			return toString();
		}else{
			return "this cabinet not for " + t;
		}
	}
}
