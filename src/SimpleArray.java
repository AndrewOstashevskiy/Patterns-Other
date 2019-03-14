import java.util.Iterator;

public class SimpleArray<T> implements Simple<T> {

    private T[] values;

    public SimpleArray() {
        values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T e) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    public void delete(int index) {
       try {
        T[] temp = values;
        values = (T[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        int amountElemAfterIndex = temp.length - index - 1;
        System.arraycopy(temp, index+1, values, index, amountElemAfterIndex);
    }catch (ClassCastException ex){
           ex.printStackTrace();
       }
    }

    /**
     * 
     * @param index
     * @return
     */
    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    /**
     * Place new value instead of old
     *
     * @param index
     * @param e
     */
    @Override
    public void update(int index, T e) {
        values[index] = e;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(values);
    }
    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<>();
        strings.add("ASSHOLE");
        strings.add("OTHER");
        strings.add("NEW");

        strings.delete(2);
        strings.forEach(a -> System.out.println(a));
        System.out.println(strings.size());

        strings.update(1, "DDDDDD");

        strings.forEach(a -> System.out.println(a));
    }
}
