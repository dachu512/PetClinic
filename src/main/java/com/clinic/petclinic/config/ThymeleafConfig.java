//package com.clinic.petclinic.config;
//
//import com.sun.deploy.util.ArrayUtil;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring5.view.ThymeleafViewResolver;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.ITemplateResolver;
//
//@Configuration
//public class ThymeleafConfig {
//
////    @Bean
////    public ViewResolver htmlViewResolver() {
////        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
////        resolver.setTemplateEngine(templateEngine(htmlTemplateResolver()));
////        resolver.setContentType("text/html");
////        resolver.setCharacterEncoding("UTF-8");
////        resolver.setViewNames(ArrayUtil.array("*.html"));
////        return resolver;
////    }
////
////    private ITemplateResolver htmlTemplateResolver() {
////        SpringResourceTemplateResolver resolver
////                = new SpringResourceTemplateResolver();
////        resolver.setApplicationContext(applicationContext);
////        resolver.setPrefix("/WEB-INF/views/");
////        resolver.setCacheable(false);
////        resolver.setTemplateMode(TemplateMode.HTML);
////        return resolver;
////    }
////
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("/resources/**", "/css/**")
////                .addResourceLocations("/WEB-INF/resources/", "/WEB-INF/css/");
////    }
//}
