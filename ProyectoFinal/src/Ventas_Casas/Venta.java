//venta de casa listado de casas, lotes y terrenos
package Ventas_Casas;
import javax.swing.JOptionPane;
import java.util.*;
public class Venta {
    
 Scanner c=new Scanner (System.in);
    
 //variables
 String Ubicacion;
 int respuesta,casa,casa1,casa2,casa3,casa4,casa5,casa6,casa7,casa8,casa9,casa10,casa11,
         casa12, casa13, casa14,i, Ncasas,Casas=1, dato;
 
 double precio, Total, Alcabala;
 
 
         
    public void compra(){
    
    System.out.println("Que tramite desea hacer:");      
      System.out.println("Coloque 1 si desea comprar una casa,");
      System.out.println("Coloque 2 si desea comprar un lote");
      System.out.println("Coloque 3 si desea comprar un terreno");
      System.out.println("Coloque 4 si ya no desea hacer ningun tramite");
      Scanner lectura = new Scanner (System.in);
      respuesta = lectura.nextInt();
      if (respuesta == 1){
          System.out.println("casas:");
          System.out.println("La casas estan divididas por departamentos ");
          System.out.println(" Porpafavor coloque el numero del departamento donde usted desa vivir:");
          System.out.println("");     
      System.out.println("1.Ahuachapan");
      System.out.println("2.Santa Ana");
      System.out.println("3.Sonsonate");
      System.out.println("4.Chalatenango");
      System.out.println("5.La Libertad");
      System.out.println("6.San Salvador");
      System.out.println("7.Cuscatlan");
      System.out.println("8.La paz");
      System.out.println("9.Cabañas");
      System.out.println("10.San Vicente");
      System.out.println("11.Usulutan");
      System.out.println("12.San Miguel");
      System.out.println("13.Morazan");
      System.out.println("14.La Union");
      System.out.println("0. salir");
      // Reparar desde aqui
      System.out.println("Dijite los numeros entre 1 y 14");
      Scanner dato = new Scanner (System.in);
      casa = dato.nextInt();
        if(casa==1){
          System.out.println("Ahuchapan:");
                  System.out.println("Recidencial las bermudas: $110,000.00, perimetro:140 varas cuadradas,"
                          + "3 dormitorios, 2 baños,1 sala y patio");
                  System.out.println("Recidencial La victorias: $150,000.00, perimetro:170 varas cuadradas,"
                          + "4 dormitorios,1 baño,1 cochera y patio");
                  System.out.println("Recidencial la trinidad : $100,000.00, perimetro:100 varas cuadradas,"
                          + "3 dormitorios,1 baño,1 cochera y patio");
                 // revisar
                  System.out.println("Cuantas casa desa comprar");
                  Ncasas = c.nextInt();
                    for(i=Casas; i<=Ncasas; i++){
                        System.out.println("Ingrese el precio");
                        precio = c.nextDouble();
                     if(Ncasas == 1){
                       Total = precio;
                         System.out.println("La casa vale: $"+Total);
                         
                     }else{
                     
                     }
                        
                    }   
                    
          // hasta aqui terminaria la reparacion
        }else if(casa==2){  
            System.out.println("Santa Ana");
        }else if(casa==3){
            System.out.println("Son Sonate");
        }else if(casa==4){
          System.out.println("Chalatenango");
        }else if(casa==5){
          System.out.println("Chalatenango");
        }else if(casa==6){
          System.out.println("Chalatenango");
        }else if(casa==7){
          System.out.println("Chalatenango");
        }else if(casa==8){
          System.out.println("Chalatenango");
        }else if(casa==9){
          System.out.println("Chalatenango");
        }else if(casa==10){
          System.out.println("Chalatenango");
        }else if(casa==11){
          System.out.println("Chalatenango");
        }else if(casa==12){
          System.out.println("Chalatenango");
        }else if(casa==13){
          System.out.println("Chalatenango");
        }else if(casa==14){
          System.out.println("Chalatenango");
        }else if(casa==0){
          System.out.println("salida con exito");
        }
        
          //Aqui van ha ir todas las casas
      }else if(respuesta == 2){
          System.out.println("lotes");
          //Aqui van a ir todos los lotes
      }else if(respuesta == 3){
          System.out.println("Terrenos");
         //Aqui van a ir todos los terrenos 
      }else if(respuesta == 4){
          System.out.println("Salida con exito");
      }
    
    }
    
    
    
    
}
