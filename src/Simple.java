public interface Simple<T> extends Iterable<T>{
    boolean add(T e);
    void delete(int index);
    T get(int index);
    int size();
    void update(int index, T e);
}
