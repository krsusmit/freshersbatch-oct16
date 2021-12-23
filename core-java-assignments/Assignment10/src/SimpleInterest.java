
import java.util.function.Consumer;

public class SimpleInterest {
    public static void main(String[] args) {
     Lambda function=(var p , var t , var r)->{
         var si = p*t*r;
         return si/100;
     };
     System.out.println(function.result(10,15,3));
    }
}