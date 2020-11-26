package Ventas_Casas;
import java.util.*;

public class Aprobacion extends Info{

    protected int Debepagar; 
    protected int PreCalificacion;
    protected int edad_E;
    public int edad_minima = 18;
    public int edad_maxima = 67;

    //valida la edad para realizar operaciones de negocios
  public void EdadApropiada(){
      //completar con nombre
      //System.out.println("");
      //aun ese texto diciendo que deben saber algun dato me parece inneceario
      System.out.println("|TODO ESTE MENSAJE ESTA DEMAS*|");
      System.out.println("\n\n|* Para comprar una casa, lote o terreno debemos de saber "
              + "si usted cumple las siguientes condiciones *|\n\n");
     // System.out.println(""); para evitar esta linea agregar al final de la anterior \n\n
      System.out.println("|* verificacion de edad *|");
      System.out.println("|* edad del cliente: "+this.edad+" Años *|");
      /*Personalmente pienso que esta validacion deberia estar oculta al usuario y solo decirle si califica
        o no, ya que esta demas explicarle el porque de forma tan obvia con respecto a las edades.
      if(edad >= 18 && edad <= 67 ){
            edad_E = edad;
            System.out.println(this.nombre+" Califica como cliente PARA comprar una casa");
            System.out.println("Porque usted tiene: ");return edad_E;
      }else {
            System.out.println(this.nombre+" no CALIFICA como comprador");
        }
            System.out.println("Porque usted tiene: ");return edad;
       */
      if(edad >= edad_minima && edad <= edad_maxima){
          System.out.println("|* Señor " + this.nombre + " ,usted califica como cliente *|.\n");
      }else{
          System.out.println("|* Señor " + this.nombre + " ,usted no califica como cliente *|.\n");
      }
  }
   //valida si existen deudas
  public int Deudas(){
        System.out.println("\nverificacion de deudas\n");
        if(Deuda == 1){
        Debepagar = Deuda;
           System.out.println(this.nombre+" Lo sentimos no aplica para comprar una casa\n");
           System.out.println("Por favor comuníquese con su Banco\n"); return Debepagar;
        }else {
           System.out.println(this.nombre+" Usted es APTO para adquirir una casa\n");
           return Debepagar;
        }
    }
    //valida si existe una precalificacion bancaria
  public int Pre_CalificacionBancaria() {
      /*
        System.out.println("\nVerificacion de Precalificacion bancaria\n");
        if(PreCalificacion == 1){
            System.out.println(this.nombre+" Usted es APTO para comprar una casa"); return PreCalificacion;
        }else {
          //System.out.println(this.nombre+" Usted es APTO para comprar una casa"); return PreCalificacion;
            PreCalificacion = PreCaBank;
            System.out.println(this.nombre+" No aplica para comprar una casa"); return PreCaBank;
        }//fin de else
     */

      //manejo de misma logica con switch
      switch (PreCaBank){
          case 1:  System.out.println(this.nombre+" Usted es APTO para comprar una casa");
          break;
          case 2:PreCalificacion = PreCaBank;
              System.out.println(this.nombre+" No aplica para comprar una casa");
          break;
          default: String msg = "Opción inválida\n";
      }
        return PreCaBank;
    }
  
}