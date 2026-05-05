package com.yukitey.spring.whfrp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.lang.NonNull;

public class ServletInitializer extends SpringBootServletInitializer {

    @NonNull
    @Override
    protected SpringApplicationBuilder configure(@NonNull final SpringApplicationBuilder builder) {
        return builder.sources(WHFRolePlayCadToolApplication.class);
    }
}