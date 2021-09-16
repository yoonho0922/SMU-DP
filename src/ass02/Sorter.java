package ass02;

public class Sorter {
    Comparable compare;

    public Sorter(Comparable compare) {
        this.compare = compare;
    }

    public void setComparable(Comparable compare) {
        this.compare = compare;
    }

    public void bubbleSort(Object[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (compare.compareTo(data[j], data[j+1]) > 0) { // swap
                    Object temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

}
