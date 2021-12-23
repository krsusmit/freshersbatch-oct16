package question3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaApi {
    public static void main(String[] args) {
        Consumer<Integer> consumer = integer -> System.out.println(integer);
        Predicate<Integer> predicate = integer -> (integer>10);
        Supplier<Double> supplier = () -> Math.random();
        Function<Integer,Integer> function = (a) ->a/2;
        System.out.println("Consumer");
        consumer.accept(10);
        System.out.println(predicate.test(15));
        System.out.println(supplier.get());
        System.out.println(function.apply(2));
    }
}