package componentScanTest.config;

import componentScanTest.service.impl.RoleServiceImpl;
import component_test.quangaoleng.Role;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class run_test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Role role = context.getBean(Role.class);
        System.out.println(role.toString());
        RoleServiceImpl roleServiceImpl = context.getBean(componentScanTest.service.impl.RoleServiceImpl.class);
        roleServiceImpl.printRoleInfo(role);
    }
}
