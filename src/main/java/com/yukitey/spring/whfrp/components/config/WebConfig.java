package com.yukitey.spring.whfrp.components.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.*;

import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
@ComponentScan("com.yukitey.spring.whfrp.components")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    private static final String UTF8 = "UTF-8";
    private static final String VIEWS = "/WEB-INF/templates/";

    private static final String RESOURCES_LOCATION = "/static/";
    private static final String RESOURCES_HANDLER = "classpath:" + RESOURCES_LOCATION + "**";

    private final ApplicationContext applicationContext;

    @Autowired
    public WebConfig(@NonNull final ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    @Description("Thymeleaf Template Resolver")
    public SpringResourceTemplateResolver templateResolver() {
        final SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix(VIEWS);
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        return templateResolver;
    }

    @Bean
    @Description("Thymeleaf Template Engine")
    public SpringTemplateEngine templateEngine() {
        final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    @Bean
    @Description("Thymeleaf View Resolver")
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding(UTF8);
        viewResolver.setOrder(1);
        return viewResolver;
    }

    @Bean
    @Description("Spring Message Resolver")
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }

    @Override
    public void configureViewResolvers(@NonNull final ViewResolverRegistry registry) {
        registry.viewResolver(viewResolver());
    }

    @Override
    public void addResourceHandlers(@NonNull final ResourceHandlerRegistry registry) {
        registry.addResourceHandler(RESOURCES_HANDLER)
                .addResourceLocations(RESOURCES_LOCATION);
    }
}
