package example.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws BeansException {
        
        example3();
    }

    private static void example3() {
        ApplicationContext context = (org.springframework.context.ApplicationContext) new ClassPathXmlApplicationContext("context-3.xml");
        //файл context-1.xml содержит несявязанные между собой объекты "park", "watchman"
        Park p = context.getBean("park4", Park.class);
        System.out.println("p = " + p);
        Watchman w = context.getBean("watchman4", Watchman.class);
        System.out.println("w = " + w);

        p.doNoise();
        p.walkOnTheGrass();
    }

    private static void example2() throws BeansException {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-2.xml");
        Park p1 = context.getBean("park22", Park.class);
        Park p2 = context.getBean("park3", Park.class);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
    }

    private static void example1() throws BeansException {
        ApplicationContext context = (org.springframework.context.ApplicationContext) new ClassPathXmlApplicationContext("context-1.xml");
       //файл context-1.xml содержит несявязанные между собой объекты "park", "watchman"
        Park p = context.getBean("park", Park.class);
        System.out.println("p = " + p);
        Watchman w = context.getBean("watchman", Watchman.class);
        System.out.println("w = " + w);

        p.doNoise();
        p.walkOnTheGrass();
    }

    private static void example0() {
        Manager m = new Manager();
        Context context = m.getContext2();

        Park p = context.getPark();
        System.out.println("p = " + p);
        Watchman w = context.getWatchman();
        System.out.println("w = " + w);

        p.doNoise();
        p.walkOnTheGrass();
    }
}