import java.util.Iterator;

public class UserList<T> implements UList<T> {

    protected T[] elements;
    protected int size = 8;
    protected boolean triger = false;


    public UserList() {

        elements = (T[]) new Object[size];

    }

    @Override
    public boolean add(T element) {
        TrigerSetter();
        UserListExpander();
        UserListAdder(element);
        return true;
    }

    @Override
    public void delete(int index) {
        T[] temp = elements;
        elements = (T[]) new Object[elements.length - 1];
        System.arraycopy(temp, 0, elements, 0, index);
        int afterIndex = temp.length - index - 1;
        System.arraycopy(temp, index + 1, elements, index, afterIndex);
    }

    @Override
    public void deleteSeveral(int index1, int index2) {
        T[] temp = elements;
        elements = (T[]) new Object[temp.length - (index2 - index1) + 1];
        System.arraycopy(temp, 0, elements, 0, index1);
        int afterIndex = temp.length - index2 - 1;
        System.arraycopy(temp, index2 + 1, elements, index1, afterIndex);
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        int size = 0;
        for (T elem : elements) {
            if (elem != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new UserIterator<T>(elements);
    }

    private void TrigerSetter() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                triger = false;
            } else {
                triger = true;
            }
        }
    }

    private void UserListExpander() {
        if (triger == true) {
            int coeficient = 5;
            this.size = coeficient + size;
            T[] temp = elements;
            this.elements = (T[]) new Object[size];
            System.arraycopy(temp, 0, elements, 0, temp.length);
        }
    }

    protected void UserListAdder(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) {
                elements[i] = element;
                break;
            }
        }
    }

}
