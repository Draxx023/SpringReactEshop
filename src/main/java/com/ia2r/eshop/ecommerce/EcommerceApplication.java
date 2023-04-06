package com.ia2r.eshop.ecommerce;

import com.ia2r.eshop.ecommerce.model.Product;
import com.ia2r.eshop.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    private static final AntPathRequestMatcher[] WHITE_LIST_URLS = {
            new AntPathRequestMatcher("/*/**"),
    };

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers(WHITE_LIST_URLS)
                .permitAll();
        http.csrf().disable();
        return http.build();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/products").allowedOrigins("http://localhost:3000");
            }
        };
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(
                    1l,
                    "Aerial Gundam 1/144",
                    "https://riseofgunpla.com/wp-content/uploads/2023/03/aerial_permet_score_6_003-1-1000x1000.jpg",
                    "Aerial Gundam",
                    49.00,
                    50,
                    "PG"
            ));
            productService.save(new Product(
                    2l,
                    "Michaelis Gundam 1/144",
                    "//riseofgunpla.com/wp-content/uploads/2022/09/156_5202_o_1ge1pnrtrr9718ijikbgkh11tv2i-1000x1000.webp",
                    "Michaelis Gundam",
                    19.00,
                    90,
                    "HG"
            ));
            productService.save(new Product(
                    3l,
                    "Perfect Strike Gundam 1/60",
                    "https://riseofgunpla.com/wp-content/uploads/2020/07/pg-perfect_strike-5-1000x1000.webp",
                    "Perfect Strike",
                    280.00,
                    100,
                    "PG"
            ));
            productService.save(new Product(
                    4l,
                    "Age-2 Gundam 1/100",
                    "https://riseofgunpla.com/wp-content/uploads/2022/10/N2216816001007_014-1024x1024.webp",
                    "Age-2 Gundam",
                    85.00,
                    20,
                    "MG"
            ));
            productService.save(new Product(
                    5l,
                    "Astray Gold Gundam 1/144",
                    "https://riseofgunpla.com/wp-content/uploads/2020/07/55485126_581047855743197_3755563676145287168_o-1024x1024.webp",
                    "Astray Gundam",
                    70.00,
                    70,
                    "RG"
            ));
            productService.save(new Product(
                    6l,
                    "EVA-01 Evangelion 01 1/100",
                    "https://riseofgunpla.com/wp-content/uploads/2021/09/1000163907_6-1024x1024.webp",
                    "EVA 01",
                    99.00,
                    111,
                    "RG"
            ));
            productService.save(new Product(
                    7l,
                    "EVA-01 Evangelion 01 1/100",
                    "https://riseofgunpla.com/wp-content/uploads/2021/09/1000163907_6-1024x1024.webp",
                    "EVA 01",
                    99.00,
                    0,
                    "RG"
            ));
            productService.save(new Product(
                    8l,
                    "Hello Kitty Gundam SD",
                    "https://riseofgunpla.com/wp-content/uploads/2020/07/sdex-hello_kitty_rx782-8-1024x1024.webp",
                    "Hello Kitty Gundam",
                    30.00,
                    0,
                    "SD"
            ));
        };
    }
}
