package aop;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
public class ShoppingCart {
    public void checkout() {
        //logging
        //Authentication and Autherization
        //sanitize the data
        System.out.println("Checkout called");
    }
}
