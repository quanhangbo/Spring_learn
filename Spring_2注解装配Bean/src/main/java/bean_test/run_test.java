package bean_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class run_test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Component.class);
        Bean_use bean_use = context.getBean(Bean_use.class);
        System.out.println(bean_use.getDataSource());
    }


}
