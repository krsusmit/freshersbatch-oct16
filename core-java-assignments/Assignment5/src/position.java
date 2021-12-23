import java.util.Arrays;

public class position<T> {
    private T[] arr;

    position(T[] arr) {
        this.arr = arr;
    }

    public <T> void swap(T[] arr, int i, int j) {
        T temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public <E> void disp(E[] arr) {
        for (E e : arr) {
            System.out.println(e);
        }
    }
}
