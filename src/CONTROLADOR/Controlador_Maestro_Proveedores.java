/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.*;
import VISTA.*;
import java.awt.event.*;

/**
 *
 * @author Labing
 */
public class Controlador_Maestro_Proveedores implements ActionListener{
    
    
    private MaestroProveedor_index view_MP;
    private plantilla_Incripcion_Maestro_Proveedores view_PIMP;
    private Modelo model;
    private Indice view_Indice;
    
    public Controlador_Maestro_Proveedores(MaestroProveedor_index view_MP,plantilla_Incripcion_Maestro_Proveedores view_PIMP,Modelo model,Indice view_Indice){
        
        this.model = model;
        this.view_Indice = view_Indice; //Falta terminar de hacer vistas de maestro proveedores y falta termnar el constructor y realizar el actionperforme
        this.view_MP = view_MP;
        this.view_PIMP = view_PIMP;
        this.view_MP.Crear.addActionListener(this);
        this.view_MP.Editar.addActionListener(this);
        this.view_MP.Mostrar.addActionListener(this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
