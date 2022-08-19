import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person sheldon = new Person("Sheldo",
                "Coop", 28);
        Person saltykov = new Person("Michael",
                "Saltykov-Schedrin", 63);
        Person mozart = new Person("Johannes",
                "Chrysostomus Wolfgangus Theophilus Mozart", 35);
        Person delToro = new Person("Benicio",
                "Monserrate Rafael del Toro Sanchez", 55);
        Person sutherland = new Person("Kiefer",
                "William Frederick Dempsey George Rufus Sutherland", 55);
        Person gibson = new Person("Mel",
                "Colm-Cille Gerard Gibson", 66);
        sheldon.setName("Sheldon");
        sheldon.setSurname("Cooper");
        sheldon.setAge(30);
        System.out.println(sheldon.getName());
        System.out.println(sheldon.getSurname());
        System.out.println(sheldon.getAge());
        people.add(sheldon);
        people.add(saltykov);
        people.add(mozart);
        people.add(delToro);
        people.add(sutherland);
        people.add(gibson);
        Collections.sort(people);
        System.out.println(people);
    }
}
