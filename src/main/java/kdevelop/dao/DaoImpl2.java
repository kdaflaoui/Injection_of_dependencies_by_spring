package kdevelop.dao;


import org.springframework.stereotype.Component;

@Component(value = "dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getTemperature() {
        return 12;
    }
}
