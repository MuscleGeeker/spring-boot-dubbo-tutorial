package me.musclegeeker.tutorial;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Project: spring-boot-dubbo-tutorial
 * @Author: MuscleGeeker // p-lianghj@tech.citic
 * @Description: 应用入口
 * @Date: 2018-08-29 20:35
 * @Version: V1.0
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = "me.musclegeeker.tutorial")
public class BookShopApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BookShopApplication.class).build().run(args);
    }
}
