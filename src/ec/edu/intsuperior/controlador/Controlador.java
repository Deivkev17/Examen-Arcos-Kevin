/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;
import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Docente;
import ec.edu.intsuperior.vista.Estudiante;
import ec.edu.intsuperior.vista.Loggin;
import ec.edu.intsuperior.vista.JPIngresarEstudiante;
import ec.edu.intsuperior.vista.JPIngresarDocente;

/**
 *
 * @author DELL
 */
public class Controlador {
    Administrador administrador= new Administrador(this);
    Loggin loggin=new Loggin(this);
    Docente docente= new  Docente(this);
    Estudiante estudiante= new Estudiante(this);
    JPIngresarDocente jPIngresarDocente= new JPIngresarDocente(this);
    JPIngresarEstudiante jPIngresarEstudiante= new JPIngresarEstudiante(this);
    
     public void showJPIngresarEstudiante(){
        jPIngresarEstudiante.setSize(1000,1000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(jPIngresarEstudiante);
        jPIngresarEstudiante.setVisible(true);
        administrador.escritorio.revalidate();
        jPIngresarEstudiante.repaint();
    }
    public void showJPIngresarDocente(){
        jPIngresarDocente.setSize(1000,1000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(jPIngresarDocente);
        jPIngresarDocente.setVisible(true);
        administrador.escritorio.revalidate();
        jPIngresarDocente.repaint();
    }
    
    public void showEstudiante(){
        estudiante.setSize(1000,1000);
        administrador.escritorio.removeAll();;
        administrador.escritorio.add(estudiante);
        estudiante.setVisible(true);
        administrador.escritorio.revalidate();
        estudiante.repaint();
    }
    public void showDocente(){
        docente.setSize(1000,1000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(docente);
        docente.setVisible(true);
        administrador.escritorio.revalidate();
        docente.repaint();
    }
    
    public void showLoggin(){
        loggin.setVisible(true);
    }
    public void showAdministrador(){
        administrador.setVisible(true);
        
        
        
    }
    
}
