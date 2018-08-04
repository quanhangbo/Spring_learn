package componentScanTest.service.impl;

import componentScanTest.service.RoleService;
import component_test.quangaoleng.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService{
    @Override
    public void printRoleInfo(Role role) {
        System.out.println(role.toString());
    }
}
