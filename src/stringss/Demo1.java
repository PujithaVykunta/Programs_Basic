package stringss;

public class Demo1 {
	
   private static Demo1 d;

//    private Demo1() {
//	
//   }
	
    public static Demo1 m() {
		if(d==null) {
			d=new Demo1();
			return d;
		}
		else
		return d;
	
}
    @Override
    	public String toString() {
    		
    		return "demo object 1";
    	}
}
