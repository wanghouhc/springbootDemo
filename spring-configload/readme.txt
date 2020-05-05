1 springboot配置文件的内部加载顺序
  1.1.file:./config/:从当前项目的/config目录下
  1.2.file:./        :当前项目的根目录下
  1.3.classpath:./config/: classpath的config目录
  1.4.classpath:/    :classpath的根目录


2.springboot配置文件的外部加载顺序

1.1和1.2两个地方的配置文件，在进行打包时，不会被打到jar包里去，因为不符合maven规范
2.1.
通过命令符来指定端口：java -jar spring-configload-0.0.1-SNAPSHOT.jar --server.port=8081
指定资源路径 java -jar spring-configload-0.0.1-SNAPSHOT.jar --server.servlet.context-path=/hehe
2.2 指定配置文件路径
java -jar spring-configload-0.0.1-SNAPSHOT.jar --spring.config.location=e://application.properties
2.3 在jar包同级目录下放置一个application.properties文件

2.4 在jar包同级目录下创建一个config包，在包中放置application.properties文件


访问： httP://127.0.0.1:8080/项目路径/资源路径

