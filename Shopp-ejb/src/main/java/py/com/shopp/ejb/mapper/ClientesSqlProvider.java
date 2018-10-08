package py.com.shopp.ejb.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import py.com.shopp.ejb.model.Clientes;
import py.com.shopp.ejb.model.ClientesExample.Criteria;
import py.com.shopp.ejb.model.ClientesExample.Criterion;
import py.com.shopp.ejb.model.ClientesExample;

public class ClientesSqlProvider {

    public String countByExample(ClientesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("clientes");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ClientesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("clientes");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Clientes record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("clientes");
        
        if (record.getNombres() != null) {
            sql.VALUES("nombres", "#{nombres,jdbcType=VARCHAR}");
        }
        
        if (record.getApellidos() != null) {
            sql.VALUES("apellidos", "#{apellidos,jdbcType=VARCHAR}");
        }
        
        if (record.getDireccion() != null) {
            sql.VALUES("direccion", "#{direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.VALUES("telefono", "#{telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getCodigoCliente() != null) {
            sql.VALUES("codigo_cliente", "#{codigoCliente,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ClientesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_cliente");
        } else {
            sql.SELECT("id_cliente");
        }
        sql.SELECT("nombres");
        sql.SELECT("apellidos");
        sql.SELECT("direccion");
        sql.SELECT("telefono");
        sql.SELECT("email");
        sql.SELECT("codigo_cliente");
        sql.FROM("clientes");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Clientes record = (Clientes) parameter.get("record");
        ClientesExample example = (ClientesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("clientes");
        
        if (record.getIdCliente() != null) {
            sql.SET("id_cliente = #{record.idCliente,jdbcType=INTEGER}");
        }
        
        if (record.getNombres() != null) {
            sql.SET("nombres = #{record.nombres,jdbcType=VARCHAR}");
        }
        
        if (record.getApellidos() != null) {
            sql.SET("apellidos = #{record.apellidos,jdbcType=VARCHAR}");
        }
        
        if (record.getDireccion() != null) {
            sql.SET("direccion = #{record.direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.SET("telefono = #{record.telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getCodigoCliente() != null) {
            sql.SET("codigo_cliente = #{record.codigoCliente,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("clientes");
        
        sql.SET("id_cliente = #{record.idCliente,jdbcType=INTEGER}");
        sql.SET("nombres = #{record.nombres,jdbcType=VARCHAR}");
        sql.SET("apellidos = #{record.apellidos,jdbcType=VARCHAR}");
        sql.SET("direccion = #{record.direccion,jdbcType=VARCHAR}");
        sql.SET("telefono = #{record.telefono,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("codigo_cliente = #{record.codigoCliente,jdbcType=VARCHAR}");
        
        ClientesExample example = (ClientesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Clientes record) {
        SQL sql = new SQL();
        sql.UPDATE("clientes");
        
        if (record.getNombres() != null) {
            sql.SET("nombres = #{nombres,jdbcType=VARCHAR}");
        }
        
        if (record.getApellidos() != null) {
            sql.SET("apellidos = #{apellidos,jdbcType=VARCHAR}");
        }
        
        if (record.getDireccion() != null) {
            sql.SET("direccion = #{direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.SET("telefono = #{telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getCodigoCliente() != null) {
            sql.SET("codigo_cliente = #{codigoCliente,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id_cliente = #{idCliente,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ClientesExample example, boolean includeExamplePhrase) {
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