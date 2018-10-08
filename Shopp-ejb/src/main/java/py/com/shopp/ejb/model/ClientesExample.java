package py.com.shopp.ejb.model;

import java.util.ArrayList;
import java.util.List;

public class ClientesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdClienteIsNull() {
            addCriterion("id_cliente is null");
            return (Criteria) this;
        }

        public Criteria andIdClienteIsNotNull() {
            addCriterion("id_cliente is not null");
            return (Criteria) this;
        }

        public Criteria andIdClienteEqualTo(Integer value) {
            addCriterion("id_cliente =", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotEqualTo(Integer value) {
            addCriterion("id_cliente <>", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThan(Integer value) {
            addCriterion("id_cliente >", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cliente >=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThan(Integer value) {
            addCriterion("id_cliente <", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThanOrEqualTo(Integer value) {
            addCriterion("id_cliente <=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteIn(List<Integer> values) {
            addCriterion("id_cliente in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotIn(List<Integer> values) {
            addCriterion("id_cliente not in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteBetween(Integer value1, Integer value2) {
            addCriterion("id_cliente between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cliente not between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andNombresIsNull() {
            addCriterion("nombres is null");
            return (Criteria) this;
        }

        public Criteria andNombresIsNotNull() {
            addCriterion("nombres is not null");
            return (Criteria) this;
        }

        public Criteria andNombresEqualTo(String value) {
            addCriterion("nombres =", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotEqualTo(String value) {
            addCriterion("nombres <>", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThan(String value) {
            addCriterion("nombres >", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThanOrEqualTo(String value) {
            addCriterion("nombres >=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThan(String value) {
            addCriterion("nombres <", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThanOrEqualTo(String value) {
            addCriterion("nombres <=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLike(String value) {
            addCriterion("nombres like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotLike(String value) {
            addCriterion("nombres not like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresIn(List<String> values) {
            addCriterion("nombres in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotIn(List<String> values) {
            addCriterion("nombres not in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresBetween(String value1, String value2) {
            addCriterion("nombres between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotBetween(String value1, String value2) {
            addCriterion("nombres not between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNull() {
            addCriterion("apellidos is null");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNotNull() {
            addCriterion("apellidos is not null");
            return (Criteria) this;
        }

        public Criteria andApellidosEqualTo(String value) {
            addCriterion("apellidos =", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotEqualTo(String value) {
            addCriterion("apellidos <>", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThan(String value) {
            addCriterion("apellidos >", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThanOrEqualTo(String value) {
            addCriterion("apellidos >=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThan(String value) {
            addCriterion("apellidos <", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThanOrEqualTo(String value) {
            addCriterion("apellidos <=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLike(String value) {
            addCriterion("apellidos like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotLike(String value) {
            addCriterion("apellidos not like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosIn(List<String> values) {
            addCriterion("apellidos in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotIn(List<String> values) {
            addCriterion("apellidos not in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosBetween(String value1, String value2) {
            addCriterion("apellidos between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotBetween(String value1, String value2) {
            addCriterion("apellidos not between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNull() {
            addCriterion("direccion is null");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNotNull() {
            addCriterion("direccion is not null");
            return (Criteria) this;
        }

        public Criteria andDireccionEqualTo(String value) {
            addCriterion("direccion =", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotEqualTo(String value) {
            addCriterion("direccion <>", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThan(String value) {
            addCriterion("direccion >", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("direccion >=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThan(String value) {
            addCriterion("direccion <", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThanOrEqualTo(String value) {
            addCriterion("direccion <=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLike(String value) {
            addCriterion("direccion like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotLike(String value) {
            addCriterion("direccion not like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionIn(List<String> values) {
            addCriterion("direccion in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotIn(List<String> values) {
            addCriterion("direccion not in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionBetween(String value1, String value2) {
            addCriterion("direccion between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotBetween(String value1, String value2) {
            addCriterion("direccion not between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNull() {
            addCriterion("telefono is null");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNotNull() {
            addCriterion("telefono is not null");
            return (Criteria) this;
        }

        public Criteria andTelefonoEqualTo(String value) {
            addCriterion("telefono =", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotEqualTo(String value) {
            addCriterion("telefono <>", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThan(String value) {
            addCriterion("telefono >", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("telefono >=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThan(String value) {
            addCriterion("telefono <", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThanOrEqualTo(String value) {
            addCriterion("telefono <=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLike(String value) {
            addCriterion("telefono like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotLike(String value) {
            addCriterion("telefono not like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoIn(List<String> values) {
            addCriterion("telefono in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotIn(List<String> values) {
            addCriterion("telefono not in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoBetween(String value1, String value2) {
            addCriterion("telefono between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotBetween(String value1, String value2) {
            addCriterion("telefono not between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteIsNull() {
            addCriterion("codigo_cliente is null");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteIsNotNull() {
            addCriterion("codigo_cliente is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteEqualTo(String value) {
            addCriterion("codigo_cliente =", value, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteNotEqualTo(String value) {
            addCriterion("codigo_cliente <>", value, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteGreaterThan(String value) {
            addCriterion("codigo_cliente >", value, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteGreaterThanOrEqualTo(String value) {
            addCriterion("codigo_cliente >=", value, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteLessThan(String value) {
            addCriterion("codigo_cliente <", value, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteLessThanOrEqualTo(String value) {
            addCriterion("codigo_cliente <=", value, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteLike(String value) {
            addCriterion("codigo_cliente like", value, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteNotLike(String value) {
            addCriterion("codigo_cliente not like", value, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteIn(List<String> values) {
            addCriterion("codigo_cliente in", values, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteNotIn(List<String> values) {
            addCriterion("codigo_cliente not in", values, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteBetween(String value1, String value2) {
            addCriterion("codigo_cliente between", value1, value2, "codigoCliente");
            return (Criteria) this;
        }

        public Criteria andCodigoClienteNotBetween(String value1, String value2) {
            addCriterion("codigo_cliente not between", value1, value2, "codigoCliente");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}