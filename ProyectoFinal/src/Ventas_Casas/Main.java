
package Ventas_Casas;
import javax.swing.JOptionPane;
import java.util.*;

public class Main {

public static void main(String [] args){
    
Aprobacion Apro = new Aprobacion();
//Info ifo=new Info();
     //usando objeto Apro
     //logrado pero eliminar el cero que aparece en el nombre 
     Apro.Registrodelcliente();//ejecuta de Aprobacion que extiende de info el method Registrodelcliente
     Apro.DatosRegistrados();//ejecuta de Aprobacion que extiende de info el method DatosRegistrados
     //de Aprobacion ejecuta method para ver si la edad es apropiada, devuelve un string y la edad pero
     //cambio a devolver solo el mensaje en string
     Apro.EdadApropiada();
     //de Aprobacion ejecuta method para validad la aprovacion en base a deudas
     Apro.Deudas();
     //de Aprobacion ejecuta metodo para saber si tiene precalificacion bancaria
     Apro.Pre_CalificacionBancaria();
     System.out.println("\nNuestras Casas son mas economicas.\n");
     System.out.println("\nMire el catalago y escoja entre nuestras opciones.\n");
     
     
     //System.out.println("El Cliente :"+Apro.EdadApropiada());



     //ifo.DatosRegistrados();     
     //ifo.VerificacionEdad();
     /*Aprobacion Apro = new Aprobacion();
               //Apro.VerificacionEdad();
                System.out.println("Calificacion"+Apro.EdadApropiada());
     */
   

/*Aprobacion condicion = new Aprobacion ();
       
       condicion.Deudas();
       condicion.Pre_CalificacionBancaria();*/
       //ifo.VerificacionEdad();
       //condicion.VerificacionEdad();
       
}    
}
