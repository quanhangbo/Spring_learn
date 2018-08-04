package bean_test;


import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@ComponentScan(basePackageClasses = {DataSource.class, Bean_use.class})
public class Component {
}
