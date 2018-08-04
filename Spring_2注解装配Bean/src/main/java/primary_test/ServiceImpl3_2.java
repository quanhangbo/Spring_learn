package primary_test;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Primary
//@Component("Service3")
@Controller
@Service("ServiceImpl3_2")
public class ServiceImpl3_2 implements Service3{
    @Override
    public void print() {
        System.out.println("这是ServiceImpl3_2的方法");
    }
}
