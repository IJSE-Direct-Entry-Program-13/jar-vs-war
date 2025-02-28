package lk.ijse.dep13.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppApplication.class, args);
    }

}
