package me.musclegeeker.tutorial.domain;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * @Project: spring-boot-dubbo-tutorial
 * @Author: MuscleGeeker // p-lianghj@tech.citic
 * @Description: 地址类
 * @Date: 2018-08-29 21:50
 * @Version: V1.0
 */
@Data
@Embeddable
class Address {
    private String province;
    private String city;
    private String area;
    private String address;
    private String zipCode;
}
