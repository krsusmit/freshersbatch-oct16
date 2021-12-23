package question1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mains {
    public static void main(String[] args) {
        List<Fruit> list = new LinkedList<>();
        list.add(new Fruit("Apple", 17, 234, "red"));
        list.add(new Fruit("promogranate", 15, 274, "yellow"));
        list.add(new Fruit("mango", 150, 254, "blue"));

        List<News> list1 = new LinkedList<>();
        list1.add(new News(12, "im posting", "it's gud", "very gud"));
        list1.add(new News(12, "im posting", "it's gud", "very gd"));
        list1.add(new News(12, "im posting", "budget", "gud"));
        list1.add(new News(13, "im posting again", "it's very gud", "very very gud"));

        List<Trader> list2 = new LinkedList<>();
        list2.add(new Trader("akjs", "pune"));
        list2.add(new Trader("Humu", "Indore"));
        list2.add(new Trader("Humu1", "Indore"));
        List<Transaction> list3 = Arrays.asList(
                new Transaction(new Trader("aodjf", "Delhi"), 2012, 4500),
                 new Transaction(new Trader("ajf", "Delhi"), 2011, 4800),
        new Transaction(new Trader("aojf", "Indore"), 2011, 4400));
        //1.question
        System.out.println("1.Calories less than 100");
        list.stream()
                .sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .filter(x -> x.getCalories() < 100)
                .map(Fruit::getName)
                .forEach(System.out::println);
        //2.question
        System.out.println("2.color wise fruit names");
        list.stream()
                        .sorted(Comparator.comparing(Fruit::getColor))
                                .map(Fruit::getName)
                                        .forEach(System.out::println);

        //3.question
        System.out.println("3.Red color fruits");
        list.stream()
                .filter(x -> x.getColor().contains("red"))
                .sorted(Comparator.comparingInt(Fruit::getPrice))
                .forEach(System.out::println);

        //4.Question
        System.out.println("4.ID having max comments");
        list1.stream()
                .max(Comparator.comparing(News::getComment).reversed())
                .map(News::getNewsid)
                .ifPresent(System.out::println);

       //5.question
        System.out.println("5.Counting the number of times the budget is present");
       int count = (int) list1.stream()
                .filter(x-> x.getCommentByUser().contains("budget"))
                        .count();
        System.out.println(count);

        //6.question
        System.out.println("6.Printing max Comment by user");
        Optional<String> max = list1.stream()
                .map(News::getCommentByUser)
                        .max((i,j)->i.compareTo(j));
        System.out.println(max.get());
        //7.question
        System.out.println("7.print get comment by user");
            list1.stream()
                    .max(Comparator.comparing(News::getNewsid).reversed())
                    .map(News::getCommentByUser)
                            .ifPresent(System.out::println);
        //8.question
        System.out.println("8.Transaction in year 2011 and sort by value");
        list3.stream()
                .filter(x->x.getYear()==2011)
                        .sorted(Comparator.comparingInt(Transaction::getValue))
                                .forEach(System.out::println);
        //9.question
        System.out.println("9.Unique cities");
        list2.stream()
                        .map(Trader::getCity)
                .distinct()
                                .forEach(System.out::println);
        //10.question
        System.out.println("10.trader whose city is pune");
        list2.stream()
                .filter(x->x.getCity().contains("pune"))
                        .sorted(Comparator.comparing(Trader::getName))
                                .forEach(System.out::println);
        //11.question
        System.out.println("11.trader name sorted alphabetically");
        list2.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
        //12.question
        System.out.println("12.Trader in indore");
        list2.stream()
                .filter(x-> x.getCity().contains("Indore"))
                .forEach(x->System.out.println(x));
        //13.question
        System.out.println("13.Transaction value with trader city delhi");
        list3.stream()
                .filter(x->x.getTrader().getCity().contains("Delhi"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        //14.question
        System.out.println("14.Highest transaction value");
        list3.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .limit(1)
                .map(Transaction::getValue)
                .forEach(System.out::println);
        //15.question
        System.out.println("15.Transaction with smalledt value");
        list3.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .limit(1)
                .forEach(System.out::println);
    }
}