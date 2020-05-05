11.springBoot监控使用
 11.1 导入依赖坐标
 spring-boot-starter-actuator
 11.2 访问http://localhost:8080/acruator

12. 在配置文件中配置info开头的信息
info.name=zhangshan
info.age=23
这样就可以直接访问http://localhost:8080/actuator/info，就可以获取到info的信息

13.在配置文件中开启health的配置
  13.1
       #开启健康检查的完整信息
       management.endpoint.health.show-details=always
  13.2
       获取得到组件，硬件信息

14.#将所有的监控endpoint暴露出来
   management.endpoints.web.exposure.include=*
常用：bean，mapper


