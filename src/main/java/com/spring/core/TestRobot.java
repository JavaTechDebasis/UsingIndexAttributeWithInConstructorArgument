package com.spring.core;

import com.spring.core.beans.Robot;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestRobot {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Robot robot = factory.getBean("robot", Robot.class);
        System.out.println(robot);
    }
}
