package Actividad6;

import java.util.Scanner;

public class Actividad8_nodos1 {
    Scanner sc = new Scanner(System.in);
    //estructura del nodo
    static class Nodo{
        //dato, enlace
        String dato;
        Nodo sig;
    }
    Nodo inicio = null;
    Nodo fin = null;
    
    //metodo para agregar nodos a la lista
    public void agregar(){
        //nodo temporal para almenar el nodo
        Nodo temp;
        String msg;
        System.out.println("agregar dato: ");
        //preguntar si el nodo esta vacio o nulo
        if(fin == null){
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
            inicio = fin;
        }else{
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;
        }
    }
    
    public void mostrar(){
        Nodo actual = new Nodo();
        actual = fin;
        if(fin != null){
            while(actual != null){
                System.out.println(" DATO "+ "["+actual.dato+"]" );
                actual = actual.sig;
            }
        }else{
            System.out.println("\n la lista se encuentra vacia...");
        }        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt=0;
        Actividad8_nodos1 n = new Actividad8_nodos1();
        do{
            System.out.println("\n1 add\n"
                    + "2 show\n"
                    + "3 exit\n");
            switch(opt=sc.nextInt()){
                case 1:
                    n.agregar();
                    break;
                case 2:
                    n.mostrar();
                    break;
            }
        }while(opt != 3);
    }
    
}