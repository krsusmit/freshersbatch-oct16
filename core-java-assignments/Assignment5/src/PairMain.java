import java.util.Date;

public class PairMain {
	
    public static void main(String[] args) {
    	
        Pair<String,String> pair = new Pair<>();
        pair.setKey("hi");
        pair.setValue("hello");
        
       System.out.println(pair.getKey());
       System.out.println(pair.getValue());

       Pair<String , java.util.Date> pair1 = new Pair<>();
       pair1.setKey("Today is");
       pair1.setValue(new java.util.Date());
       
        System.out.println( pair1.getKey());
        System.out.println(pair1.getValue());
    }
}