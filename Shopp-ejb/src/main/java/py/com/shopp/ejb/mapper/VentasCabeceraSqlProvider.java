package py.com.shopp.ejb.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import py.com.shopp.ejb.model.VentasCabecera;
import py.com.shopp.ejb.model.VentasCabeceraExample.Criteria;
import py.com.shopp.ejb.model.VentasCabeceraExample.Criterion;
import py.com.shopp.ejb.model.VentasCabeceraExample;

public class VentasCabeceraSqlProvider {

    public String countByExample(VentasCabeceraExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ventas_cabecera");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(VentasCabeceraExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ventas_cabecera");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(VentasCabecera record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ventas_cabecera");
        
        if (record.getFechaVenta() != null) {
            sql.VALUES("fecha_venta", "#{fechaVenta,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIdCliente() != null) {
            sql.VALUES("id_cliente", "#{idCliente,jdbcType=BIGINT}");
        }
        
        if (record.getTotalVenta() != null) {
            sql.VALUES("total_venta", "#{totalVenta,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(VentasCabeceraExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_venta_cabecera");
        } else {
            sql.SELECT("id_venta_cabecera");
        }
        sql.SELECT("fecha_venta");
        sql.SELECT("id_cliente");
        sql.SELECT("total_venta");
        sql.FROM("ventas_cabecera");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        VentasCabecera record = (VentasCabecera) parameter.get("record");
        VentasCabeceraExample example = (VentasCabeceraExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ventas_cabecera");
        
        if (record.getIdVentaCabecera() != null) {
            sql.SET("id_venta_cabecera = #{record.idVentaCabecera,jdbcType=INTEGER}");
        }
        
        if (record.getFechaVenta() != null) {
            sql.SET("fecha_venta = #{record.fechaVenta,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIdCliente() != null) {
            sql.SET("id_cliente = #{record.idCliente,jdbcType=BIGINT}");
        }
        
        if (record.getTotalVenta() != null) {
            sql.SET("total_venta = #{record.totalVenta,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ventas_cabecera");
        
        sql.SET("id_venta_cabecera = #{record.idVentaCabecera,jdbcType=INTEGER}");
        sql.SET("fecha_venta = #{record.fechaVenta,jdbcType=TIMESTAMP}");
        sql.SET("id_cliente = #{record.idCliente,jdbcType=BIGINT}");
        sql.SET("total_venta = #{record.totalVenta,jdbcType=BIGINT}");
        
        VentasCabeceraExample example = (VentasCabeceraExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(VentasCabecera record) {
        SQL sql = new SQL();
        sql.UPDATE("ventas_cabecera");
        
        if (record.getFechaVenta() != null) {
            sql.SET("fecha_venta = #{fechaVenta,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIdCliente() != null) {
            sql.SET("id_cliente = #{idCliente,jdbcType=BIGINT}");
        }
        
        if (record.getTotalVenta() != null) {
            sql.SET("total_venta = #{totalVenta,jdbcType=BIGINT}");
        }
        
        sql.WHERE("id_venta_cabecera = #{idVentaCabecera,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, VentasCabeceraExample example, boolean includeExamplePhrase) {
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