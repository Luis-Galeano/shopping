package py.com.shopp.ejb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import py.com.shopp.ejb.model.Categorias;
import py.com.shopp.ejb.model.CategoriasExample;

public interface CategoriasMapper {
    @SelectProvider(type=CategoriasSqlProvider.class, method="countByExample")
    long countByExample(CategoriasExample example);

    @DeleteProvider(type=CategoriasSqlProvider.class, method="deleteByExample")
    int deleteByExample(CategoriasExample example);

    @Delete({
        "delete from categorias",
        "where id_categoria = #{idCategoria,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idCategoria);

    @Insert({
        "insert into categorias (nombre)",
        "values (#{nombre,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idCategoria")
    int insert(Categorias record);

    @InsertProvider(type=CategoriasSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idCategoria")
    int insertSelective(Categorias record);

    @SelectProvider(type=CategoriasSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_categoria", property="idCategoria", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    List<Categorias> selectByExampleWithRowbounds(CategoriasExample example, RowBounds rowBounds);

    @SelectProvider(type=CategoriasSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_categoria", property="idCategoria", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    List<Categorias> selectByExample(CategoriasExample example);

    @Select({
        "select",
        "id_categoria, nombre",
        "from categorias",
        "where id_categoria = #{idCategoria,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id_categoria", property="idCategoria", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    Categorias selectByPrimaryKey(Integer idCategoria);

    @UpdateProvider(type=CategoriasSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Categorias record, @Param("example") CategoriasExample example);

    @UpdateProvider(type=CategoriasSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Categorias record, @Param("example") CategoriasExample example);

    @UpdateProvider(type=CategoriasSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Categorias record);

    @Update({
        "update categorias",
        "set nombre = #{nombre,jdbcType=VARCHAR}",
        "where id_categoria = #{idCategoria,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Categorias record);
}