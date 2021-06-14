package com.example.mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
/**
 * MybatisConfig 
 *
 * @author chojeonghak@gmail.com
 * @version 1.0
 * @since 2020. 06. 01.
 */
@Configuration
public class MybatisConfig {
	@Bean
	public SqlSessionFactory sqlSessionFactoryBean(DataSource datasource) throws Exception {
	    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	    sqlSessionFactoryBean.setDataSource(datasource);
	    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	    sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));

	    return sqlSessionFactoryBean.getObject();
	  }
	
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
      final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
      return sqlSessionTemplate;
    }
}
