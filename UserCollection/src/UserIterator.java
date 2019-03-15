import java.util.Iterator;

public class UserIterator<T> implements Iterator<T> {

    private T[] elements;
    private int index = 0;

    public UserIterator(T[] elements){
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return index < elements.length;
    }

    @Override
    public T next() {
        return elements[index++];
    }
}
