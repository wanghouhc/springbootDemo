创建
服务端  指定访问路径  server.port=9000



客户端：
#指定admin-server的地址
spring.boot.admin.client.url=http://localhost:9000
#开启所有的详细信息
management.endpoint.health.show-details=always
management.endpoints.web.exposure.include=*
