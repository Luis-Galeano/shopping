package py.com.shopp.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.shopp.ejb.mapper.VentasCabeceraMapper;
import py.com.shopp.ejb.model.VentasCabecera;
import py.com.shopp.ejb.model.VentasCabeceraExample;

@RequestScoped
public class VentasCabeceraDAO extends GenericDAO<VentasCabecera, Integer, VentasCabeceraExample, VentasCabeceraMapper> {
    @Inject
    @Mapper
    private VentasCabeceraMapper mapper;

    @Override
    public VentasCabeceraMapper getMapper() {
        return mapper;
    }
}