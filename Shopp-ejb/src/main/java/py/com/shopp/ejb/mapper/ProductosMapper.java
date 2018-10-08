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
import py.com.shopp.ejb.model.Productos;
import py.com.shopp.ejb.model.ProductosExample;

public interface ProductosMapper {
    @SelectProvider(type=ProductosSqlProvider.class, method="countByExample")
    long countByExample(ProductosExample example);

    @DeleteProvider(type=ProductosSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProductosExample example);

    @Delete({
        "delete from productos",
        "where id_producto = #{idProducto,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idProducto);

    @Insert({
        "insert into productos (nombre, descripcion, ",
        "precio, stock, id_categoria)",
        "values (#{nombre,jdbcType=VARCHAR}, #{descripcion,jdbcType=VARCHAR}, ",
        "#{precio,jdbcType=BIGINT}, #{stock,jdbcType=BIGINT}, #{idCategoria,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idProducto")
    int insert(Productos record);

    @InsertProvider(type=ProductosSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idProducto")
    int insertSelective(Productos record);

    @SelectProvider(type=ProductosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="descripcion", property="descripcion", jdbcType=JdbcType.VARCHAR),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT),
        @Result(column="stock", property="stock", jdbcType=JdbcType.BIGINT),
        @Result(column="id_categoria", property="idCategoria", jdbcType=JdbcType.BIGINT)
    })
    List<Productos> selectByExampleWithRowbounds(ProductosExample example, RowBounds rowBounds);

    @SelectProvider(type=ProductosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="descripcion", property="descripcion", jdbcType=JdbcType.VARCHAR),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT),
        @Result(column="stock", property="stock", jdbcType=JdbcType.BIGINT),
        @Result(column="id_categoria", property="idCategoria", jdbcType=JdbcType.BIGINT)
    })
    List<Productos> selectByExample(ProductosExample example);

    @Select({
        "select",
        "id_producto, nombre, descripcion, precio, stock, id_categoria",
        "from productos",
        "where id_producto = #{idProducto,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="descripcion", property="descripcion", jdbcType=JdbcType.VARCHAR),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT),
        @Result(column="stock", property="stock", jdbcType=JdbcType.BIGINT),
        @Result(column="id_categoria", property="idCategoria", jdbcType=JdbcType.BIGINT)
    })
    Productos selectByPrimaryKey(Integer idProducto);

    @UpdateProvider(type=ProductosSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Productos record, @Param("example") ProductosExample example);

    @UpdateProvider(type=ProductosSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Productos record, @Param("example") ProductosExample example);

    @UpdateProvider(type=ProductosSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Productos record);

    @Update({
        "update productos",
        "set nombre = #{nombre,jdbcType=VARCHAR},",
          "descripcion = #{descripcion,jdbcType=VARCHAR},",
          "precio = #{precio,jdbcType=BIGINT},",
          "stock = #{stock,jdbcType=BIGINT},",
          "id_categoria = #{idCategoria,jdbcType=BIGINT}",
        "where id_producto = #{idProducto,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Productos record);
}