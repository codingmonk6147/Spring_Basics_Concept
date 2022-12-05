package org.codingMonk.SpringBasics;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
       Student student = (Student) context.getBean("student1");
       System.out.println(student);
    }
}
