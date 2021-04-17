package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {
    public MySecondComponent(MyFirstComponent myFirstComponent){
        System.out.printf("Hello from MySecondComponent ");
        myFirstComponent.printHelloFromMethod();
    }
    public void printMySecondHelloMethod(){
        System.out.printf("My second method printed ");
    }
}
