package com.dockerstarter.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/emps/**")
                        .uri("lb://CLIENT-CONFIG")
                        .id("employeeModule"))

                .route(r -> r.path("/dashboard/**")
                        .uri("lb://EmployeeDashBoard")
                        .id("dashboardModule"))
                .build();
    }
}
