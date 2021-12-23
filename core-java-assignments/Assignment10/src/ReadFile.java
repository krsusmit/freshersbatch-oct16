import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.function.Predicate;


public class ReadFile {
	
    public static void main(String[] args) {
    	
        var paths = "C:\\Users\\krsusmit\\Downloads\\Java11Assignments_StudentList.txt";
       try{
    	   
        // System.out.println(Files.readString(Path.of(paths)));
    	   
        System.out.println("All the Students in the list are: ");
        Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).forEach(System.out::println);
        
        //Typecasting of type explicit with lossy conversion which will help us to count absolute no. of students in the sheet
        
        int x = (int)Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).count();
        System.out.println("The numbers of students in the sheet is: "+x);
    }
       catch (IOException e)
       {
           System.out.println();
       }
    }
}