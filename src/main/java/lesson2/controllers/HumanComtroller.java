package lesson2.controllers;

import lesson2.entities.Human;
import lesson2.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/human")
public class HumanComtroller {
    private HumanService humanService;

    @Autowired
    public void setHumanService(HumanService humanService) {
        this.humanService = humanService;
    }

    @RequestMapping(path = "/getHuman", method = RequestMethod.POST)
    public void getHuman(@RequestBody Human human) {
        System.out.println(human.getName() + " " + human.getAge() + " " + human.getGender());
    }

    @RequestMapping(path = "/getGroupHuman", method = RequestMethod.GET)
    @ResponseBody
    public List<Human> getGroupHuman() {
        List<Human> list;
        list = humanService.getGroupHuman();
        return list;
    }
}
