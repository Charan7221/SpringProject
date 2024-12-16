package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Devloper dev = (Devloper) context.getBean("devloper");
//        dev.setAge(23);
        System.out.println(dev.getAge());
        dev.FirstCode();

//        dev.age=21;
//        System.out.println(dev.age);
//        Devloper dev1 = (Devloper) context.getBean("devloper");
//        //dev1.FirstCode();
//        dev1.age=22;
//        System.out.println(dev1.age);
//        Desktop desktop = context.getBean("com", Desktop.class);

    }
}
