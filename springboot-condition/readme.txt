Condition 选择性的创建bean
1.返回spring的IOC容器
ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);
2.condition用来自定义条件，达到条件才创建当前bean的实例
3.可以使用springBoot内置的各类condition的实现
 @ConditionalOnMissingBean(name = {"redisTemplate"})，没有这个就放行
 @ConditionalOnProperties  ，有参数
 @ConditionalOnClass
 。。。。。

可以查看  org.springframework.boot.autoconfigure.condition

4.springBoot内置的4种服务器  在web环境下才有用
org.springframework.boot.autoconfigure.web.embedded 下有四个服务器



