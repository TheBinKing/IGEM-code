package com.igem.igem.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.core.env.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.igem")
@MapperScan("com.igem.server.mapper")
@EnableSwagger2
public class IGEMApplication {

    private static final Logger LOG = LoggerFactory.getLogger(IGEMApplication.class);


    public  static  void main(String[] args){
        SpringApplication app = new SpringApplication(IGEMApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("IGEM地址：\thttp://127.0.0.2:{}", env.getProperty("server.port"));
    }
}
