import java.util.List;
import java.util.Objects;

public class MyArrayList<T> {
    // your code here
    private Object[] elements;
    private int cnt;
    public MyArrayList(int capacity) {
        // your code here
        this.elements = new Object[capacity];
        this.cnt=0;
    }
    public void add(T data) {
        // your code here
        elements[cnt++]=data;
    }
    public T get(int index) {
        // your code here
        T get = (T) elements[index];
        return get;
    }
}