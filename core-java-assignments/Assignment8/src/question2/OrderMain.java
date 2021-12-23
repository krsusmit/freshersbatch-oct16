package question2;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class OrderMain {
    public static void main(String[] args) {
        List<Orders> list = new LinkedList<>();
        list.add(new Orders(12000l,"COMPLETED"));
        list.add(new Orders(2399l,"REJECTED"));
        list.add(new Orders(12000l,"REJECTED"));
        list.add(new Orders(2399l,"COMPLETED"));
        list.add(new Orders(13000l,"COMPLETED"));
        list.add(new Orders(23993l,"COMPLETED"));
        printConditionally(list,orders -> {
         return orders.getPrice()>10000 &&
            orders.getStatus().equals("COMPLETED");
        });

    }
    public static void printConditionally(List<Orders> list, Predicate<Orders> predicate)
    {
        for (Orders o: list) {
            if (predicate.test(o))
            System.out.println(o);
        }
    }
}
