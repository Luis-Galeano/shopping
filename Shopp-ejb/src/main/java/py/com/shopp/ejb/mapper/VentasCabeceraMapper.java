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
import py.com.shopp.ejb.model.VentasCabecera;
import py.com.shopp.ejb.model.VentasCabeceraExample;

public interface VentasCabeceraMapper {
    @SelectProvider(type=VentasCabeceraSqlProvider.class, method="countByExample")
    long countByExample(VentasCabeceraExample example);

    @DeleteProvider(type=VentasCabeceraSqlProvider.class, method="deleteByExample")
    int deleteByExample(VentasCabeceraExample example);

    @Delete({
        "delete from ventas_cabecera",
        "where id_venta_cabecera = #{idVentaCabecera,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idVentaCabecera);

    @Insert({
        "insert into ventas_cabecera (fecha_venta, id_cliente, ",
        "total_venta)",
        "values (#{fechaVenta,jdbcType=TIMESTAMP}, #{idCliente,jdbcType=BIGINT}, ",
        "#{totalVenta,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idVentaCabecera")
    int insert(VentasCabecera record);

    @InsertProvider(type=VentasCabeceraSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idVentaCabecera")
    int insertSelective(VentasCabecera record);

    @SelectProvider(type=VentasCabeceraSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_venta_cabecera", property="idVentaCabecera", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="fecha_venta", property="fechaVenta", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.BIGINT),
        @Result(column="total_venta", property="totalVenta", jdbcType=JdbcType.BIGINT)
    })
    List<VentasCabecera> selectByExampleWithRowbounds(VentasCabeceraExample example, RowBounds rowBounds);

    @SelectProvider(type=VentasCabeceraSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_venta_cabecera", property="idVentaCabecera", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="fecha_venta", property="fechaVenta", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.BIGINT),
        @Result(column="total_venta", property="totalVenta", jdbcType=JdbcType.BIGINT)
    })
    List<VentasCabecera> selectByExample(VentasCabeceraExample example);

    @Select({
        "select",
        "id_venta_cabecera, fecha_venta, id_cliente, total_venta",
        "from ventas_cabecera",
        "where id_venta_cabecera = #{idVentaCabecera,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id_venta_cabecera", property="idVentaCabecera", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="fecha_venta", property="fechaVenta", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="id_cliente", property="idCliente", jdbcType=JdbcType.BIGINT),
        @Result(column="total_venta", property="totalVenta", jdbcType=JdbcType.BIGINT)
    })
    VentasCabecera selectByPrimaryKey(Integer idVentaCabecera);

    @UpdateProvider(type=VentasCabeceraSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") VentasCabecera record, @Param("example") VentasCabeceraExample example);

    @UpdateProvider(type=VentasCabeceraSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") VentasCabecera record, @Param("example") VentasCabeceraExample example);

    @UpdateProvider(type=VentasCabeceraSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(VentasCabecera record);

    @Update({
        "update ventas_cabecera",
        "set fecha_venta = #{fechaVenta,jdbcType=TIMESTAMP},",
          "id_cliente = #{idCliente,jdbcType=BIGINT},",
          "total_venta = #{totalVenta,jdbcType=BIGINT}",
        "where id_venta_cabecera = #{idVentaCabecera,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VentasCabecera record);
}