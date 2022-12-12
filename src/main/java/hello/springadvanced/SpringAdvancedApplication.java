package hello.springadvanced;

import hello.springadvanced.config.AppV1Config;
import hello.springadvanced.config.AppV2Config;
import hello.springadvanced.config.v1_proxy.ConcreteProxyConfig;
import hello.springadvanced.config.v1_proxy.InterfaceProxyConfig;
import hello.springadvanced.trace.logtrace.LogTrace;
import hello.springadvanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(ConcreteProxyConfig.class)
@SpringBootApplication(scanBasePackages = "hello.springadvanced.app")
public class SpringAdvancedApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringAdvancedApplication.class, args);

	}

	@Bean
	public LogTrace logTrace() {
		return new ThreadLocalLogTrace();
	}

}
