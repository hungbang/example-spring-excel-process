//package configuration;
//
//import org.springframework.context.annotation.*;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.web.servlet.config.annotation.*;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
///**
// * Created by HungBang on 2/21/2017.
// */
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = {"configuration", "neo.vn.simple.controller"})
//public class ApplicationConfig extends WebMvcConfigurerAdapter{
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/assets/");
//    }
//
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setPrefix("/WEB-INF/views/");
//        registry.viewResolver(viewResolver);
//    }
//
//    //Config to Spring @Value know how to interpret ${}
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer configurer(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//}
