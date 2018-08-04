package autowired_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Component.class);
        RoleServiceImpl2 roleServiceImpl2 = context.getBean(RoleServiceImpl2.class);
        RoleServiceImpl2 roleServiceImpl2_2 = context.getBean(RoleServiceImpl2.class);
        System.out.println(roleServiceImpl2.getRole());
        System.out.println(roleServiceImpl2==roleServiceImpl2_2);
    }
}
r