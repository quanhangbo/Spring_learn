package autowired_test;

import component_test.quangaoleng.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("RoleService2")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RoleServiceImpl2 implements RoleService2{

    @Autowired
    private Role role =null;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void printRoleInfo() {
        System.out.println(role);
    }
}
