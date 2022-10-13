public class StarTriangle {
	public int width;
	
	StarTriangle(int width){
	    this.width = width;
	}
	public String s = "";
	public String toString(){
	    for(int i=0;i<width;i++){
	        for(int j=0;j<=i;j++){
	           // System.out.print("[*]");
	           s+="[*]";
	        }
	       // System.out.println();
	       s+="\n";
	    }
	    return s;
	}
	
	
}
