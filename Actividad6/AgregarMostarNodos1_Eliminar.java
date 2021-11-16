package Actividad6;

import java.util.Scanner;
import java.util.Random;

public class AgregarMostarNodos1_2 {

    Scanner scaner = new Scanner(System.in);
    String magenta = "\033[35m";
    String rojo = "\033[31m";
    String azul = "\033[34m";
    String blanco = "\033[37m";
    String reset = "\u001B[0m";
    int cont = 0, ini = 0, total = 0, cont2 = 0, reg = 0;

    Nodo top = null;
    Random random = new Random();

    public static void main(String[] args) {
        String magenta = "\033[35m";
        String azul = "\033[34m";
        String reset = "\u001B[0m";
        String blanco = "\033[37m";
        System.out.println(azul + "     ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦" + reset);
        System.out.println("     ♦        Estructura de datos       ♦");
        System.out.println(azul + "     ♦        Aldaiir Ramón Silva       ♦");
        System.out.println("     ♦    Lista simplemente enlazada    ♦");
        System.out.println(azul + "     ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦" + reset);
        Scanner scaner = new Scanner(System.in);
        AgregarMostarNodos1_2 nodos = new AgregarMostarNodos1_2();
        int Opcion;
        do {
            System.out.print("\n" + "***********************************************" + "\n"
                    + "*      \t\t     " + azul + "Menu" + reset + " \t\t      *\n"
                    + "***********************************************" + "\n"
                    + "*   " + azul + "1" + reset + ". Agregar nodo.   *   " + azul + "4" + reset + "  . Salir.        *\n"
                    + "*   " + azul + "2" + reset + ". Mostrar lista.  *   " + azul + "" + reset + "                   *\n"
                    + "*   " + azul + "3" + reset + ". Eliminar nodo.  *   " + azul + "" + reset + "                   *\n"
                    + "***********************************************" + "\n"
                    + azul + "Selecciona una opción: " + blanco);
            switch (Opcion = scaner.nextInt()) {
                case 1:
                    nodos.AgregarNodo();//Opción 1 para agregar un nodo.
                    break;
                case 2:
                    nodos.MostrarLista();//Opción 2 para mostrar los casos de los nodos.
                    break;
                case 3:
                    nodos.EliminarNodo();//Opción 3 para eliminar el ultimo nodo.
                    break;
            }
        } while (Opcion != 4);
    }

    static class Nodo {
        //Datos y enlace usados
        String name;
        Nodo next;
    }

    public void AgregarNodo() {
        if (top == null) {//Si la lista de nodos es nula entonces el nodo ingresaro sera el pincipal nodo de la lista
            top = new Nodo();
            System.out.print("\n" + "Ingresa el contenido para el nodo: ");
            top.name = scaner.nextLine();
            System.out.print(reset + "[" + azul + top.name + reset + "]\n");
            top.next = null;
            total++;
        } else {
            Nodo temp;//Si la lista tiene valores entonces se creara un nodo temporal para almacenarlo en la lista y hara el mimos procediminto como anteriormente
            temp = new Nodo();//Nuevo nodo temporal
            System.out.print("\n" + "Ingresa el contenido para el nodo: ");
            temp.name = scaner.nextLine();
            temp.next = top;
            System.out.print(reset + "[" + azul + temp.name + reset + "]\n");
            top = temp;
            total++;
        }
    }

    public void MostrarLista() {
        Nodo temp = new Nodo();
        temp = top;
        if (top != null) {
            System.out.println("");
            //mostrar("\n" + magenta + "Lista de nodos: ", top);
            System.out.println(reset + "LISTA DE NODOS");
            while (temp != null) {
                System.out.println("Nodo: [" + azul + temp.name + reset + "]");
                temp = temp.next;
            }
        } else {
            System.out.println("\n" + rojo + "La lista esta vacia!!!");
        }
    }

    public static void mostrar(String name, Nodo sig) {
        System.out.println(name);
        while (sig != null) {
            System.out.print(sig.name + " ");
            sig = sig.next;
        }
    }

    public void EliminarNodo() {
        if (top != null) {
            System.out.print("\n" + reset + "El nodo [" + azul + top.name + reset + "] se elimino.");
            top = top.next;//Elimina el ultimo nodo agregado
        } else {
            System.out.print("\n" + rojo + "La lista esta vacia!!!");
        }
        System.out.println("");
    }
}
