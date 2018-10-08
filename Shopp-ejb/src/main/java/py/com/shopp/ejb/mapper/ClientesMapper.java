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
import py.com.shopp.ejb.model.Clientes;
import py.com.shopp.ejb.model.ClientesExample;

public interface ClientesMapper {
    @SelectProvider(type=ClientesSqlProvider.class, method="countByExample")
    long countByExample(ClientesExample example);

    @DeleteProvider(type=ClientesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClientesExample example);

    @Delete({
        "delete from clientes",
        "where id_cliente = #{idCliente,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idCliente);

    @Insert({
        "insert into clientes (nombres, apellidos, ",
        "direccion, telefono, ",
        "email, codigo_cliente)",
        "values (#{nombres,jdbcType=VARCHAR}, #{apellidos,jdbcType=VARCHAR}, ",
        "#{direccion,jdbcType=VARCHAR}, #{telefono,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{codigoCliente,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idCliente")
    int insert(Clientes record);

    @InsertProvider(type=ClientesSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idCliente")
    int insertSelective(Clientes record);

    @SelectProvider(type=ClientesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="codigo_cliente", property="codigoCliente", jdbcType=JdbcType.VARCHAR)
    })
    List<Clientes> selectByExampleWithRowbounds(ClientesExample example, RowBounds rowBounds);

    @SelectProvider(type=ClientesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="codigo_cliente", property="codigoCliente", jdbcType=JdbcType.VARCHAR)
    })
    List<Clientes> selectByExample(ClientesExample example);

    @Select({
        "select",
        "id_cliente, nombres, apellidos, direccion, telefono, email, codigo_cliente",
        "from clientes",
        "where id_cliente = #{idCliente,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="codigo_cliente", property="codigoCliente", jdbcType=JdbcType.VARCHAR)
    })
    Clientes selectByPrimaryKey(Integer idCliente);

    @UpdateProvider(type=ClientesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Clientes record, @Param("example") ClientesExample example);

    @UpdateProvider(type=ClientesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Clientes record, @Param("example") ClientesExample example);

    @UpdateProvider(type=ClientesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Clientes record);

    @Update({
        "update clientes",
        "set nombres = #{nombres,jdbcType=VARCHAR},",
          "apellidos = #{apellidos,jdbcType=VARCHAR},",
          "direccion = #{direccion,jdbcType=VARCHAR},",
          "telefono = #{telefono,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "codigo_cliente = #{codigoCliente,jdbcType=VARCHAR}",
        "where id_cliente = #{idCliente,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Clientes record);
}