package vn.bigthomas.myproject;

import org.quartz.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class MyprojectApplication {

	public static void main(String[] args) throws SchedulerException {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}
