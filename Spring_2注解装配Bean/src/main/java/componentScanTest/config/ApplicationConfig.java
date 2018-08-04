package componentScanTest.config;


import componentScanTest.service.impl.RoleServiceImpl;
import component_test.quangaoleng.Role;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {RoleServiceImpl.class,Role.class})
public class ApplicationConfig {
}
