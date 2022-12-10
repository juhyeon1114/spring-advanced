package hello.springadvanced;

import hello.springadvanced.config.AppV1Config;
import hello.springadvanced.config.AppV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(AppV2Config.class)
@SpringBootApplication(scanBasePackages = "hello.springadvanced.app.proxy3")
public class SpringAdvancedApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringAdvancedApplication.class, args);

	}

}
