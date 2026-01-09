package pixel.academy.Task_BD;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskBdApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("Homework Baza de Date");
		};
	}
}
