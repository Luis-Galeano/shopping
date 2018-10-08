package py.com.shopp.ejb.model;

import java.util.ArrayList;
import java.util.List;

public class CarritosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarritosExample() {
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

        public Criteria andIdCarritoIsNull() {
            addCriterion("id_carrito is null");
            return (Criteria) this;
        }

        public Criteria andIdCarritoIsNotNull() {
            addCriterion("id_carrito is not null");
            return (Criteria) this;
        }

        public Criteria andIdCarritoEqualTo(Integer value) {
            addCriterion("id_carrito =", value, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoNotEqualTo(Integer value) {
            addCriterion("id_carrito <>", value, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoGreaterThan(Integer value) {
            addCriterion("id_carrito >", value, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_carrito >=", value, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoLessThan(Integer value) {
            addCriterion("id_carrito <", value, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoLessThanOrEqualTo(Integer value) {
            addCriterion("id_carrito <=", value, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoIn(List<Integer> values) {
            addCriterion("id_carrito in", values, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoNotIn(List<Integer> values) {
            addCriterion("id_carrito not in", values, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoBetween(Integer value1, Integer value2) {
            addCriterion("id_carrito between", value1, value2, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdCarritoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_carrito not between", value1, value2, "idCarrito");
            return (Criteria) this;
        }

        public Criteria andIdProductoIsNull() {
            addCriterion("id_producto is null");
            return (Criteria) this;
        }

        public Criteria andIdProductoIsNotNull() {
            addCriterion("id_producto is not null");
            return (Criteria) this;
        }

        public Criteria andIdProductoEqualTo(Long value) {
            addCriterion("id_producto =", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoNotEqualTo(Long value) {
            addCriterion("id_producto <>", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoGreaterThan(Long value) {
            addCriterion("id_producto >", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoGreaterThanOrEqualTo(Long value) {
            addCriterion("id_producto >=", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoLessThan(Long value) {
            addCriterion("id_producto <", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoLessThanOrEqualTo(Long value) {
            addCriterion("id_producto <=", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoIn(List<Long> values) {
            addCriterion("id_producto in", values, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoNotIn(List<Long> values) {
            addCriterion("id_producto not in", values, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoBetween(Long value1, Long value2) {
            addCriterion("id_producto between", value1, value2, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoNotBetween(Long value1, Long value2) {
            addCriterion("id_producto not between", value1, value2, "idProducto");
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

        public Criteria andCantidadIsNull() {
            addCriterion("cantidad is null");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNotNull() {
            addCriterion("cantidad is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadEqualTo(Integer value) {
            addCriterion("cantidad =", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotEqualTo(Integer value) {
            addCriterion("cantidad <>", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThan(Integer value) {
            addCriterion("cantidad >", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("cantidad >=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThan(Integer value) {
            addCriterion("cantidad <", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThanOrEqualTo(Integer value) {
            addCriterion("cantidad <=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadIn(List<Integer> values) {
            addCriterion("cantidad in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotIn(List<Integer> values) {
            addCriterion("cantidad not in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadBetween(Integer value1, Integer value2) {
            addCriterion("cantidad between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotBetween(Integer value1, Integer value2) {
            addCriterion("cantidad not between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andPrecioIsNull() {
            addCriterion("precio is null");
            return (Criteria) this;
        }

        public Criteria andPrecioIsNotNull() {
            addCriterion("precio is not null");
            return (Criteria) this;
        }

        public Criteria andPrecioEqualTo(Long value) {
            addCriterion("precio =", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotEqualTo(Long value) {
            addCriterion("precio <>", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioGreaterThan(Long value) {
            addCriterion("precio >", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioGreaterThanOrEqualTo(Long value) {
            addCriterion("precio >=", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioLessThan(Long value) {
            addCriterion("precio <", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioLessThanOrEqualTo(Long value) {
            addCriterion("precio <=", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioIn(List<Long> values) {
            addCriterion("precio in", values, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotIn(List<Long> values) {
            addCriterion("precio not in", values, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioBetween(Long value1, Long value2) {
            addCriterion("precio between", value1, value2, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotBetween(Long value1, Long value2) {
            addCriterion("precio not between", value1, value2, "precio");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutIsNull() {
            addCriterion("estado_checkout is null");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutIsNotNull() {
            addCriterion("estado_checkout is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutEqualTo(Integer value) {
            addCriterion("estado_checkout =", value, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutNotEqualTo(Integer value) {
            addCriterion("estado_checkout <>", value, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutGreaterThan(Integer value) {
            addCriterion("estado_checkout >", value, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("estado_checkout >=", value, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutLessThan(Integer value) {
            addCriterion("estado_checkout <", value, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutLessThanOrEqualTo(Integer value) {
            addCriterion("estado_checkout <=", value, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutIn(List<Integer> values) {
            addCriterion("estado_checkout in", values, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutNotIn(List<Integer> values) {
            addCriterion("estado_checkout not in", values, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutBetween(Integer value1, Integer value2) {
            addCriterion("estado_checkout between", value1, value2, "estadoCheckout");
            return (Criteria) this;
        }

        public Criteria andEstadoCheckoutNotBetween(Integer value1, Integer value2) {
            addCriterion("estado_checkout not between", value1, value2, "estadoCheckout");
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