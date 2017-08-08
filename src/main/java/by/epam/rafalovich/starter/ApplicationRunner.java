package by.epam.rafalovich.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("by.epam.rafalovich.config")
public class ApplicationRunner
{
    public static void main(String[] args) throws Throwable
    {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}
