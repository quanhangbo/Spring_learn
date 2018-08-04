这道题实践时花了很长时间，原因是要注意当提示在ApplicationConfigContext读取错误时，往往要查看注解，
而注解应注意一个接口被多个类实现是，只在一个类上@Component("Service3")加上括号带参数，其余的都只
@Component就行，而且在配置类上不用@Component，
而Qualifier中放的是别名,将两个实现类的@Com改为@Controll,用@Servoce（“”）起别名，然后在@Autowired前后加上@Qulifier("别名")
