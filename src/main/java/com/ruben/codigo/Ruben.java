package com.ruben.codigo;

import com.ruben.codigo.model.Factura;
import com.ruben.codigo.model.Cliente;
import com.ruben.codigo.model.Direccion;
import com.ruben.codigo.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class Ruben {

    public static void main(String args[]){
        Cliente cliente = new Cliente();

        cliente.setDireccion(getDireccionCliente());
        cliente.setEsPersonaFisica(true);
        cliente.setNombre("rivas");
        cliente.setNotas("majete");
        cliente.setReferencia("abc123");
        Factura factura = new Factura();
        factura.setCliente(cliente);
        factura.setIVA(21);
        factura.setDireccionDeNuestraEmpresa(getDireccionNuestra());
        List<Producto> productoList = new ArrayList<Producto>();
        Producto producto1 = new Producto();
        producto1.setNombre("Naranjas clementias");
        producto1.setReferencia("valencia");
        producto1.setPrecio(10);
        producto1.setNotas("dulce");
        productoList.add(producto1);
        factura.setProductoList(productoList);

        Factura factura2 = factura;
        Producto producto2 = new Producto();
        producto2.setNombre("Naranjas rojas");
        producto2.setReferencia("valencia");
        producto2.setPrecio(20);
        producto2.setNotas("dulce");
        productoList.add(producto2);
        factura2.setProductoList(productoList);

        Boolean comparaFactura = false;
        comparaFactura = (factura.equals(factura2));

        System.out.println("Es la misma factura:"+comparaFactura);
        System.out.println("Hemos creado una factura:"+factura.toString());

    }
    public static Direccion getDireccionCliente(){
        Direccion direccion = new Direccion();
        direccion.setDireccionEmail("abc@gmail.com");
        direccion.setCalle("azafranal");
        direccion.setCiudad("salamanca");
        direccion.setEscalera("derecha");
        direccion.setCodigoPostal("878454");
        direccion.setLocalidad("Salamanca");
        direccion.setMovil("879526541");
        direccion.setNumeroTelefono("8974654137");
        direccion.setPuerta("1");
        return  direccion;
    }
    public static Direccion getDireccionNuestra(){
        Direccion direccion = new Direccion();
        direccion.setDireccionEmail("t5r43@gmail.com");
        direccion.setCalle("rwegfeg");
        direccion.setCiudad("salamanca");
        direccion.setEscalera("derecha");
        direccion.setCodigoPostal("878454");
        direccion.setLocalidad("Salamanca");
        direccion.setMovil("879526541");
        direccion.setNumeroTelefono("8974654137");
        direccion.setPuerta("1");
        return  direccion;
    }
}
