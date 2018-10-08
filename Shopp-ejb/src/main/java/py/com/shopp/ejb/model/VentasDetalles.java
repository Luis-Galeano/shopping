package py.com.shopp.ejb.model;

import java.io.Serializable;

public class VentasDetalles implements Serializable {
    private Integer idVentaDetalle;

    private Long idVentaCabecera;

    private Long idProducto;

    private Integer cantidad;

    private Long precio;

    private static final long serialVersionUID = 1L;

    public Integer getIdVentaDetalle() {
        return idVentaDetalle;
    }

    public void setIdVentaDetalle(Integer idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }

    public Long getIdVentaCabecera() {
        return idVentaCabecera;
    }

    public void setIdVentaCabecera(Long idVentaCabecera) {
        this.idVentaCabecera = idVentaCabecera;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idVentaDetalle=").append(idVentaDetalle);
        sb.append(", idVentaCabecera=").append(idVentaCabecera);
        sb.append(", idProducto=").append(idProducto);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}