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
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Buscar")) {
            
            System.out.println("Buscar");
        }
    }
}
