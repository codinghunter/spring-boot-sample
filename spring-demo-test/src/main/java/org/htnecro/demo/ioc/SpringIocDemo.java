package org.htnecro.demo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SpringIocDemo {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        SpringIocDemo springIocDemo = ctx.getBean(SpringIocDemo.class);
        springIocDemo.hello();
    }

    public void hello() {
        System.out.println("Hello spring ioc");
    }

    @Configuration
    public static class AppConfig {

        @Bean
        public SpringIocDemo springIocDemo() {
            return new SpringIocDemo();
        }

    }
}
