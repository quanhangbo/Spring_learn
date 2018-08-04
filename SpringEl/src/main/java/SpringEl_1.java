import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringEl_1 {
    public static void main(String[] args) {
        //解析器
        ExpressionParser parser = new SpelExpressionParser();

        //设置表达式
        Expression exp = parser.parseExpression("'Hello world'");
        String str = (String) exp.getValue();
        System.out.println(str);
        //通过El访问普通方法
        exp = parser.parseExpression("'Hello world'.charAt(0)");
        char ch = (Character) exp.getValue();
        System.out.println(ch);
        //通过el访问getter方法
        exp= parser.parseExpression("'Hello world'.bytes");
        byte bytes[] = (byte[]) exp.getValue();
        System.out.println(bytes);
        //通过el访问属性
        exp = parser.parseExpression("'Hello world'.getBytes().length");
        int len = (Integer) exp.getValue();
        System.out.println(len);
    }
}
