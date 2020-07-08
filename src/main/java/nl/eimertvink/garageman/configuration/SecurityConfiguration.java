package nl.eimertvink.garageman.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final Environment env;

    @Autowired
    public SecurityConfiguration(Environment env) {
        this.env = env;
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().mvcMatchers("/actuator");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            // disable csrf on client-side stateless urls
            .csrf()
                .ignoringAntMatchers("/api/v1/**")
            .and()
            .authorizeRequests()
            .mvcMatchers("/api/v1/**")
            .authenticated()
            .and()
            .httpBasic();
    }
}
