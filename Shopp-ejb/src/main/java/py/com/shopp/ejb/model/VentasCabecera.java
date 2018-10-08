package py.com.shopp.ejb.model;

import java.io.Serializable;
import java.util.Date;

public class VentasCabecera implements Serializable {
    private Integer idVentaCabecera;

    private Date fechaVenta;

    private Long idCliente;

    private Long totalVenta;

    private static final long serialVersionUID = 1L;

    public Integer getIdVentaCabecera() {
        return idVentaCabecera;
    }

    public void setIdVentaCabecera(Integer idVentaCabecera) {
        this.idVentaCabecera = idVentaCabecera;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Long totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idVentaCabecera=").append(idVentaCabecera);
        sb.append(", fechaVenta=").append(fechaVenta);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", totalVenta=").append(totalVenta);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}