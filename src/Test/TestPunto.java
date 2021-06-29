
package Test;

import Dominio.Punto;
import java.util.Scanner;


public class TestPunto {

    public static void main(String[] args) {
        Punto p1;
        Scanner e= new Scanner(System.in);
        p1=new Punto();
        int j=0, n;
        System.out.println("**El punto inicial esta ubicado en x=0;y=0**");
        do{
            System.out.println("0. Mover el punto.");
            System.out.println("1. FInalizar");
            j=e.nextInt();
            switch(j){
                case 0:
                    plano(p1);
                    break;
                case 1:
                    break;
                default: 
                    System.out.println("La opcion que ingreso no es valida");
                    break;
            }
        }while(j!=1);
    }
    
public static void plano(Punto p1){
     int j,n,p,i,f,t=0;
     double r;
    Scanner e= new Scanner(System.in);
     System.out.println("Cuantas veces va realizar los movimientos: ");
     j=e.nextInt();
     //Para que no ingrese valores a 0
     do{
         if(j<0){
             n=0;
             System.out.println("No se va mover o veces");
             System.out.println("Ingrese otro valor: ");
             j=e.nextInt();
         }else{
             n=1;
         }
     }while(n!=1);
     for(i=0; i<j; i++){
         System.out.println("Ingrese el numero de espacios que va mover:");
         f=e.nextInt();
         do{
             if(f<0){
                 System.out.println("Los valores ingresados debe ser mayor a 0.");
                 System.out.println("Ingrese otro valor");
                 f=e.nextInt();
             }else{
                 n=1;
             }
         }while(n!=1);
         r=Math.random()*12+1;
         t=t+f;
         if(r<3){
             
             p = p1.getY()-f;
             p1.setY(p);
             p1.setJ(f);
             System.out.println(p1.toString()+"\nLa direccion es: abajo");
            }
          if(r<3){
              if(r<6){
             p =p1.getY()+f;
             p1.setY(p);
             p1.setJ(f);
             System.out.println(p1.toString()+"\nLa direccion es: arriba");
            } 
              }
             if(r>6){
                 if(r<9){
            p =p1.getX()-f;
             p1.setX(p);
             p1.setJ(f);
             System.out.println(p1.toString()+"\nLa direccion es: izquierda");
            }
                 }
             if(r>9){
                 p =p1.getX()+f;
             p1.setX(p);
             p1.setJ(f);
             System.out.println(p1.toString()+"\nLa direccion es: derecha");
             }
     }
     p1.setJ(t);
     System.out.println(p1.toString());
    }
}
