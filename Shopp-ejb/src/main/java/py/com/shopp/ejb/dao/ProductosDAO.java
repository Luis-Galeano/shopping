package py.com.shopp.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.shopp.ejb.mapper.ProductosMapper;
import py.com.shopp.ejb.model.Productos;
import py.com.shopp.ejb.model.ProductosExample;

@RequestScoped
public class ProductosDAO extends GenericDAO<Productos, Integer, ProductosExample, ProductosMapper> {
    @Inject
    @Mapper
    private ProductosMapper mapper;

    @Override
    public ProductosMapper getMapper() {
        return mapper;
    }
}