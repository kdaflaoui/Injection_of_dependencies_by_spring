package kdevelop.vue;

import kdevelop.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCtr {

    public static void main(String[] args){

        ApplicationContext ctx = new AnnotationConfigApplicationContext("kdevelop");
        IMetier metier = ctx.getBean(IMetier.class);
        System.out.println(metier.calcul_temperature());

    }
}
