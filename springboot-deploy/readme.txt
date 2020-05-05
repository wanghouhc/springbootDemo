打包方式
1.jar
  直接使用maven的package
  然后使用指令 java -jar 包名
2.war
  将pom文件中<packaging>war</packaging>
  改造启动项
      @SpringBootApplication
      public class SpringbootDeployApplication extends SpringBootServletInitializer {

      	public static void main(String[] args) {
      		SpringApplication.run(SpringbootDeployApplication.class, args);
      	}

      	@Override
      	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      		return builder.sources(SpringbootDeployApplication.class);
      	}
      }
