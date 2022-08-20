import java.util.Comparator;

public class PersonSurnameWordsComparator implements Comparator<Person> {

    private final int surnameCompareSize;

    public PersonSurnameWordsComparator (int surnameCompareSize) {
        this.surnameCompareSize = surnameCompareSize;
    }

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.surnameWords(p1.getSurname()) >= surnameCompareSize
                && p2.surnameWords(p2.getSurname()) >= surnameCompareSize) {
            if (p1.surnameWords(p1.getSurname()) < p2.surnameWords(p2.getSurname())) {
                return -1;
            } else if (p1.surnameWords(p1.getSurname()) > p2.surnameWords(p2.getSurname())) {
                return 1;
            } else {
                if (p1.getAge() > p2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            if (p1.getAge() > p2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
