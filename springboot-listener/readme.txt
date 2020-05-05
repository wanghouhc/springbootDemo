 9.java监听机制
  9.1 事件：Event,继承java.util.EventObject类的对象
  9.2 事件源: Source,任意对象Object
  9.3 监听器：Listener 实现java.util.EventListener接口的对象

 10.SpringBoot监听机制
  10.1 ApplicationContextInitializer
    10.1.1 注册到IOC容器不可以直接执行
    10.1.2 在resource中创建META-INF/spring.factories,设置自动装配
           org.springframework.context.ApplicationContextInitializer=\
           com.haungchuan.springbootlistener.listener.MyApplicationContextInitializer

  10.2 SpringApplicationRunListener
    10.2.1 注册到IOC容器不可以直接执行
    10.2.2 在resource中创建META-INF/spring.factories,设置自动装配
           org.springframework.boot.SpringApplicationRunListener=\
           com.haungchuan.springbootlistener.listener.MySpringApplicationRunListener
    10.3.3 要创建一个构造函数，带两个参数的
           public MySpringApplicationRunListener(SpringApplication application,String[] args) { }

  10.3 CommandLineRunner
    10.3.1 注册到IOC容器，项目启动可以直接执行run的方法

  10.4 ApplicationRunner
    10.4.1 注册到IOC容器，项目启动可以直接执行run的方法

不同的监听器有不同的作用，我们在使用时主要看它的方法接口，以及这个监听器功能出现的时候，挑选适合自己的
org.springframework.boot.context.event event的存放位置

springApplication 事件源对象，所有事件都是在这里产生的
1.构造过程



