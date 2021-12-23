
public class Main {

	public static void main(String[] args) {
		
        Integer[] ar = {10,20,30,50};
        
        position<Integer> position = new position<>(ar);
        System.out.println("Array before sorting");
        
        position.disp(ar);
        position.swap(ar,1,3);
        System.out.println("Array after sorting at index 1 and 3 ");
        
        position.disp(ar);

    }
}