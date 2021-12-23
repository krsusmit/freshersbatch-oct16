package question4;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class OddLengths {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("hiys");
        list.add("Humera");
        list.add("Sumera");
        list.add("haseena");
        list.add("tyuidsk");
        list.removeIf(s -> s.length()%2 != 0);
        System.out.println(list);
    }
}
