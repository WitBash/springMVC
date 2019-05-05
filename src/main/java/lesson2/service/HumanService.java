package lesson2.service;

import lesson2.entities.Human;
import lesson2.repositories.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HumanService {
    private HumanRepository humanRepository;


    @Autowired
    public void setHumanRepository(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }


    public Human getHuman() {
        Human human = humanRepository.findHuman();
        return human;
    }

    public List<Human> getGroupHuman() {
        List<Human> list ;
        list = humanRepository.groupHuman();
        return list;
    }



    public HumanService() {

    }

}
