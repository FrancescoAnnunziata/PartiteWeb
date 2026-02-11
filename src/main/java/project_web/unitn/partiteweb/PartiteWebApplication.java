package project_web.unitn.partiteweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PartiteWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PartiteWebApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PartiteWebApplication.class);
    }
}
