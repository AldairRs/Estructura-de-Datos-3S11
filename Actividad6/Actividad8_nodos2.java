package Actividad6;

import java.util.Scanner;

public class Actividad8_nodos2 {
    Scanner sc = new Scanner(System.in);
    int cont = 0;//Variable usada

    static class Node { //dato y enlace
        String name;
        Node next;
    }
    Node top = null;

    public static void main(String[] args) {
        System.out.println("***********************************************************");
        System.out.println("* Tecnologico de Estudios Superiores del Estado de Mexico *");
        System.out.println("* \t\t Estructura de datos AED-1026   \t  *");
        System.out.println("* \t\t     Omar Valencia Cruz \t\t  *");
        System.out.println("* \t\t     Aldair Ramón Silva \t\t  *");
        System.out.println("* \t\t\t    3S11 \t\t\t  *");
        System.out.println("***********************************************************");
        Scanner sc = new Scanner(System.in);
        int opt;
        Actividad8_nodos2 Nodoss = new Actividad8_nodos2();//Objeto Nodoss
        do {
            System.out.print("1 - Agregar nodo inicial.\n"
                    + "2 - Agregar nodo atras del inicial.\n"
                    + "3 - Agregar nodo adelante del inicial.\n"
                    + "4 - Agregar nodo intermedio.\n"
                    //+ "5 - Eliminar nodo.\n"
                    + "5 - Mostrar lista.\n"
                    + "6 - Mostrar cuantos nodos hay.\n"
                    + "7 - Salir.\n"
                    + "\n\t\t\033[34m Selecciona una opción: \033[m");
            switch (opt = sc.nextInt()) {
                case 1: //Opc.1 para agregar solo un nodo inical.
                    Nodoss.NodoInicial();
                    break;
                case 2: //Opc.2 para agregar un nodo antras del inicial.
                    Nodoss.NodoAtras();
                    break;
                case 3: //Opc.3 para agregar un nodo adelante del inicial.
                    Nodoss.NodoAdelante();
                    break;
                case 4: //Opc.4 para agregar un nodo intermedio.
                    Nodoss.NodoIntermedio();
                    break;
                /*case 5: //Opc.5 para eliminar un nodo.
                    Nodoss.EliminarNodo();
                    break;*/
                case 5: //Opc.5 para mostrar toda la lista de los nodos.
                    Nodoss.MostrarLista();
                    break;
                case 6: //Opc.6 para contar cuantos nodos hay.
                    Nodoss.NumNodos();
                    break;
            }
        } while (opt != 7); //Opc.7 Salir
    }
    
    public void NodoInicial() {
        if (top == null) { //Si el usuaria ya ingeso el primer nodo, esta condicion es para que si el usuario quiere ingresar denuevo el primer no se podra
            top = new Node();
            System.out.print("Ingresa el contenido para el nodo incial: ");
            top.name = sc.nextLine();
            top.next = null;
            dump("\n" + "Case 1 \033[35m", top); //Muestra el primer nodo ingresado
            System.out.println("");
            cont++; //Contador para los nodos
        } else {
            System.out.println("\n\033[31mYa no se puede agregar el nodo inicial \033[m\n");
        }
    }

    public void NodoAtras() {
        Node temp;
        temp = new Node(); //Crea un nuevo nodo temporal
        System.out.print("Ingresa el contenido para el nodo anterior a inicial: ");
        temp.name = sc.nextLine(); //Se ingresa el nodo
        temp.next = top; //El nodo ingresado se pasara atras del inicial
        top = temp;
        dump("\n" + "Case 2 \033[31m", top); //Mostrar el nodo
        System.out.println("");
        cont++; //Contador para los nodos
    }

    public void NodoAdelante() {
        Node temp;
        temp = new Node(); //Crea un nuevo nodo temporal
        System.out.print("Ingresa el contenido para el nodo posterior a inicial: ");
        temp.name = sc.nextLine(); //Se almacena el nodo
        temp.next = null;

        Node temp2;
        temp2 = top;

        while (temp2.next != null) { //Si el nodo temporan ingresado es diferente a nulo
            temp2 = temp2.next;     // entonces el nodo se pasara enfrente del nodo inicial
        }

        temp2.next = temp;
        dump("\n" + "Case 3 \033[35m", top); //Mostrar el nodo
        System.out.println("");
        cont++; //Contador para los nodos
    }

    public void NodoIntermedio() {
        Node temp, temp2, temp3;
        temp = new Node(); //Crea un nuevo nodo temporal
        temp3 = new Node();
        System.out.print("Ingresa el contenido para el nodo intermedio: ");
        temp.name = sc.nextLine(); //Pide al usuario que ingrese el nodo
        System.out.println("");
        dump("Entre que nodos lo quiere ingresar:\033[35m", top); //Muestra todos los nodos que hay
        System.out.print("Ingrese el primer nodo donde se ubican ambos nodos: ");//Por ejemplo, hay una lista de nodos [pepe] [jose] [ana] para ingresar un nodo entre los nodos [pepe] y [jose]
                                                                               //debe de ingresar el primer nodo que es [pepe], asi el codigo sabra donde colocar el nuevo nodo 
        temp3.name = sc.nextLine();
        
        temp2 = top;
        while (temp2.name.equals(temp3.name) == false) { //De esta forma el nodo que se ingreso se pasara enfrente del nodo que indico el usuario
            temp2 = temp2.next;
        }

        temp.next = temp2.next;
        temp2.next = temp;
        
        dump("\n" + "Case 4 \033[31m", top); //Mostrar el nodo
        System.out.println("");
        cont++;//Contador para los nodos
    }

    /*public void EliminarNodo() {
        Node temp;
        String Nod;
        int Opcion;
        temp = new Node();
        System.out.print("1 - Borrar el primer nodo. \n"
                + "2 - Borrar un nodo intermedio o el ultimo nodo.\n"
                + "Selecciona una opción: ");
        Opcion = sc.nextInt();
        if (Opcion == 1) {
            top = top.next;
        } else {
            System.out.println("Ingresa el nodo que deseas eliminar: ");
            Nod = sc.nextLine();
            System.out.println("Nodo eliminado...\n");
        }
    }*/

    public void MostrarLista() {
        dump("\n" + "Nodos: \033[35m", top); //Muestra todos los nodos ingresados
        System.out.println("");
    }
    
    public void NumNodos() {
        System.out.print("\n" + "Cuenta con \033[34m"+cont+" Nodos\n"); //Muestra la cantidad de nodos ingresados
        System.out.println("");
    }

    static void dump(String msg, Node topNode) { //Metodo estatico con los parametros de forma cadena y nodo
        System.out.print(msg + " ");
        while (topNode != null) {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }
}