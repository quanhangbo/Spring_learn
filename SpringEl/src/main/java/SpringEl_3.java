import org.springframework.beans.factory.annotation.Value;

public class SpringEl_3 {

    @Value("{#(Math).PI}")
    private double pi;

    @Value("#{role.id==1}")
    private Boolean equalNum;

    public static void main(String[] args) {

    }
}
