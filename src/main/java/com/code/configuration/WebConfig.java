package com.code.configuration;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class WebConfig {

    @Profile("local")
    public static class LocalConfig {
        @Bean
        public PropertySourcesPlaceholderConfigurer propertiesLocal() {
            PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
            YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
            yaml.setResources(new ClassPathResource("/local/service.yml"));
            propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());
            return propertySourcesPlaceholderConfigurer;
        }
    }

    @Profile("dev")
    public static class DevConfig {
        @Bean
        public PropertySourcesPlaceholderConfigurer propertiesDev() {
            PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
            YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
            yaml.setResources(new ClassPathResource("/dev/service.yml"));
            propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());
            return propertySourcesPlaceholderConfigurer;
        }
    }

    @Profile("prod")
    public static class ProdConfig {
        @Bean
        public PropertySourcesPlaceholderConfigurer propertiesProd() {
            PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
            YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
            yaml.setResources(new ClassPathResource("/prod/service.yml"));
            propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());
            return propertySourcesPlaceholderConfigurer;
        }
    }
}
