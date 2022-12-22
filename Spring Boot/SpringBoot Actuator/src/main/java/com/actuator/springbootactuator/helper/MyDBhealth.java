package com.actuator.springbootactuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBhealth implements HealthIndicator {
    public static final String DB_STATUS = "DB_STATUS";
    public boolean isGoodHealth(){
        return true;
    }
    @Override
    public Health health(){
        if(isGoodHealth()){
            return Health.up().withDetail(DB_STATUS,"Error UP").build();
        }
        return Health.down().withDetail(DB_STATUS,"Error Down").build();
    }
}
