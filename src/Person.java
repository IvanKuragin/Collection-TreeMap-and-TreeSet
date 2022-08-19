public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;
    private final int surnameCompareSize;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        surnameCompareSize = 2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", " + "surname: " + surname + ", " + "age: " + age + "\n";
    }

    public int surnameWords() {
        String[] surnameWords = surname.split(" ");
        String[] surnameWords1 = surname.split("-");
        return (surnameWords.length + surnameWords1.length) - 1;
    }

    @Override
    public int compareTo(Person person) {
        if (surnameWords() >= surnameCompareSize
                && person.surnameWords() >= surnameCompareSize) {
            if (surnameWords() < person.surnameWords()) {
                return -1;
            } else if (surnameWords() > person.surnameWords()) {
                return 1;
            } else {
                if (age > person.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            if (age > person.age) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
