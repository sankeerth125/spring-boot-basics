package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component //makes this class in spring radar
public class LoggingAspect {

    @Before("execution(* aop.ShoppingCart.checkout())")
    public void logger() {
        System.out.println("logging");
    }
}
