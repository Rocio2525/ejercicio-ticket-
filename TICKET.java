
package ticket;
import java.util.Scanner;

public class TICKET {

   
    public static void main(String[] args) {
        //variables
        String Nombremozo = " ";
        String formadepago= "  ";
        double numerodetarjeta=0;
        double total=0;
        int fpago=0;
        int cuotas=0;
        int descuentos=0;
        double subtotal=0;
        double tarjd=0;
        double tarjc=0;
        int monto1,monto2,monto3=0;
        boolean mtotal=true;
      //obj escaner
      Scanner leer= new Scanner(System. in);
       
      //información 
   
       System.out.println("Ingrese el nombre del mozo");
       Nombremozo= leer.next();
      
     
      
      
      
      
      //seleccione la forma de pago
      do{
      System.out.println("------------------------------------");
      System.out.println("-----------FORMA DE PAGOS-----------");
      System.out.println("1-Efectivo");
      System.out.println("2-Tarjeta de débito");
      System.out.println("3-Tarjeta de crédito");
      System.out.println("------------------------------------");
      fpago = leer.nextInt();
      } while(fpago<1  || fpago>3);
     
      switch(fpago)
      {
          case 1:
              formadepago ="Efectivo";
             break;
          
          case 2:
             formadepago="Tarjeta de crédito";
             break;
             
          case 3:
              formadepago="Tarjeta de débito";
              break;
          
      } 
     
     switch(fpago)
     {
         case 1:
             total=(subtotal-(subtotal*30)/100);
         break;
         case 2:
             System.out.println("Ingresar los números: ");
             tarjd= leer.nextDouble();
            total=(subtotal-(subtotal*10)/100);
         break;
         case 3:
             System.out.println("Ingresar los números: ");
             tarjc=leer.nextDouble();
             total=(subtotal+(subtotal*10)/100); 
           do{
        System.out.println("Eligio pagar por medio de crédito");
        System.out.println("---------Cuotas-------------------");
        System.out.println("opción 1 -----3-------------------");   
        System.out.println("opcion 2-------6-------------------");
        System.out.println("opcion 3------12------------------");
        cuotas =leer.nextInt();
        } while(cuotas<1  || cuotas>3);
      
     }
     
    
             
 
     
     //información del ticket
     System.out.println("------------------------------");
     System.out.println("--------EL MIRADOR------------");
     System.out.println("   Castulo Peña 995 ,Córdoba  ");
     System.out.println("Telefono:(3525)478699- C.P 5220");
     System.out.println("---IVA RESPONSABLE INSCRIPTO---");
     System.out.println("-------------------------------");
     System.out.println("-Caja N2  TICKET(cód.083)      ");
     System.out.println("        Fecha 16/10/2020       ");
     System.out.println("-------------------------------");
     System.out.println("ingrese monto1 " );
     monto1=leer.nextInt();
     System.out.println("      2 Lomos con fritas       ");
     System.out.println("ingrese monto2 " );
     monto2=leer.nextInt();
     System.out.println("      2 Latas de coca          ");   
     System.out.println("ingrese monto2" );
     monto3=leer.nextInt();
     System.out.println("      1 cerveza Quilmes cristal");
    System.out.println("monto a pagar" +monto1 + "+" + monto2 + "+" + monto3 + "=" + (monto1+monto2+monto3));
     subtotal=leer.nextDouble(); 
    System.out.println("-------------------------------");
     System.out.println("-----Gracias por su compra------");
      
    }
    
}
