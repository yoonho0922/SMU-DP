package ass02;

public class CompareSize implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        FileInfo f1 = (FileInfo) o1;
        FileInfo f2 = (FileInfo) o2;
        return f1.getSize()-f2.getSize();
    }
}
