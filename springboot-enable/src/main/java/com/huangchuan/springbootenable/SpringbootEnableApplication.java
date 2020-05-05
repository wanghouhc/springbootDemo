package com.huangchuan.springbootenable;

import com.huangchuan.config.EnableUser;
import com.huangchuan.config.MyImportBeanDefinitionRegister;
import com.huangchuan.config.MyImportSelector;
import com.huangchuan.config.UserConfig;
import com.huangchuan.pojo.Role;
import com.huangchuan.pojo.User;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;

import java.util.Map;


//@ComponentScan("com.huangchuan.config")
//@Import(UserConfig.class)
//@EnableUser


//1.使用bean
//@Import(User.class)

//2.导入配置类
//@Import(UserConfig.class)

//3.导入ImportSelector实现类
//@Import(MyImportSelector.class)

//4.导入ImportBeanDefinitionRegister实现类
@SpringBootApplication
@Import(MyImportBeanDefinitionRegister.class)
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);
        //获取bean
		/*Object user = context.getBean("user");
		System.out.println(user);*/

		/*User user = context.getBean(User.class);
		System.out.println(user);
*/
		/*Role role = context.getBean(Role.class);
		System.out.println(role);*/

		/*Map<String, User> beansOfType = context.getBeansOfType(User.class);
		System.out.println(beansOfType );*/
//这里获取到的是自定义的jedis
        Jedis jedisBean = context.getBean(Jedis.class);
        System.out.println(jedisBean);

        jedisBean.set("name", "itcast");
        String name = jedisBean.get("name");
        System.out.println(name);
    }

    @Bean
    public Jedis jedis() {
        return new Jedis("localhost", 6379);
    }
}
