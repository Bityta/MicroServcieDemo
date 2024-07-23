package com.example.portfolioapplication.config;

import com.example.portfolioapplication.controller.PortfolioImpl;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("portfolios")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(PortfolioImpl.class);
    }
}