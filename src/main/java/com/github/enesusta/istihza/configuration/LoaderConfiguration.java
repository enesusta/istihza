package com.github.enesusta.istihza.configuration;

import com.github.enesusta.jloader.DefaultLoader;
import com.github.enesusta.jloader.Loader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoaderConfiguration {

    @Bean
    public Loader loader() {
        return new DefaultLoader();
    }

}
