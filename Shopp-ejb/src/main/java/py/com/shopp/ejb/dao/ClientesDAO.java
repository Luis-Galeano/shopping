package py.com.shopp.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.shopp.ejb.mapper.ClientesMapper;
import py.com.shopp.ejb.model.Clientes;
import py.com.shopp.ejb.model.ClientesExample;

@RequestScoped
public class ClientesDAO extends GenericDAO<Clientes, Integer, ClientesExample, ClientesMapper> {
    @Inject
    @Mapper
    private ClientesMapper mapper;

    @Override
    public ClientesMapper getMapper() {
        return mapper;
    }
}