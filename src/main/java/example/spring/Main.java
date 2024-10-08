package example.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) throws BeansException {
        
      //  example3();
      //  example4Cars();
        example5Cars();
    }

    private static void example5Cars() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-5 car.xml");
        Person pers1 = context.getBean("sveta", Person.class);
        System.out.println("pers1 = " + pers1);
        Person pers2 = context.getBean("lena", Person.class);
        System.out.println("pers2 = " + pers2);
        Person pers3 = context.getBean("olya", Person.class);
        System.out.println("pers3 = " + pers3);
    }

    private static void example4Cars() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-4 car.xml");
        Car c = context.getBean("bibika", Car.class);
        System.out.println("c = " + c);
        Person person = context.getBean("vasya", Person.class);
        System.out.println("person = " + person);
        
        Person p2 = c.owner;
        System.out.println("p2 = " + p2);
    }

    private static void example3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-3.xml");
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
        ApplicationContext context = new ClassPathXmlApplicationContext("context-1.xml");
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