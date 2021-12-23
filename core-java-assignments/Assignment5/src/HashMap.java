import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

public class HashMap<K,V> {
	
    private K key;
    private V value;
    public static void main(String[] args) {
    	
        java.util.HashMap<Integer,Double> hashMap = new java.util.HashMap<>();

        hashMap.put(10,20.3);
        hashMap.put(20,40.3);
        hashMap.put(30,30.4);
        hashMap.put(40,10.2);
        hashMap.put(50,5.34);
        hashMap.put(60,3.56);
        hashMap.put(70,5.66);
        hashMap.put(80,5.76);
        hashMap.put(90,2.45);
        hashMap.put(3,5.98);
        
            System.out.println("The 10 random keys and values are : " + hashMap);
    }
}