/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.*;
import VISTA.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Felipe
 */
public class Controlador_Indice implements ActionListener{
    
    private Indice view_Indice;
    private MaestroProveedor_index view_MP;
    private plantilla_Filtro view_PF;
    private plantilla_Inscripcion_centroCosto view_PICc;
    private plantilla_Inscripcion_comprobante view_PIC;
    private plantilla_Movimientos_Tesoreria view_MT;
    private Modelo model;     
  

    
    public Controlador_Indice(Indice view_Indice,MaestroProveedor_index view_MP,plantilla_Filtro view_PF,plantilla_Inscripcion_centroCosto view_PICc,
    plantilla_Inscripcion_comprobante view_PIC,Modelo model,plantilla_Movimientos_Tesoreria view_MT){
        this.view_Indice = view_Indice;
        this.view_MP = view_MP;
        this.view_PF = view_PF;
        this.view_PIC = view_PIC;
        this.view_PICc = view_PICc;
        this.model = model;
        this.view_MT = view_MT;
 
        this.view_Indice.Maestro_Proveedor.addActionListener(this);
        this.view_Indice.Centro_Costo.addActionListener(this);
        this.view_Indice.comprobante.addActionListener(this);
        this.view_Indice.Movemientos_tesoria.addActionListener(this);
        
        this.view_MP.Crear.addActionListener(this);
        this.view_MP.Editar.addActionListener(this);
        this.view_MP.Mostrar.addActionListener(this);

    }
    
    public void Iniciar(){
        view_Indice.setTitle("TESORERIA");
        view_Indice.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){   
        if (e.getSource() == view_Indice.Maestro_Proveedor) {
            this.mp();
        }
        if (e.getSource() == view_Indice.Centro_Costo) {
            this.cc();
        }
        if (e.getSource() == view_Indice.Movemientos_tesoria) {
            this.mt();
        }
        if (e.getSource() == view_Indice.comprobante) {
            this.c();
        }
        /*
        System.out.println("Hola mundo");
        view_MP.setLocationRelativeTo(null);
        view_MP.setVisible(true);   
        view_Indice.dispose();*/
    }
    
    private void mp (){// Metodo para hacer los procesos de los diferentes botones
        view_MP.setLocationRelativeTo(null);
        view_MP.setVisible(true);   
        view_Indice.dispose();       
    }
    
    private void cc (){
        view_PICc.setLocationRelativeTo(null);
        view_PICc.setVisible(true);   
        view_Indice.dispose();                 
    }
    
    private void c (){
        view_PIC.setLocationRelativeTo(null);
        view_PIC.setVisible(true);   
        view_Indice.dispose();          
    }

    private void mt (){
        view_MT.setLocationRelativeTo(null);
        view_MT.setVisible(true);   
        view_Indice.dispose();          
    }    
    
    



    
}
