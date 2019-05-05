package lesson2.repositories;

import lesson2.entities.MathCalc;
import org.springframework.stereotype.Component;


@Component
public class MathCalcRepo {

    public int findSum(int a, int b){
        MathCalc mathCalc = new MathCalc();
        mathCalc.setA(a);
        mathCalc.setB(b);
        int result = mathCalc.getA()+mathCalc.getB();
        return result;
    }
}
