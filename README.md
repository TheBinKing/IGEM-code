Spring Cloud Project

Run it:
1. run pom.xml
2. run eureka
3. run gateway
4. run igem

eureka: 注册中心，把所有module注册到这里集中管理
gateway：网关（转移所有子module的端口，如:9003 -> :9000) (配置头部，允许跨域访问)
igem: 查询数据库相关代码，写了Swagger文档说明
其它: 没啥用