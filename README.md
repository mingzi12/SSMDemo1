Spring+SpringMVC+Mybatis整合。

一、参考链接：https://www.cnblogs.com/wmyskxz/p/8916365.html

二、配置通用mapper注意事项：
1、 配置扫描的mapper接口的路径时，不能配置扫描通用mapper所在的包，即确保通用mapper
接口不被扫描到，要不然会报错，比如项目中通用mapper接口在com.hmx.ssm.demo1
.util包下，下面的配置中，basePackage就不能包含该包。
      <bean class="tk.mybatis.spring.mapper.MapperScannerConfigurer">
          <!--//配置扫描的mapper接口的路径，这个和上面配置mybatis的org.mybatis.spring.mapper.MapperScannerConfigure一样-->
          <property name="basePackage" value="com.hmx.ssm.demo1.dao" />
          <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
      </bean>