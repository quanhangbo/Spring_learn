package pojo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {

    @Test
    public void fun1(){
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
        bdr.loadBeanDefinitions(resource);

        ComplexAssembly complexAssembly = (ComplexAssembly) beanFactory.getBean("ComplexAssembly");
        System.out.println(complexAssembly.getArray().length);

        Resource resource1 = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory1 = new XmlBeanFactory(resource1);
        ComplexAssembly complexAssembly1 = (ComplexAssembly) beanFactory1.getBean("ComplexAssembly");
        System.out.println(complexAssembly1.getArray().length);
    }
}
