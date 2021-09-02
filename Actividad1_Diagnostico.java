package Actividad1;

import java.util.Scanner;

public class Actividad1_Diagnostico{
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("\033[34m ******************************************* \033[m \n");
        System.out.print("\033[34m *\033[m Ingrese la forma de la matriz que dasea \033[34m*\033[m \n");
        System.out.print("\033[34m ******************************************* \033[m \n");
        System.out.print("1. Realizar una X dentro de la matriz \n"
                + "2. Llena solo la mitad de la matriz usando \n"
                + "3. Realiza un marco alrededor de la matriz \n"
                + "Opción: ");
        int z=leer.nextInt(), x=5;
        String Matriz;
        System.out.print("El tamaño de la matriz es de 5 \n");
        switch (z){
            case 1:
                for (int k=0; k<x-3; k++){
                    System.out.print("*\t\t\t\t");
                }    
                System.out.println("\t");
                for (int i=0; i<x-4; i++){
                    System.out.print("\t*");
                }
                System.out.println("\t\t*");
                for (int i=0; i<x-5; i++){
                    System.out.print("");
                }
                System.out.println("\t\t*");
                for (int i=0; i<x-4; i++){
                    System.out.print("\t*");
                }
                System.out.println("\t\t*");
                for (int k=0; k<x-3; k++){
                    System.out.print("*\t\t\t\t");
                } 
            break;
            
            case 2:
                for (int k=0; k<x; k++){
                        System.out.print("*\t");
                }    
                System.out.println("\t");
                for (int k=0; k<x-1; k++){
                        System.out.print("*\t");
                }    
                System.out.println("\t");
                for (int k=0; k<x-2; k++){
                        System.out.print("*\t");
                }    
                System.out.println("\t");
                for (int k=0; k<x-3; k++){
                        System.out.print("*\t");
                }    
                System.out.println("\t");
                for (int k=0; k<x-4; k++){
                        System.out.print("*\t");
                }    
                System.out.println("\t");
                for (int k=0; k<x-5; k++){
                        System.out.print("*\t");
                }    
                System.out.println("\t");
            break;
            
            case 3:
                for (int k=0; k<x; k++){
                        System.out.print("*\t");
                }    
                System.out.println("\t");
                for (int i=0; i<x-2; i++){
                    System.out.print("*");
                    for (int k=0; k<x-2; k++){
                        System.out.print("\t");
                    }
                    System.out.println("\t*");
                }
                for (int k=0; k<x; k++){
                        System.out.print("*\t");
                }    
                System.out.println("");
            break;
            default: 
                Matriz = "!!Esa opcion no existe¡¡";
            break;
        }
    }
}