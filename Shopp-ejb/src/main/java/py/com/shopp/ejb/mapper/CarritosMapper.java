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
import py.com.shopp.ejb.model.Carritos;
import py.com.shopp.ejb.model.CarritosExample;

public interface CarritosMapper {
    @SelectProvider(type=CarritosSqlProvider.class, method="countByExample")
    long countByExample(CarritosExample example);

    @DeleteProvider(type=CarritosSqlProvider.class, method="deleteByExample")
    int deleteByExample(CarritosExample example);

    @Delete({
        "delete from carritos",
        "where id_carrito = #{idCarrito,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idCarrito);

    @Insert({
        "insert into carritos (id_producto, id_cliente, ",
        "cantidad, precio, ",
        "estado_checkout)",
        "values (#{idProducto,jdbcType=BIGINT}, #{idCliente,jdbcType=BIGINT}, ",
        "#{cantidad,jdbcType=INTEGER}, #{precio,jdbcType=BIGINT}, ",
        "#{estadoCheckout,jdbcType=INTEGER})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idCarrito")
    int insert(Carritos record);

    @InsertProvider(type=CarritosSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idCarrito")
    int insertSelective(Carritos record);

    @SelectProvider(type=CarritosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_carrito", property="idCarrito", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.BIGINT),
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.BIGINT),
        @Result(column="cantidad", property="cantidad", jdbcType=JdbcType.INTEGER),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT),
        @Result(column="estado_checkout", property="estadoCheckout", jdbcType=JdbcType.INTEGER)
    })
    List<Carritos> selectByExampleWithRowbounds(CarritosExample example, RowBounds rowBounds);

    @SelectProvider(type=CarritosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_carrito", property="idCarrito", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.BIGINT),
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.BIGINT),
        @Result(column="cantidad", property="cantidad", jdbcType=JdbcType.INTEGER),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT),
        @Result(column="estado_checkout", property="estadoCheckout", jdbcType=JdbcType.INTEGER)
    })
    List<Carritos> selectByExample(CarritosExample example);

    @Select({
        "select",
        "id_carrito, id_producto, id_cliente, cantidad, precio, estado_checkout",
        "from carritos",
        "where id_carrito = #{idCarrito,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id_carrito", property="idCarrito", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.BIGINT),
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.BIGINT),
        @Result(column="cantidad", property="cantidad", jdbcType=JdbcType.INTEGER),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT),
        @Result(column="estado_checkout", property="estadoCheckout", jdbcType=JdbcType.INTEGER)
    })
    Carritos selectByPrimaryKey(Integer idCarrito);

    @UpdateProvider(type=CarritosSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Carritos record, @Param("example") CarritosExample example);

    @UpdateProvider(type=CarritosSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Carritos record, @Param("example") CarritosExample example);

    @UpdateProvider(type=CarritosSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Carritos record);

    @Update({
        "update carritos",
        "set id_producto = #{idProducto,jdbcType=BIGINT},",
          "id_cliente = #{idCliente,jdbcType=BIGINT},",
          "cantidad = #{cantidad,jdbcType=INTEGER},",
          "precio = #{precio,jdbcType=BIGINT},",
          "estado_checkout = #{estadoCheckout,jdbcType=INTEGER}",
        "where id_carrito = #{idCarrito,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Carritos record);
}