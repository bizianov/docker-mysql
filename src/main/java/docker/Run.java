package docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by viacheslav on 5/3/17.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "docker.repository")
public class Run {
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
