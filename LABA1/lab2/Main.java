
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Cabinet C1 = new Cabinet("OOP_CLASS",269, "Pakita", 32, Type.PRATICE);
	    Cabinet C2 = new Cabinet("ADS_CLASS",465, "BEISENBEK", 98, Type.LECTURE);
	    Cabinet C3 = new Cabinet("ICT_CLASS",444, "Chardon", 28,Type.PRATICE);
	    Cabinet C4 = new Cabinet("DB_CLASS",305, "Aqerke", 22,Type.PRATICE);
	    Cabinet C5 = new Cabinet("PE_CLASS",100, "Odincov", 33,Type.PRATICE);
	    
	    Cabinet C6 = new Cabinet("CLASS",267, "Ernat", 34,Type.PRATICE);

	    System.out.println(C2.toString(Type.PRATICE));
		System.out.println(C2.toString());
		// System.out.println(C2.toString());
	
	}
}
