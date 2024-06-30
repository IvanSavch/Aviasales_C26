package by.tms.aviasales_c26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()

public class AviasalesC26Application {

    public static void main(String[] args) {
        SpringApplication.run(AviasalesC26Application.class, args);
    }

}
