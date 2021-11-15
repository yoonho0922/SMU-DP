package ass07;

import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T> {

    private ArrayList<T> data;

    public DataCollectionAdapter() {
        data = new ArrayList<>();
    }

    @Override
    public boolean put(T t) {
        return data.add(t);
    }

    @Override
    public T elemAt(int index) {
        return data.get(index);
    }

    @Override
    public int length() {
        return data.size();
    }

    @Override
    public Iterator createIterator() {
        return data.iterator();
    }
}
