package kdevelop.dao;

import org.springframework.stereotype.Component;

@Component(value = "dao")
public class DaoImpl implements  IDao {
    @Override
    public double getTemperature() {
        double temperatue = 5;
        return temperatue;
    }
}
