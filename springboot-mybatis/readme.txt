1.springBoot整合mybatis

2,对数据库操作的方式
 2.1 注解方式
   创建一个mapper包，然后在包中创建一个@Mapper抽象方法对数据库操作
    @Select("select * from tableName")
       public List<User> findAll();
 2.2 xml配置文件方式、
   2.2.1 在resource下创建一个mapper.UserMapper.xml文件，
   2.2.2 在UserMapper.xml编写sql操作
   2.2.3 在application.yml配置mybatis配置

   mybatis:
     config-location: #指定mybatis的核心配置文件
     mapper-locations:
        classpath:
          mapper/*Mapper.xml  #mybatis的映射文件路径
     type-aliases-package:   #对那个路径下的包取别名

   2.2.4 将

