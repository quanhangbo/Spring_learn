package 条件化装配bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class run__test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DataSourceTest dataSourceTest = context.getBean(DataSourceTest.class);
        System.out.println(dataSourceTest.getDataSource());
    }
}
