import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Human> humans = new ArrayList<>();

        Human ivan = new Human("Ivan", "male", 30);
        Human nikita = new Human("Nikita", "male", 20);
        Human olga = new Human("Olga", "female", 25);

        humans.add(ivan);
        humans.add(nikita);
        humans.add(olga);

        Collections.sort(humans);
        System.out.println(humans);


    }
}