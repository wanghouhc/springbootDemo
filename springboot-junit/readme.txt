关于springBoot的测试类整合

1.当测试类在被测试类的子包或者同名包之下时，@SpringBootTest(classes = SpringJunitApplication.class),可以省略classs不写
，在其他情况下不写，会报错