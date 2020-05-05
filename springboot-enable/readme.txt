5.@Enable*注解
  5.1 其底层原理是使用@import注解导入一些配置类，实现Bean的动态加载
  5.2 springboot工程不能直接获取其他工程定义的bean,（这里使用springboot-enableother
      因为@ComponentScan扫描的是当前引导类所在的包及其子包
    解决：
      5.2.1 使用@componentscan扫描所在的配置类的包
       @ComponentScan("com.huangchuan.config") 扫描路径
      5.2.2 使用@import注解来加载类 这些类都会被spring创建，并放入IOC容器
       @Import(UserConfig.class) 导入类名
      5.2.3 可以对@import注解进行封装
        在需要导入的类的位置创建导入注解，然后在工程中使用这个注解
         //创建User导入的注解
         @Target({ElementType.TYPE})
         @Retention(RetentionPolicy.RUNTIME)
         @Documented
         @Import({UserConfig.class})
         public @interface EnableUser {
         }
         //在需要User的地方使用这个注解
         @EnableUser
6.使用@import导入的类会被自动加载到IOC容器中，@import提供4种用法
  6.1 导入@Bean
  6.2 导入配置类
  6.3 导入ImportSelector实现类，一般用于加载配置文件中的类
  6.4 导入ImportBeanDefinitionRegister实现类


7.springBoot自动配置
  org.springframework.boot.autoconfigure.AutoConfigurationImportSelector

   protected List<String> getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes) {
          List<String> configurations = SpringFactoriesLoader.loadFactoryNames(this.getSpringFactoriesLoaderFactoryClass(), this.getBeanClassLoader());
          Assert.notEmpty(configurations, "No auto configuration classes found in META-INF/spring.factories. If you are using a custom packaging, make sure that file is correct.");
          return configurations;
      }


8.自定义自动配置
 8.1 设置redis-spring-boot-autoconfigure
 8.2 redis-spring-boot-starter将redis-spring-boot-autoconfigure依赖导入
 8.3 springboot-enable将redis-spring-boot-starter依赖导入

 可以参考redis的自动配置
 org.springframework.boot.autoconfigure.data.redis



