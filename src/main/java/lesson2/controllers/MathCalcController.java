package lesson2.controllers;

import lesson2.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/math")
public class MathCalcController {
    private MathService mathService;

    @Autowired
    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping(path ="/showSum", method = RequestMethod.GET)
    @ResponseBody
    public int showSum(@RequestParam int a, int b) {
        int result = mathService.getSum(a,b);
        return result;
    }
}
