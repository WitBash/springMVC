package lesson2.repositories;

import lesson2.entities.Human;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HumanRepository {
    public Human findHuman() {
        Human human = new Human();
        return human;
    }

    public List<Human> groupHuman() {
        List<Human> list = new ArrayList<>();
        Human human1 = new Human();
        human1.setName("Victor");
        human1.setAge(26);
        human1.setGender("man");
        list.add(human1);
        Human human2 = new Human();
        human2.setName("Vladimir");
        human2.setAge(35);
        human2.setGender("man");
        list.add(human2);
        Human human3 = new Human();
        human3.setName("Victoria");
        human3.setAge(25);
        human3.setGender("woman");
        list.add(human3);

        return list;
    }
}
