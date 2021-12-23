import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.stream.Stream;

public class menu {
    public static void main(String[] args) {
        String pathtofile = "C:\\Users\\HUBANU\\Desktop\\menu.txt";
        Scanner s = new Scanner(System.in);
        System.out.println("select your option(1.To insert 2. view 3.exit)");
        int item_number =1;
        int choice= s.nextInt();
        boolean b = true;
        switch (choice){
            case 1: {
                System.out.println("Enter the Price of item " + item_number + ": ");
                String price = s.next();
                try {
                    Files.writeString(Path.of(pathtofile), price, StandardOpenOption.APPEND);
                    Files.writeString(Path.of(pathtofile), "\n", StandardOpenOption.APPEND);
                }
                catch (IOException e)
                {
                    System.out.println("");
                }
                System.out.println("Price has been saved in file");
                break;
            }
            case 2:{
                try {
                    Scanner read = new Scanner(Files.readString(Path.of(pathtofile)));

                int total=0;
                while (read.hasNext()){
                    total = total+read.nextInt();
                }
                System.out.println("Your total is: "+total);
                }
                catch (IOException e)
                {
                    System.out.println();
                }
                break;
            }
            case 3:{
                System.out.println("exit program....");
                break;
            }
        }
    }
}