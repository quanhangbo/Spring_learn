package property;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

@Component
public class DataSourceBean {

    @Value("${driver}")
    private String driver;

    @Value("${url}")
    private String url;
    @Value("{username}")
    private String username;
    @Value("{password}")
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {

        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Bean(name = "dataSource1")
    public DataSource getDataSource(){
        DataSource dataSource = null;
        Properties properties = new Properties();
        properties.setProperty("driver",driver);
        properties.setProperty("url",url);
        properties.setProperty("username",username);
        properties.setProperty("password",password);

        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dataSource;

    }
}
