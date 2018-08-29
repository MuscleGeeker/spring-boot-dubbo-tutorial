package me.musclegeeker.tutorial.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Project: spring-boot-dubbo-tutorial
 * @Author: MuscleGeeker // p-lianghj@tech.citic
 * @Description: 作者类
 * @Date: 2018-08-29 21:39
 * @Version: V1.0
 */
@Data
@Entity
public class Author {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(columnDefinition = "INT(3)")
    private Integer age;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Embedded
    private Address address;
}
