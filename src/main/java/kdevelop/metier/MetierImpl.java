package kdevelop.metier;

import kdevelop.dao.DaoImpl;
import kdevelop.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("dao")
    private  IDao dao;


    @Override
    public double calcul_temperature() {
        double temperature = dao.getTemperature() * 7;
        return temperature;
    }
}
