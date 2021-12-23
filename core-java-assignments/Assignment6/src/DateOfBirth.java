import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class DateOfBirth {
    public static void main(String[] args) {
        List<LocalDate> ll=new LinkedList<>();
        ll.add(LocalDate.of(2000,Month.APRIL,23));
        ll.add(LocalDate.of(2004,Month.FEBRUARY,29));
        ll.add(LocalDate.of(2001,Month.JANUARY,10));

        for (LocalDate date:ll) {
            if (date.isLeapYear())
            {
                System.out.println("I was born in" + date +"and it was a leap year");
            }
            else {
                System.out.println("I was born in" + date +"and it was not a leap year");
            }
        }
    }

}