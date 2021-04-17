package pl.pjatk.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {
    public MyFirstComponent(Pojo pojo, List<String> otherdefaultData,
                            @Value("${my.custom.random:default value}") String property) {
        System.out.printf("Hello from MyFirstComponnent ");
        pojo.soutSomething();
        System.out.println(otherdefaultData);
        System.out.println(property);



    }

    public void printHelloFromMethod() {
        System.out.printf("Hello from MyFirstComponent.printHelloFromMethod ");
    }


}
