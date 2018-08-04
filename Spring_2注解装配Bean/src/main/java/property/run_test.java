package property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class run_test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DataSourceBean dataSource = context.getBean(DataSourceBean.class);
        System.out.println(dataSource.getDataSource().toString());

    }
}
