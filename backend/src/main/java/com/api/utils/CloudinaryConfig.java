package com.api.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", "dwesoabt0");
        config.put("api_key", "759726311875912");
        config.put("api_secret", "gydvjnXzB_SZeZQs2IJOQt6pmPs");
        return new Cloudinary(config);
    }
}
