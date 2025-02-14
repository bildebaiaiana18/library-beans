package com.example.library;

import com.example.library.config.AppConfig;
import com.example.library.model.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Library library = context.getBean(Library.class);
        library.showBooks();
    }
}
