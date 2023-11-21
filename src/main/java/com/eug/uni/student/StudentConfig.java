package com.eug.uni.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student crisp = new Student(
                    "Crisp",
                    "crispyPop@gmail.com",
                    LocalDate.of(1992, Month.AUGUST, 14)
            );

            Student alex = new Student(
                    "Alex",
                    "dringeAlex@gmail.com",
                    LocalDate.of(1993, Month.DECEMBER, 7)
            );

            repository.saveAll(List.of(crisp, alex));


        };
    }
}
