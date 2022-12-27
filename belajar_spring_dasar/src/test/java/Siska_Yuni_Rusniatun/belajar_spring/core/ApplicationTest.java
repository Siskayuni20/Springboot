package Siska_Yuni_Rusniatun.belajar_spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {
@Test
void testApplicationtext() {
    ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

    Assertions.assertNotNull(context);
}
}
