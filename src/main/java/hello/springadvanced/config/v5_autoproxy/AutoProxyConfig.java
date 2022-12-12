package hello.springadvanced.config.v5_autoproxy;

import hello.springadvanced.config.AppV1Config;
import hello.springadvanced.config.AppV2Config;
import hello.springadvanced.trace.logtrace.LogTrace;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppV1Config.class, AppV2Config.class})
public class AutoProxyConfig {

//    @Bean
//    public Advisor advisor1(LogTrace logTrace) {
//        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
//        pointcut.setMappedNames("request*", "order*", "save*");
//        LogTraceAdvice advice = new LogTraceAdvice(logTrace);
//        //advisor = pointcut + advice
//        return new DefaultPointcutAdvisor(pointcut, advice);
//    }

}
