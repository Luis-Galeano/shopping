package py.com.shopp.ejb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VentasCabeceraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VentasCabeceraExample() {
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

        public Criteria andIdVentaCabeceraIsNull() {
            addCriterion("id_venta_cabecera is null");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraIsNotNull() {
            addCriterion("id_venta_cabecera is not null");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraEqualTo(Integer value) {
            addCriterion("id_venta_cabecera =", value, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraNotEqualTo(Integer value) {
            addCriterion("id_venta_cabecera <>", value, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraGreaterThan(Integer value) {
            addCriterion("id_venta_cabecera >", value, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_venta_cabecera >=", value, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraLessThan(Integer value) {
            addCriterion("id_venta_cabecera <", value, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraLessThanOrEqualTo(Integer value) {
            addCriterion("id_venta_cabecera <=", value, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraIn(List<Integer> values) {
            addCriterion("id_venta_cabecera in", values, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraNotIn(List<Integer> values) {
            addCriterion("id_venta_cabecera not in", values, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraBetween(Integer value1, Integer value2) {
            addCriterion("id_venta_cabecera between", value1, value2, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andIdVentaCabeceraNotBetween(Integer value1, Integer value2) {
            addCriterion("id_venta_cabecera not between", value1, value2, "idVentaCabecera");
            return (Criteria) this;
        }

        public Criteria andFechaVentaIsNull() {
            addCriterion("fecha_venta is null");
            return (Criteria) this;
        }

        public Criteria andFechaVentaIsNotNull() {
            addCriterion("fecha_venta is not null");
            return (Criteria) this;
        }

        public Criteria andFechaVentaEqualTo(Date value) {
            addCriterion("fecha_venta =", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaNotEqualTo(Date value) {
            addCriterion("fecha_venta <>", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaGreaterThan(Date value) {
            addCriterion("fecha_venta >", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_venta >=", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaLessThan(Date value) {
            addCriterion("fecha_venta <", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaLessThanOrEqualTo(Date value) {
            addCriterion("fecha_venta <=", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaIn(List<Date> values) {
            addCriterion("fecha_venta in", values, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaNotIn(List<Date> values) {
            addCriterion("fecha_venta not in", values, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaBetween(Date value1, Date value2) {
            addCriterion("fecha_venta between", value1, value2, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaNotBetween(Date value1, Date value2) {
            addCriterion("fecha_venta not between", value1, value2, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andIdClienteIsNull() {
            addCriterion("id_cliente is null");
            return (Criteria) this;
        }

        public Criteria andIdClienteIsNotNull() {
            addCriterion("id_cliente is not null");
            return (Criteria) this;
        }

        public Criteria andIdClienteEqualTo(Long value) {
            addCriterion("id_cliente =", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotEqualTo(Long value) {
            addCriterion("id_cliente <>", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThan(Long value) {
            addCriterion("id_cliente >", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThanOrEqualTo(Long value) {
            addCriterion("id_cliente >=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThan(Long value) {
            addCriterion("id_cliente <", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThanOrEqualTo(Long value) {
            addCriterion("id_cliente <=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteIn(List<Long> values) {
            addCriterion("id_cliente in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotIn(List<Long> values) {
            addCriterion("id_cliente not in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteBetween(Long value1, Long value2) {
            addCriterion("id_cliente between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotBetween(Long value1, Long value2) {
            addCriterion("id_cliente not between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andTotalVentaIsNull() {
            addCriterion("total_venta is null");
            return (Criteria) this;
        }

        public Criteria andTotalVentaIsNotNull() {
            addCriterion("total_venta is not null");
            return (Criteria) this;
        }

        public Criteria andTotalVentaEqualTo(Long value) {
            addCriterion("total_venta =", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaNotEqualTo(Long value) {
            addCriterion("total_venta <>", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaGreaterThan(Long value) {
            addCriterion("total_venta >", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaGreaterThanOrEqualTo(Long value) {
            addCriterion("total_venta >=", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaLessThan(Long value) {
            addCriterion("total_venta <", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaLessThanOrEqualTo(Long value) {
            addCriterion("total_venta <=", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaIn(List<Long> values) {
            addCriterion("total_venta in", values, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaNotIn(List<Long> values) {
            addCriterion("total_venta not in", values, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaBetween(Long value1, Long value2) {
            addCriterion("total_venta between", value1, value2, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaNotBetween(Long value1, Long value2) {
            addCriterion("total_venta not between", value1, value2, "totalVenta");
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