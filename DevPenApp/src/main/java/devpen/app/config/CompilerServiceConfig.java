package devpen.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompilerServiceConfig {

    @Bean
    public String compilerServiceUri(@Value("${compiler.service.uri}") String compilerServiceUri) {
        return compilerServiceUri;
    }

}
