package daw.poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Hind
 */
public class test {
        
    public static void main(String[] args) {
        // double NmrEstancia;
        // int i;
         double RestCharge=0;//equation to count how much charge will rest in asperadora after limpiar
         String[] habitacion = {"Cocina", "Baño", "salón", "dormitorio1", "dormitorio2"};
         double[] habitacionsM= new double[5];//declare list of 5 intereges "the metters that the user will introduce for our 5habitaciones"
         double cargaEstablecida=0;// value charge the user enter in first opcion "configuration del sistema"
         double limpiarNeedCharge=0;//equation to know how much charge the aspiradora losted dependce the M of the habitacion
         double cargaActual;//the value of charge after cleaning
       //  int x=0;
        // double[] habPermanenteM= new double[x];//the permanent list for stocking the metros of habitacions that a user will choose, for "modo dependencias"
        // String[] habPermanente= new String[x];  
        
         for(int j=0;j<habitacion.length;j++){ //loop for the moving in the rooms if there is charge
                        
                          for(int m=0;m<habitacionsM.length;m++){
                               limpiarNeedCharge=habitacionsM[m]*2.25;
                               RestCharge=cargaEstablecida-limpiarNeedCharge;
                               
                               if(limpiarNeedCharge>cargaEstablecida){//when the charge we need to clean the room > of the charge the aspiradora have then we show error msg
                                   JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                               }
                               else if(RestCharge<=3){
                               JOptionPane.showInputDialog(null, "no se puede limpiar porque la carga no es suficiente",JOptionPane.ERROR_MESSAGE);
                                }
                               else{
                                       JOptionPane.showMessageDialog(null, "start limpiar");
                                    }    
                        }
                          
                    } 
                      cargaActual=RestCharge;
                      limpiarNeedCharge=0;
                      RestCharge=0;
    }
  
}
