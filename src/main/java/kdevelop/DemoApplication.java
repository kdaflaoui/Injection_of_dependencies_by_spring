package kdevelop;

import kdevelop.dao.DaoImpl;
import kdevelop.dao.IDao;
import kdevelop.metier.IMetier;
import kdevelop.metier.MetierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "kdevelop")
public class DemoApplication implements CommandLineRunner {

    @Autowired
    IMetier metier;


    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        //metier.setDao(dao);
        System.out.println(metier.calcul_temperature());
    }
}
