
import java.util.Iterator;

public class ArrayIterator<T> implements Iterator {

    private T[] objects;
    private int index = 0;

    public ArrayIterator(T[] objects){
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public T next() {
        return objects[index++];
    }

}
