package py.com.shopp.ejb.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import py.com.shopp.ejb.model.VentasDetalles;
import py.com.shopp.ejb.model.VentasDetallesExample.Criteria;
import py.com.shopp.ejb.model.VentasDetallesExample.Criterion;
import py.com.shopp.ejb.model.VentasDetallesExample;

public class VentasDetallesSqlProvider {

    public String countByExample(VentasDetallesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ventas_detalles");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(VentasDetallesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ventas_detalles");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(VentasDetalles record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ventas_detalles");
        
        if (record.getIdVentaCabecera() != null) {
            sql.VALUES("id_venta_cabecera", "#{idVentaCabecera,jdbcType=BIGINT}");
        }
        
        if (record.getIdProducto() != null) {
            sql.VALUES("id_producto", "#{idProducto,jdbcType=BIGINT}");
        }
        
        if (record.getCantidad() != null) {
            sql.VALUES("cantidad", "#{cantidad,jdbcType=INTEGER}");
        }
        
        if (record.getPrecio() != null) {
            sql.VALUES("precio", "#{precio,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(VentasDetallesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_venta_detalle");
        } else {
            sql.SELECT("id_venta_detalle");
        }
        sql.SELECT("id_venta_cabecera");
        sql.SELECT("id_producto");
        sql.SELECT("cantidad");
        sql.SELECT("precio");
        sql.FROM("ventas_detalles");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        VentasDetalles record = (VentasDetalles) parameter.get("record");
        VentasDetallesExample example = (VentasDetallesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ventas_detalles");
        
        if (record.getIdVentaDetalle() != null) {
            sql.SET("id_venta_detalle = #{record.idVentaDetalle,jdbcType=INTEGER}");
        }
        
        if (record.getIdVentaCabecera() != null) {
            sql.SET("id_venta_cabecera = #{record.idVentaCabecera,jdbcType=BIGINT}");
        }
        
        if (record.getIdProducto() != null) {
            sql.SET("id_producto = #{record.idProducto,jdbcType=BIGINT}");
        }
        
        if (record.getCantidad() != null) {
            sql.SET("cantidad = #{record.cantidad,jdbcType=INTEGER}");
        }
        
        if (record.getPrecio() != null) {
            sql.SET("precio = #{record.precio,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ventas_detalles");
        
        sql.SET("id_venta_detalle = #{record.idVentaDetalle,jdbcType=INTEGER}");
        sql.SET("id_venta_cabecera = #{record.idVentaCabecera,jdbcType=BIGINT}");
        sql.SET("id_producto = #{record.idProducto,jdbcType=BIGINT}");
        sql.SET("cantidad = #{record.cantidad,jdbcType=INTEGER}");
        sql.SET("precio = #{record.precio,jdbcType=BIGINT}");
        
        VentasDetallesExample example = (VentasDetallesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(VentasDetalles record) {
        SQL sql = new SQL();
        sql.UPDATE("ventas_detalles");
        
        if (record.getIdVentaCabecera() != null) {
            sql.SET("id_venta_cabecera = #{idVentaCabecera,jdbcType=BIGINT}");
        }
        
        if (record.getIdProducto() != null) {
            sql.SET("id_producto = #{idProducto,jdbcType=BIGINT}");
        }
        
        if (record.getCantidad() != null) {
            sql.SET("cantidad = #{cantidad,jdbcType=INTEGER}");
        }
        
        if (record.getPrecio() != null) {
            sql.SET("precio = #{precio,jdbcType=BIGINT}");
        }
        
        sql.WHERE("id_venta_detalle = #{idVentaDetalle,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, VentasDetallesExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}