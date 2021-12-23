package question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Append {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");
        StringBuilder sb= new StringBuilder();
        list.forEach(s -> sb.append(s.charAt(0)));
        System.out.println(sb);
    }
}
