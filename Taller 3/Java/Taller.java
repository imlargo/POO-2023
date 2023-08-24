// --- Parte 1 ---
package objtaller3;
import compras.*;

import gestionHumana.Empleado;
import java.util.ArrayList;

public class ObjTaller3 {
    public static void main(String[] args) {
        Producto p1 = new Producto(1, "Escoba", "Aseo");
        Producto p2 = new Producto(2, "Camisa", "Ropa");
        Producto p3 = new Producto(3, "Trapera", "Aseo");
        Producto p4 = new Producto(4, "Pantalon", "Ropa");
        Producto p5 = new Producto(5, "Jabon", "Aseo");
        Empleado emp1 = new Empleado(405, "Juan", "Ingeniero");
        ArrayList<Producto> productos1 = new ArrayList<>();
        productos1.add(p1);
        productos1.add(p3);
        OrdenCompra orden1 = new OrdenCompra(101, "Aseo", emp1, productos1);
        System.out.println(Producto.getTotalProductosPedidos());
        orden1.agregarProducto(p4);
        System.out.println(Producto.getTotalProductosPedidos());
        orden1.agregarProducto(p5);
        System.out.println(Producto.getTotalProductosPedidos());
        System.out.println("Orden " + orden1.codigo + " creada");   
        
        Empleado emp2 = new Empleado(128,"Susana", "Administradora de sucursal");
        ArrayList<Producto> productos2 = new ArrayList<>();
        productos2.add(p2);
        productos2.add(p4);
        OrdenCompra orden2 = new OrdenCompra(202, "Ropa", emp2, productos2);
        System.out.println(Producto.getTotalProductosPedidos());
        System.out.println(emp2.cedula + " va a retirar producto");
        orden2.retirarProducto(emp2, p4);
        System.out.println(Producto.getTotalProductosPedidos());
        orden2.retirarProducto(emp1, p2);
        System.out.println(Producto.getTotalProductosPedidos());
    }
}

// --- Parte 2 ---

package gestionHumana;

public class Empleado {

    public final long cedula;
    private String nombre;
    private String cargo;

    public Empleado(long cedula, String nombre, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }
    
    public boolean tengoPermiso() {
        return cargo.contains("Administrador");
    }
}



// --- Parte 3 ---
package compras;
import gestionHumana.Empleado;
import java.util.ArrayList;

public class OrdenCompra {
    public int codigo;
    private String tipo;
    private Empleado comprador;
    private ArrayList<Producto> productos;

    public OrdenCompra(int codigo, String tipo, Empleado comprador, ArrayList<Producto> productos) {
            this.codigo = codigo;
            this.tipo = tipo;
            this.comprador = comprador;
            this.productos = productos;
            Producto.totalProductosPedidos += productos.size();
    }
    
    public void agregarProducto(Producto producto) {
        if (producto.tipo.equals(tipo)) {
            productos.add(producto);
            Producto.totalProductosPedidos++;
        }
    }
    
    public void retirarProducto(Empleado empleado, Producto producto) {
        if (!empleado.tengoPermiso()) {
            return;
        }
        retirar(producto);
    }


    private void retirar(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (producto.getCodigo() == productos.get(i).getCodigo()) {
                productos.remove(i);
                producto.totalProductosPedidos--;
                producto.imprimirNombre();
                System.out.println(" retirado");
                break;
            }
        }
    }

    
    public void descontar() {
        Producto.totalProductosPedidos -= productos.size();
    }
}


// --- Parte 4 ---

package compras;

public class Producto {
    private final int codigo;
    private String nombre;
    public String tipo;
    public static int totalProductosPedidos;
    
    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
    	return;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}
