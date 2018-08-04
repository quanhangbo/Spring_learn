package autowired_test;

import component_test.quangaoleng.Role;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {Role.class,RoleServiceImpl2.class})
public class Component {
}
