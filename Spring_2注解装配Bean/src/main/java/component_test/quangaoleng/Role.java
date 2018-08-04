package component_test.quangaoleng;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="role1")
public class Role {
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Value("1")
    private Long id;
    @Value("roleName")
    private String name;
    @Value("roleSex")
    private String sex;
}
