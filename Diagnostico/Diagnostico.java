package Actividad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad1_Diagnostico{
    public static void main(String[] args) throws IOException{
        BufferedReader en= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\033[34m ******************************************* \033[m \n");
        System.out.print("\033[34m *\033[m Ingrese la forma de la matriz que dasea \033[34m*\033[m \n");
        System.out.print("\033[34m ******************************************* \033[m \n");
        System.out.print("1. Realizar una X dentro de la matriz \n"
                + "2. Llena solo la mitad de la matriz usando \n"
                + "3. Realiza un marco de * alrededor de la matriz \n"
                + "Opción: ");
        int z=Integer.parseInt(en.readLine());
        if (z<4){
            System.out.print("El tamaño de la matriz es de: ");
            int x=Integer.parseInt(en.readLine());
            switch (z){
                case 1:
                    if(x%2==0){
                        System.out.println("\033[31m \nEl número ingresado es "+x+" y no se puede formar la matriz. \033[m");
                    }else{
                        int y=(x-1);
                        for(int i=0;i<x;i++){
                            for(int j=0;j<x;j++){
                                if((i==j)||((i+j)==y)){
                                    System.out.print("*       ");
                                }
                                else{
                                    System.out.print("        ");
                                }     
                            }
                        System.out.println();
                        }
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
            } 
        }else{
            System.out.print("\033[31mEsa opción no existe \033[m \n \n");
        }
    }
}