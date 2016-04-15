/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class MetodosPrestamoLibro {
    
    private ArrayList<PrestamoLibro> arrayPrestamos;
    String arregloInformacionColsultada[]= new String [3];
    
    public MetodosPrestamoLibro() {
        arrayPrestamos= new ArrayList<PrestamoLibro>();
    }
    
    public void agregarPrestamo(String informacion[]) {
        PrestamoLibro temporal= new PrestamoLibro(informacion[0],informacion[1],informacion[2],informacion[3]);
        arrayPrestamos.add(temporal);
    }
    
    public boolean consultarPrestamo(String numeroPrestamo) {
        boolean existe=false;
        
        for(int contador=0; contador<arrayPrestamos.size(); contador++) {
            
            if(arrayPrestamos.get(contador).getCedulaUsuario().equals(numeroPrestamo)) {
                
                arregloInformacionColsultada[0]=arrayPrestamos.get(contador).getNombreUsuario();
                arregloInformacionColsultada[1]=arrayPrestamos.get(contador).getCedulaUsuario();
                arregloInformacionColsultada[2]=arrayPrestamos.get(contador).getIsbnLibro();
                existe=true;
            }
        }
        return existe;
    }
    
    public void modificarPrestamo(String arreglo[]) {
        for(int contador=0; contador<arrayPrestamos.size(); contador++) {
            
            if(arrayPrestamos.get(contador).getCedulaUsuario().equals(arreglo[0])) {
                
                arrayPrestamos.get(contador).setNombreUsuario(arreglo[1]);
                arrayPrestamos.get(contador).setCedulaUsuario(arreglo[2]);
                arrayPrestamos.get(contador).setIsbnLibro(arreglo[3]);
            }
        }
    }
    
    public void eliminarPrestamo(String arreglo[]) {
        for(int contador=0; contador<arrayPrestamos.size(); contador++) {
            
            if(arrayPrestamos.get(contador).getCedulaUsuario().equals(arreglo[0])) {
                
                arrayPrestamos.remove(contador);
            }
        }
    }
    
    public String[] getArregloInformacion() {
        return arregloInformacionColsultada;
    }
    
}
