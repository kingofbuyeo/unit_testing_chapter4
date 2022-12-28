package com.yongchul.unit_testing.config

import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import javax.sql.DataSource


/**
 * <pre>
 * com.yongchul.unit_testing.config
 *   ApplicationContext
 * </pre>
 * @date : 2022/12/28 11:40 오전
 * @author : kim yong chul
 * @describe
 **/
@Configuration
@EnableJpaRepositories(basePackages = ["com.yongchul.unit_testing.domain.repository"])
@EntityScan(basePackages = ["com.yongchul.unit_testing.domain.*"])
class ApplicationContext {
    @Bean("dataSource")
    @ConfigurationProperties("spring.datasource.hikari")
    fun dataSource(): DataSource {
        return DataSourceBuilder.create()
            .type(HikariDataSource::class.java)
            .build()
    }
}