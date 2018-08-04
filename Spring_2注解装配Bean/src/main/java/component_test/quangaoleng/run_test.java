package component_test.quangaoleng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 对Component进行测试
 */
public class run_test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RoleConfig.class);
        Role role = applicationContext.getBean(Role.class);
        System.out.println(role);
    }

}
