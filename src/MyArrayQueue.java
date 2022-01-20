import java.util.Arrays;

public class MyArrayQueue<T>{
    private final int DEFAULT_CAPACITY = 4;
    private T[] array = (T[]) new Object[DEFAULT_CAPACITY];
    private int size = 0;
    private final int  HEAD = 0;




    public void enqueue(T element){
        size++;
        ensureCapacity();
        array[size - 1] = element;
    }

    public T dequeue(){
        if (isEmpty())
            return null;
        T element = array[HEAD];

        array = Arrays.copyOfRange(array,1, size);
        size--;
        return element;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity(){
        if (size == array.length)
            expandArray();
    }

    private void expandArray(){
        array = Arrays.copyOf(array, array.length + DEFAULT_CAPACITY);
    }

}