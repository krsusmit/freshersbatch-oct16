package question1;

public class Arithematic {
    public static void main(String[] args) {
        Add add = ((a, b) -> a+b);
        Add sub = ((a, b) -> a-b);
        Add mul = ((a, b) -> a*b);
        Add div = ((a, b) -> a/b);
        System.out.println(add.getResult(10,5));
        System.out.println(sub.getResult(10,5));
        System.out.println(mul.getResult(10,5));
        System.out.println(div.getResult(10,5));
    }
}
interface Add{
    int getResult(int a,int b);
}