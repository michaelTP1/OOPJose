package com.github.michaeltp1.oopjose;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private String numPedido;
    private Date fecha;
    private ESTADO estado;
    private List<Producto> productoList=new ArrayList<>();

    public String getNumPedido() {
        return numPedido;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ESTADO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }
}
