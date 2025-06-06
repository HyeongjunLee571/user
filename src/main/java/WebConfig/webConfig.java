package WebConfig;

import filter.LoginFilter;
import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class webConfig {

    @Bean
    public FilterRegistrationBean loginFilter(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean= new FilterRegistrationBean<>();

        filterFilterRegistrationBean.setFilter(new LoginFilter());

        filterFilterRegistrationBean.setOrder(1);
        filterFilterRegistrationBean.addUrlPatterns("/*");

        return filterFilterRegistrationBean;
    }
}
