public interface UList<T> extends Iterable<T>{
    boolean add(T element);
    void delete(int index);
    void deleteSeveral(int index1, int index2);
    T get(int index);
    int size();
}
