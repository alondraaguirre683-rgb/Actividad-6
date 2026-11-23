/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventario;

/**
 *
 * @author alond
 */
public class Inventario {

    public static void main(String[] args) {
     GestorInventario item = new GestorInventario();
       
        item.actualizarInventario("Laptop Pro", 12500.0, 8);
        
        double totalValorizado = item.calcularTotalConDescuento(10.0);
        
        imprimirReporteInventario(item, totalValorizado);
    }

    private static void imprimirReporteInventario(GestorInventario item, double totalConDescuento) {
        System.out.println("Articulo: " + item.getNombreArticulo() + " | Stock: " + item.getCantidadStock());
        System.out.println("Total inventario valorizado: $" + totalConDescuento);
    }
}

