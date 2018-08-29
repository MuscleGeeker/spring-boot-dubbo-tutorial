package me.musclegeeker.tutorial.support;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.spi.MetadataBuildingContext;

/**
 * @Project: spring-boot-dubbo-tutorial
 * @Author: MuscleGeeker // p-lianghj@tech.citic
 * @Description: 自定义JPA命名策略
 * @Date: 2018-08-29 21:32
 * @Version: V1.0
 */
public class CustomNamingStrategy extends ImplicitNamingStrategyJpaCompliantImpl {

    @Override
    protected Identifier toIdentifier(String stringForm, MetadataBuildingContext buildingContext) {
        return super.toIdentifier("test" + stringForm, buildingContext);
    }
}
