这是一个关于springBoot的配置文件的说明
1.配置文件一般有三种
  1.1 application.properties
  1.2 application.yml
  1.3 application.yaml
  -----------------
2.优先级
由1.1-1.3 优先级逐渐降低（你可以测试一下）
--------------------
3.配置文件可以用来指定程序启动的端口，以及路径
指定端口
server.port=18080
指定路径前缀
server.servlet.context-path=/demo  当你在方法前加路径@RequestMapping("/hello") 那么在访问时，需要在/hello前加上/demo前缀
--------------
4.可以通过 @Value("${在配置文件中自定义的数据的key}")  来获取在配置文件中自定义的数据
------------
5.单个获取自定义数据格式
 5.1 数组
 5.2 map
 5.3 纯量（常量）
    5.3.1 单引号 不会识别转义字符，会直接打印
    5.3.2 双引号 会识别转义字符，转义字符不会打印

 #对象（map）键值对集合
 person:
   name: zhangshanne
 #在同一行的写法
 #person: {name: zhangshan}

 #数组
 address:
   - beijin
   - shanghai
 #在同一行的写法
 #address: [beijin,shanghai]

 #纯量
 msg1: 'hello \n world'
 msg2: "hello \n world"
 -----------------------------------------
 7.enviorment获取自定义的值
 -----------------
 8.@configurationProperties 自动注入到对象中
 在和配置文件中所需要注入的属性，构建成一个类
 @Component
 @ConfigurationProperties

