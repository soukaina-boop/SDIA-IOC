package net.soukaina.pres;

import net.soukaina.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("net.soukaina");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Res= "+metier.calcul());
    }
}
