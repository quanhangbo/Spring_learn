package primary_test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class run__test {

    @Test
    public  void fun1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Component3.class);
        Role3 role3 = context.getBean(Role3.class);
        Service3 service3 = role3.getService3();
        System.out.println(service3);

    }
}
