package mix;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackageClasses = {Datasource_use.class})
@ImportResource({"spring-dataSource.XML"})
public class ApplicationConfig {
}
