package StringBuilder;

public class BuilderAppend {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("StringBuilder");
        builder.append(" is a peer class of String");
        builder.append(" that provide much of");
        builder.append(" the functionality of strings");
        System.out.println("");
        System.out.println(builder);
    }
}