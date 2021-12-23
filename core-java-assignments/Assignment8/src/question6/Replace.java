package question6;

import java.util.LinkedList;
import java.util.List;

public class Replace {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("hello");
        list.add("bye");
        list.replaceAll(s -> s.toUpperCase());
        System.out.println(list);
    }
}