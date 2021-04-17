package pl.pjatk.core;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name="bean.shouldexist", havingValue="true")
    public CreatingBean creatingBean() {
        System.out.println("Nowy beanek tu jest la la la la la la nowy bean to ja");
        return new CreatingBean("Jam jest nowy beanek!");
    }

    @Bean
    public Pojo pojo(){
        System.out.println("hello form my dojo");
        return new Pojo(3,4.5,"ss","tu");

    }

    @Bean
    public List<String> defaultData(){
        return List.of("1","2","3","4","5");
    }

    @Bean
    public List<String> otherdefaultData(){
        return List.of("5","4","3","2","1");
    }
}
