package lesson2.service;

import lesson2.repositories.MathCalcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    private MathCalcRepo mathCalcRepo;

    @Autowired
    public void setMathCalc(MathCalcRepo mathCalcRepo) {
        this.mathCalcRepo = mathCalcRepo;
    }

    public int getSum(int a, int b) {
        int result = mathCalcRepo.findSum(a, b);
        return result;
    }
    public MathService(){

    }
}
