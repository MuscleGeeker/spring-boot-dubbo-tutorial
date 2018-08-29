package me.musclegeeker.tutorial;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * @Project: spring-boot-dubbo-tutorial
 * @Author: MuscleGeeker // p-lianghj@tech.citic
 * @Description: 测试基类
 * @Date: 2018-08-29 21:00
 * @Version: V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookShopApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
public class BaseTest {
}
