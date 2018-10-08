package py.com.shopp.ejb.model;

import java.io.Serializable;

public class Carritos implements Serializable {
    private Integer idCarrito;

    private Long idProducto;

    private Long idCliente;

    private Integer cantidad;

    private Long precio;

    private Integer estadoCheckout;

    private static final long serialVersionUID = 1L;

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Integer getEstadoCheckout() {
        return estadoCheckout;
    }

    public void setEstadoCheckout(Integer estadoCheckout) {
        this.estadoCheckout = estadoCheckout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idCarrito=").append(idCarrito);
        sb.append(", idProducto=").append(idProducto);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append(", estadoCheckout=").append(estadoCheckout);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}