package org.suptech.atelierspringboot1.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LivreConfig {
    private final LivreRepository livreRepository;

    public LivreConfig(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    @Bean
    CommandLineRunner livre_config() {
        return args -> {
            livreRepository.save(new Livre(null, "H&&M", "Tite", "123-57"));
            livreRepository.findAll().forEach(System.out::println);
        };
    }
}