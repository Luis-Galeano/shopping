package py.com.shopp.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.shopp.ejb.mapper.CategoriasMapper;
import py.com.shopp.ejb.model.Categorias;
import py.com.shopp.ejb.model.CategoriasExample;

@RequestScoped
public class CategoriasDAO extends GenericDAO<Categorias, Integer, CategoriasExample, CategoriasMapper> {
    @Inject
    @Mapper
    private CategoriasMapper mapper;

    @Override
    public CategoriasMapper getMapper() {
        return mapper;
    }
}