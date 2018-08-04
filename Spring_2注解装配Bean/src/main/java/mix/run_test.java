package mix;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class run_test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Datasource_use datasource_use = context.getBean(Datasource_use.class);
        System.out.println(datasource_use.getDataSource());
    }
}
