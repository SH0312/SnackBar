package com.sh.snackbar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * JPA 설정
 *
 * @Author SH
 * @Date 2022.09.18
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.sh.snackbar.repository")
public class JpaConfig {

}