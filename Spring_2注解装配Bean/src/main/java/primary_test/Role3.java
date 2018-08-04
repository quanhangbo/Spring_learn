package primary_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Role3 {

    @Autowired
    @Qualifier("ServiceImpl3_1")
    private Service3 service3 = null;

    public Service3 getService3() {
        return service3;
    }

    public void setService3(@Autowired Service3 service3) {
        this.service3 = service3;
    }
}
