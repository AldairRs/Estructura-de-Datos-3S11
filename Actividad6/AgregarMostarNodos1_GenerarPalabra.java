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
                    + "*   " + azul + "1" + reset + ". Agregar nodo.   *   " + azul + "4" + reset + ". Generar palabra *\n"
                    + "*   " + azul + "2" + reset + ". Mostrar lista.  *   " + azul + "5" + reset + ". Salir.          *\n"
                    + "*   " + azul + "3" + reset + ". Eliminar nodo.  *   " + azul + "6" + reset + "                  *\n"
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
                case 4:
                    nodos.GenerarPalabra();//Opción 4 para generar palabras con una longitud de 5 caracteres "Letras mayúsculas, minúsculas, números y caracteres.
                    break;
            }
        } while (Opcion != 5);
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
                //System.out.println(reset + "Nodo: [" + azul + temp.num + reset + "]");
                temp = temp.next;
            }
        } else {
            System.out.println("\n" + rojo + "La lista esta vacia!!!");
        }
    }

    public static void mostrar(String name, Nodo sig) {
        System.out.println(name);
        while (sig != null) {
            //System.out.print(sig.num + " ");
            System.out.print(sig.name + " ");
            sig = sig.next;
        }
    }

    public void EliminarNodo() {
        if (top != null) {
            System.out.print("\n" + reset + "El nodo [" + azul + top.name + reset + "] se elimino.");
            top = top.next;
        } else {
            System.out.print("\n" + rojo + "La lista esta vacia!!!");
        }
        System.out.println("");
    }

    public void GenerarPalabra() {//Metodo para generar una palabra aleatoria con una longitud de 5 caracteres
        String Mayus = String.valueOf((char) (Math.random() * 26 + 65));//Testa linea de código tomara encuenta codigo ASCII apartir del codigo 65 hasta 26 mostrara letras Mayusculas y asi sucesivamente
        String Alfanumericos = String.valueOf((char) (Math.random() * 26 + 65)) + String.valueOf((char) (Math.random() * 26 + 97)) + String.valueOf((char) (Math.random() * 10 + 48));//26+65
        String Alfanumericos2 = String.valueOf((char) (Math.random() * 26 + 97)) + String.valueOf((char) (Math.random() * 10 + 48)) + String.valueOf((char) (Math.random() * 26 + 65));//26+97
        String Alfanumericos3 = String.valueOf((char) (Math.random() * 10 + 48)) + String.valueOf((char) (Math.random() * 26 + 65)) + String.valueOf((char) (Math.random() * 26 + 97));//10+48
        String Caracteres = String.valueOf((char) (Math.random() * 15 + 33));
        String Caracteres2 = String.valueOf((char) (Math.random() * 7 + 58));
        String Caracteres3 = String.valueOf((char) (Math.random() * 6 + 91));

        if (top == null) {//Si la lista de nodos es nula entonces la palabra generada sera el pincipal nodo de la lista
            top = new Nodo();
            System.out.print("\n" + reset + "Palabra generada: ");
            top.name = Mayus + Alfanumericos + Caracteres;//Una ves dandole la palabra generada se almacenara en la lista de nodos y tomara el metodo de agregar nodo
            System.out.print(reset + "[" + azul + top.name + reset + "]\n");
            top.next = null;
            total++;
        } else {//Si la lista tiene valores entonces se creara un nodo temporal para almacenarlo en la lista y hara el mismo procedimiento con las variables "palabra2" y "palabra3"
            if (cont2 == 0) {
                Nodo temp = new Nodo();
                System.out.println("\n" + "Palabra generada: ");
                temp.name = Mayus + Alfanumericos2 + Caracteres2;//Con el uso de if anidado nos ayudara a que apartir del caracter sugndo, tercero y cuarto sean aleatorios
                temp.next = top;//Se agregara a la lista la palabra generada y asi sucesivamente con el resto del codigo
                System.out.print(reset + "[" + azul + temp.name + reset + "]\n");
                top = temp;
                cont2++;
                total++;
            } else if (cont2 == 1) {
                Nodo temp = new Nodo();
                System.out.println("\n" + "Palabra generada: ");
                temp.name = Mayus + Alfanumericos3 + Caracteres3;
                temp.next = top;
                System.out.print(reset + "[" + azul + temp.name + reset + "]\n");//Muestra la palabra generada que se agregara a la lista
                top = temp;
                cont2 = reg;
                total++;
            }
        }
    }
}
