Spring+SpringMVC+Mybatis整合。

一、参考链接：https://www.cnblogs.com/wmyskxz/p/8916365.html https://blog.csdn.net/Cs_hnu_scw/article/details/80720206

二、配置通用mapper步骤：
1、配置tk.mybatis.spring.mapper.MapperScannerConfigurer替代org.mybatis.spring
.mapper.MapperScannerConfigurer。
2、编写通用接口（本例中的CommonMpper）.
3、编写业务mapper接口（本例子中的UserDao）,并且继承通用mapper接口（本例中的CommonMpper）。

三、配置通用mapper注意事项：
1、 配置扫描的mapper接口的路径时，不能配置扫描通用mapper所在的包，即确保通用mapper
接口不被扫描到，要不然会报错，比如项目中通用mapper接口在com.hmx.ssm.demo1
.util包下，下面的配置中，basePackage就不能包含该包。
      <bean class="tk.mybatis.spring.mapper.MapperScannerConfigurer">
          <!--//配置扫描的mapper接口的路径，这个和上面配置mybatis的org.mybatis.spring.mapper.MapperScannerConfigure一样-->
          <property name="basePackage" value="com.hmx.ssm.demo1.dao" />
          <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
      </bean>
      
      
四、玩转Mybatis generator插件步骤：
（1）在pom.xml中添加插件的依赖

             <plugin>
				<groupId>org.mybatis.generator</groupId>
				<artifactId>mybatis-generator-maven-plugin</artifactId>
				<version>1.3.2</version>
				<executions>
					<execution>
						<id>Generate MyBatis Artifacts</id>
						<goals>
							<goal>generate</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<!-- generator 工具配置文件的位置 -->
					<configurationFile>src/main/resources/mybatis-generator.xml
					</configurationFile>
					<verbose>true</verbose>
					<overwrite>true</overwrite>
				</configuration>
				<dependencies>
					<dependency>
						<groupId>mysql</groupId>
						<artifactId>mysql-connector-java</artifactId>
						<version>8.0.12</version>
					</dependency>
					<dependency>
						<groupId>org.mybatis.generator</groupId>
						<artifactId>mybatis-generator-core</artifactId>
						<version>1.3.2</version>
					</dependency>
				</dependencies>
			</plugin>
			
（2）编写mybatis generator对应的配置文件(本例中的mybatis-generator.xml,具体看文件的注释)，这个名字要与pom
.xml依赖中设置的是对应的关系。（主要是用于自定义生成的相关配置内容）

（3）为了让我们的生成配置文件具有更好的灵活性，所以，在上面中都是用的引用方式，所以，在（2
）中的同级目录中创建一个便于修改的配置文件，取名字为：mybatisGeneratorinit.properties

（4）上面的配置基本完成，但是这时候，你要确保你的数据库中有对应的数据库名和数据表内容，否则，就需要先进行创建表这些内容哦。

（5）运行插件，进行生成pojp实体类，mapper接口以及mapper.xml映射文件。