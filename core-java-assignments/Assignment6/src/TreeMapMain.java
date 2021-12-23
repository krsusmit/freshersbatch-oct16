import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<Long,Contact> map = new TreeMap<>();
        map.put(987654l,new Contact("Humera","humerashaik", Contact.Gender.male));
        map.put(9845073246l,new Contact("humu","higamil", Contact.Gender.female));
        System.out.println("Printing all the keys");
        Set<Map.Entry<Long,Contact>> entrySet = map.entrySet();
        for (Map.Entry<Long,Contact> entry: entrySet) {
            System.out.println(entry.getKey());
        }
        System.out.println("----------------------------------------------");
        System.out.println("Printing all the values");
        Set<Map.Entry<Long,Contact>> entrySet1 = map.entrySet();
        for (Map.Entry<Long,Contact> entry1: entrySet1) {
            System.out.println(entry1.getValue());
        }
        System.out.println("----------------------------------------------");
        System.out.println("Printing all the Key-values pairs");
        Set<Map.Entry<Long,Contact>> entrySet2 = map.entrySet();
        for (Map.Entry<Long,Contact> entry2: entrySet1) {
            System.out.println((entry2.getKey()) +","+ (entry2.getValue() ));
        }

    }

}