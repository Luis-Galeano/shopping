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
import py.com.shopp.ejb.model.VentasDetalles;
import py.com.shopp.ejb.model.VentasDetallesExample;

public interface VentasDetallesMapper {
    @SelectProvider(type=VentasDetallesSqlProvider.class, method="countByExample")
    long countByExample(VentasDetallesExample example);

    @DeleteProvider(type=VentasDetallesSqlProvider.class, method="deleteByExample")
    int deleteByExample(VentasDetallesExample example);

    @Delete({
        "delete from ventas_detalles",
        "where id_venta_detalle = #{idVentaDetalle,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idVentaDetalle);

    @Insert({
        "insert into ventas_detalles (id_venta_cabecera, id_producto, ",
        "cantidad, precio)",
        "values (#{idVentaCabecera,jdbcType=BIGINT}, #{idProducto,jdbcType=BIGINT}, ",
        "#{cantidad,jdbcType=INTEGER}, #{precio,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idVentaDetalle")
    int insert(VentasDetalles record);

    @InsertProvider(type=VentasDetallesSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idVentaDetalle")
    int insertSelective(VentasDetalles record);

    @SelectProvider(type=VentasDetallesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_venta_detalle", property="idVentaDetalle", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_venta_cabecera", property="idVentaCabecera", jdbcType=JdbcType.BIGINT),
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.BIGINT),
        @Result(column="cantidad", property="cantidad", jdbcType=JdbcType.INTEGER),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT)
    })
    List<VentasDetalles> selectByExampleWithRowbounds(VentasDetallesExample example, RowBounds rowBounds);

    @SelectProvider(type=VentasDetallesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_venta_detalle", property="idVentaDetalle", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_venta_cabecera", property="idVentaCabecera", jdbcType=JdbcType.BIGINT),
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.BIGINT),
        @Result(column="cantidad", property="cantidad", jdbcType=JdbcType.INTEGER),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT)
    })
    List<VentasDetalles> selectByExample(VentasDetallesExample example);

    @Select({
        "select",
        "id_venta_detalle, id_venta_cabecera, id_producto, cantidad, precio",
        "from ventas_detalles",
        "where id_venta_detalle = #{idVentaDetalle,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id_venta_detalle", property="idVentaDetalle", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_venta_cabecera", property="idVentaCabecera", jdbcType=JdbcType.BIGINT),
        @Result(column="id_producto", property="idProducto", jdbcType=JdbcType.BIGINT),
        @Result(column="cantidad", property="cantidad", jdbcType=JdbcType.INTEGER),
        @Result(column="precio", property="precio", jdbcType=JdbcType.BIGINT)
    })
    VentasDetalles selectByPrimaryKey(Integer idVentaDetalle);

    @UpdateProvider(type=VentasDetallesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") VentasDetalles record, @Param("example") VentasDetallesExample example);

    @UpdateProvider(type=VentasDetallesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") VentasDetalles record, @Param("example") VentasDetallesExample example);

    @UpdateProvider(type=VentasDetallesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(VentasDetalles record);

    @Update({
        "update ventas_detalles",
        "set id_venta_cabecera = #{idVentaCabecera,jdbcType=BIGINT},",
          "id_producto = #{idProducto,jdbcType=BIGINT},",
          "cantidad = #{cantidad,jdbcType=INTEGER},",
          "precio = #{precio,jdbcType=BIGINT}",
        "where id_venta_detalle = #{idVentaDetalle,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VentasDetalles record);
}