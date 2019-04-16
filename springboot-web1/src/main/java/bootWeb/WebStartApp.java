package bootWeb;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"dubbo-consumer.xml"})
public class WebStartApp {
	 private static Logger logger = Logger.getLogger(WebStartApp.class);
	 /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(WebStartApp.class, args);
    }
}
