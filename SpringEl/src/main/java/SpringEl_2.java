import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class SpringEl_2 {

    public static void main(String[] args) {
        //从对象中取值
        ExpressionParser parser = new SpelExpressionParser();

        Role role = new Role(1L,"zhang","note");
        Expression exp = parser.parseExpression("note");
        String note = (String) exp.getValue(role);
        System.out.println(note);

        //变量环境类
        EvaluationContext ctx = new StandardEvaluationContext(role);
        parser.parseExpression("note").setValue(ctx,"new_note");
        note = (String) parser.parseExpression("note").getValue(role);
        System.out.println(note);

        //新增环境变量
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("lit2");
        ctx.setVariable("list",list);
        parser.parseExpression("#list[1]").setValue(ctx,"uopdate_value");;
        System.out.println(parser.parseExpression("#list[1]").getValue(ctx));
    }




}
