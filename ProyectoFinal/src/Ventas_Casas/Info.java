/*Venta de casa 
Este proyecto esta diseñado para que los clientes puedan comprar una casa, terreno y lote*/

package Ventas_Casas;

import javax.swing.JOptionPane;
import java.util.*;

public class Info {
  
  //Creacion del objeto  
 Scanner i=new Scanner (System.in);
 Scanner p=new Scanner (System.in);
 Scanner leer = new Scanner(System.in);
  //definicion de variables
  protected String nombre; 
  protected String Direc; 
  protected String fecha;
  protected String N_DUI;
  protected String WOrk;
  protected String Placework; 
  protected String Tel;
  protected int edad;
  protected int Deuda;
  protected int PreCaBank; 
  protected double money; 

  // se encarga de recibir datos del usuario y guardarlos
  public void Registrodelcliente(){    
      System.out.println("Bienvenido a Needhome\n");
      System.out.println("Nuestra compañía le ofrece las mejores casas, lotes, terrenos "
              + "a precios comodos; que ningun otro le puede ofrecer.\n");
      System.out.println("Porfavor llenar el siguiente formulario.\n");
      System.out.println("ingrese su Nombre completo:\n");
      nombre = i.nextLine();
      //DEBERIA IR UN VALIDADOR DE EDAD PARA PODER PROSEGUIR CON LA GESTION
      System.out.println("Ingrese su Edad:\n");
      edad = p.nextInt();
      //PODRIA CALCULAR CON EDAD Y VER SI ESTA DICIENDO LA VERDAD PARA EVITAR DATOS ERRADOS
      System.out.println("Ingrese su fecha de nacimiento:\n");
      fecha = i.nextLine();
      System.out.println("Ingrese su numero de DUI:\n");
      N_DUI = i.nextLine();
      System.out.println("Ingrese su Direccion:\n");
      Direc = i.nextLine();
      //puede guardarse en String ya que no lo vamos a operar e igual se puede comparar
      System.out.println("Ingrese su numero de telefono:\n");
      Tel = i.nextLine();
      System.out.println("Profesión u oficio:\n");
      WOrk = i.nextLine();
      System.out.println("Lugar de trabajo:\n");
      Placework = i.nextLine();
      System.out.println("Ingrese su salario devengado $: \n");
      money = p.nextDouble();
      //podria colocar otras opciones al responder si o no
      System.out.println("¿Posee deudas bancarias?\n Escriba 1 para Si y 2 para No\n");
      Deuda = leer.nextInt();
      //podria colocar otras opciones al responder si o no
      // RECUERDA MANTENER LA CONSTANCIA EN RESPUESTAS SI Y NO PARA NO CONFUNDIR
      System.out.println("¿Tine precalificación Bancanria?, Escriba 1 para SI y 2 para NO\n");
      PreCaBank = leer.nextInt();  
  }
  // muestra en consola los datos recolectados
    public void DatosRegistrados(){
      System.out.println("\nInformacion guardada con exito\n");
      System.out.println("Nombre del Cliente :"+this.nombre);
      System.out.println("Edad del cliente :"+this.edad+" Años");
      System.out.println("Lugar donde recide :"+this.Direc);
      System.out.println("Ocupación de trabajo: "+this.WOrk);
      System.out.println("Lugar de trabajo: "+this.Placework);
      System.out.println("Salario del cliente " + this.nombre + " : "+ this.money+"$\n");
    }
    
  }