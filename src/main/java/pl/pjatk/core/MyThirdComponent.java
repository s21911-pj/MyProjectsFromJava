package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

    public MyThirdComponent(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent) {
        System.out.printf("Hello from MyThirdComponent ");
        myFirstComponent.printHelloFromMethod();
        mySecondComponent.printMySecondHelloMethod();
    }

}
