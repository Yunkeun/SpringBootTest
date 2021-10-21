package com.yunkeun.springboottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing      // JPA Auditing 활성
@SpringBootApplication  // 설정으로 인해 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정해준다.
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
