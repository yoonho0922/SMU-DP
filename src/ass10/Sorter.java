package ass10;

public abstract class Sorter {
    public final void sort(Person[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (comparable(data[j], data[j+1]) > 0) {
                    Person temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    abstract int comparable(Object x1, Object x2);
}
