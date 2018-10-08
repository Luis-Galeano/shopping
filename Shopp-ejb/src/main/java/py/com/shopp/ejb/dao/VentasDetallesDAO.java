package py.com.shopp.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.shopp.ejb.mapper.VentasDetallesMapper;
import py.com.shopp.ejb.model.VentasDetalles;
import py.com.shopp.ejb.model.VentasDetallesExample;

@RequestScoped
public class VentasDetallesDAO extends GenericDAO<VentasDetalles, Integer, VentasDetallesExample, VentasDetallesMapper> {
    @Inject
    @Mapper
    private VentasDetallesMapper mapper;

    @Override
    public VentasDetallesMapper getMapper() {
        return mapper;
    }
}