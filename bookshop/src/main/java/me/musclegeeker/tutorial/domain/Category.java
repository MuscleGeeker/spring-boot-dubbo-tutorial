package me.musclegeeker.tutorial.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Project: spring-boot-dubbo-tutorial
 * @Author: MuscleGeeker // p-lianghj@tech.citic
 * @Description: 图书门类
 * @Date: 2018-08-29 21:16
 * @Version: V1.0
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
