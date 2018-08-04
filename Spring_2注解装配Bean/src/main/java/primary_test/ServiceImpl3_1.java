package primary_test;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Component
@Controller
@Service("ServiceImpl3_1")
public class ServiceImpl3_1 implements Service3{
    @Override
    public void print() {
        System.out.println("这是ServiceImpl1的方法");
    }
}
