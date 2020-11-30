/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.poo;

/**
 *
 * @author Hind
 */
public class TestCajaCarton {
    
     public static void main(String[] args) {
         /*Instancia los objetos anteriores con los siguientes valores, usando el constructor y el operador new:
        cajaGrande: ancho 250mm, alto 400mm, largo 500mm. Peso 200gr.
        cajaChica: ancho 25mm, alto 30mm, largo 15mm. Peso 17gr.*/
         
        CajaCarton CajaGrande = new CajaCarton(250,400,500,200);
        CajaCarton CajaChica = new CajaCarton(25,30,15,17);
        
  //Muestra los datos de las cajas creadas, siguiendo el ejemplo del método main() que hay en los apuntes      
        System.out.print("Datos del CajaGrande :" +
CajaGrande.getPeso() + "," + CajaGrande.getAncho() + "," + CajaGrande.getAlto() + "," + CajaGrande.getLargo());

        System.out.print("Datos del CajaChica :" +
CajaChica.getPeso() + "," + CajaChica.getAncho() + "," + CajaChica.getAlto() + "," + CajaChica.getLargo());


        
    }
}
