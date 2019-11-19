package com.pb.apps.cms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.pb.apps.cms.dao")
public class MybatisConfig {

}
