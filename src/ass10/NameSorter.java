package ass10;

public class NameSorter extends Sorter {

    @Override
    int comparable(Object x1, Object x2) {
        Person p1 = (Person) x1;
        Person p2 = (Person) x2;
        return p1.getName().compareTo(p2.getName());
	}
}
