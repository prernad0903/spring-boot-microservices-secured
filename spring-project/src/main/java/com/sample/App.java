package com.sample;

import com.sample.dao.Student;
import com.sample.repository.StudentRepository;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        // reader.loadBeanDefinitions(new ClassPathResource("application-context.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        StudentRepository studentRepo = (StudentRepository)context.getBean("student-data");

        System.out.println("Offset - " + studentRepo.getOffset() + " Limit - "+ studentRepo.getLimit());

        Student student = (Student)context.getBean("Student");
        System.out.println(student);
    }
}
