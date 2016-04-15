/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosPrestamoLibro;
import vista.FRM_MantenimientoPrestamoLibros;

/**
 *
 * @author Carlos
 */
public class Controlador_FRM_MantenimientoPrestamoLibros implements ActionListener{

    FRM_MantenimientoPrestamoLibros frm_MantenimientoPrestamoLibros;
    MetodosPrestamoLibro metodosPrestamoLibro;
    
    
    public Controlador_FRM_MantenimientoPrestamoLibros(FRM_MantenimientoPrestamoLibros frm_MantenimientoPrestamoLibros) {
        this.frm_MantenimientoPrestamoLibros=frm_MantenimientoPrestamoLibros;
        metodosPrestamoLibro= new MetodosPrestamoLibro();
        frm_MantenimientoPrestamoLibros.colocarNumeroPrestamo(metodosPrestamoLibro.devolverNumeroPrestamo());
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Buscar")) {
            
            buscar();
        }
        if(e.getActionCommand().equals("Agregar")) {
            
            metodosPrestamoLibro.agregarPrestamo(frm_MantenimientoPrestamoLibros.devolverInformacion());
            frm_MantenimientoPrestamoLibros.mostrarMensaje("El préstamo del libro ha sido agregado corectamente");
            frm_MantenimientoPrestamoLibros.resetearGUI();
            frm_MantenimientoPrestamoLibros.colocarNumeroPrestamo(metodosPrestamoLibro.devolverNumeroPrestamo());
        }
        if(e.getActionCommand().equals("Modificar")) {
            
            metodosPrestamoLibro.modificarPrestamo(frm_MantenimientoPrestamoLibros.devolverInformacion());
            frm_MantenimientoPrestamoLibros.mostrarMensaje("El préstamo del libro ha sido modificado corectamente");
            frm_MantenimientoPrestamoLibros.resetearGUI();
            frm_MantenimientoPrestamoLibros.colocarNumeroPrestamo(metodosPrestamoLibro.devolverNumeroPrestamo());
        }
        if(e.getActionCommand().equals("Eliminar")) {
            
            metodosPrestamoLibro.eliminarPrestamo(frm_MantenimientoPrestamoLibros.devolverInformacion());
            frm_MantenimientoPrestamoLibros.mostrarMensaje("El préstamo del libro ha sido eliminado corectamente");
            frm_MantenimientoPrestamoLibros.resetearGUI();
            frm_MantenimientoPrestamoLibros.colocarNumeroPrestamo(metodosPrestamoLibro.devolverNumeroPrestamo());
        }
    }
    
    public void buscar() {
        
        if(metodosPrestamoLibro.consultarPrestamo(frm_MantenimientoPrestamoLibros.devolverNumeroPrestamo())) {
            frm_MantenimientoPrestamoLibros.mostrarMensaje("El Número de Préstamo se encuentra registrado");
            frm_MantenimientoPrestamoLibros.mostrarInformacion(metodosPrestamoLibro.getArregloInformacion());
            frm_MantenimientoPrestamoLibros.habilitarEdicion();
        }
        else {
            frm_MantenimientoPrestamoLibros.mostrarMensaje("El Número de Préstamo no se encuentra registrado");
            frm_MantenimientoPrestamoLibros.habilitarAgregar();
        }
    }
}
