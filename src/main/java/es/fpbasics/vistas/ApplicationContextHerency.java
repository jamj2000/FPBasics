package es.fpbasics.vistas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextHerency {

	ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
}
