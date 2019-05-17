/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.*;
import VISTA.*;


/**
 *
 * @author Labing
 */
public class TeosreriaF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Indice view_Indice = new Indice();
        MaestroProveedor_index view_MP = new MaestroProveedor_index();
        plantilla_Filtro view_PF = new plantilla_Filtro();
        plantilla_Inscripcion_centroCosto view_PICc = new plantilla_Inscripcion_centroCosto();
        plantilla_Inscripcion_comprobante view_PIC = new plantilla_Inscripcion_comprobante();
        plantilla_Movimientos_Tesoreria view_MT = new plantilla_Movimientos_Tesoreria();
        
        Modelo model = new Modelo();
        
        Controlador_Indice co = new Controlador_Indice(view_Indice,view_MP,view_PF,view_PICc,view_PIC,model,view_MT);
        co.Iniciar();
        view_Indice.setVisible(true);
    }
    
}
