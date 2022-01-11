package com.ruben.codigo.model;

import java.util.List;

public class Factura extends ClaseBase{
    private Cliente cliente;
    private Direccion direccionDeNuestraEmpresa;
    private List<Producto> productoList;
    private double subTotalPrecio;
    private double IVA;
    private double totalPrecio;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Direccion getDireccionDeNuestraEmpresa() {
        return direccionDeNuestraEmpresa;
    }

    public void setDireccionDeNuestraEmpresa(Direccion direccionDeNuestraEmpresa) {
        this.direccionDeNuestraEmpresa = direccionDeNuestraEmpresa;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
        double sumaPrecio =0;
        for(int i=0;i<productoList.size();i++){
            Producto producto = productoList.get(i);
            sumaPrecio += producto.getPrecio();
        }

        this.setSubTotalPrecio(sumaPrecio);
        this.setTotalPrecio(((this.subTotalPrecio/100) * this.IVA) + this.subTotalPrecio);
    }

    public double getSubTotalPrecio() {
        return subTotalPrecio;
    }

    public void setSubTotalPrecio(double subTotalPrecio) {
        this.subTotalPrecio = subTotalPrecio;
        System.out.println("Se ha calculado el subtotal");
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(double totalPrecio) {
        this.totalPrecio = totalPrecio;
        System.out.println("Se ha calculado el total:"+getTotalPrecio());

    }

    @Override
    public String toString(){
        String factura = "Nombre de cliente:"+getCliente().getNombre();
        factura +=  ", Direccion:"+getCliente().getDireccion().toString();
        return factura;
    }
}
