package ass10;

public class AgeSorter extends Sorter{
    @Override
    int comparable(Object x1, Object x2) {
        Person p1 = (Person) x1;
        Person p2 = (Person) x2;
        return p1.getAge() - p2.getAge();
    }
}
