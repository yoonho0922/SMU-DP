package ass07;

import java.util.Iterator;

public interface DataCollection<T> {
    boolean put(T t);
    T elemAt(int index);
    int length();
    Iterator createIterator();
}
