package StringBuilder;

public class BuilderReverse {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("This method returns the reversed object on which it was called");
        str.reverse();
        System.out.print("");
        System.out.print("");
        System.out.print(str);
    }
}