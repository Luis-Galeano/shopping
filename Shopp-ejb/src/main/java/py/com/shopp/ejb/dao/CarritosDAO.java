package py.com.shopp.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.shopp.ejb.mapper.CarritosMapper;
import py.com.shopp.ejb.model.Carritos;
import py.com.shopp.ejb.model.CarritosExample;

@RequestScoped
public class CarritosDAO extends GenericDAO<Carritos, Integer, CarritosExample, CarritosMapper> {
    @Inject
    @Mapper
    private CarritosMapper mapper;

    @Override
    public CarritosMapper getMapper() {
        return mapper;
    }
}