package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.controller.PostController;
import org.example.repository.PostRepository;
import org.example.service.PostService;

@Configuration
public class Config {

    @Bean
    public PostController postController(PostService postService) {
        return new PostController(postService);
    }

    @Bean
    public PostService postService(PostRepository postRepository) {
        return new PostService(postRepository);
    }

    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }

}
