1.针对不同的测试环境我们会采用不同的包，这是可以通过profile来指定不同环境下的配置信息
2.激活指定文件的方式
 2.1 properties多文件
 有多个properties配置文件
     在主配置文件(application.properties）中指定
 2.2 yml文件中多配制
 一个yml文件中包含多个种类配置
 注意：用三根杠来区分不同的配置，不能多也不能少

 2.3 在虚拟机参数中指定要选择的配置
 -Dspring.profiles.active=test
 2.4 在设置中 Program arguments中选择配置
--spring.profiles.active=dev
 2.5 运行部署jar包时指定（命令行参数）
 java -jar profile_demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=test