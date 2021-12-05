package backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan("database.entities")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);
    }
}