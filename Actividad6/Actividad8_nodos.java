package Actividad6;

import java.util.Scanner;

public class Actividad8_nodos {

    static class Node {
        String name;
        Node next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        // 1. The singly linked list does not exist
        //La lista enlazada individualmente no existe
        top = new Node();
        System.out.println("ingresa contenido de nodo incial");
        top.name = sc.nextLine();
        top.next = null;

        dump("Case 1", top);

        // 2. The singly linked list exists, and the no
        //do  debe insertarse 
        //antes que el primer nodo.
        Node temp;

        temp = new Node();
        System.out.println("ingresa contenido de nodo anterior a inicial");
        temp.name = sc.nextLine();
        temp.next = top;
        top = temp;

        dump("Case 2", top);

        // 3. The singly linked list exists, and the node must be inserted
        //    after the last node
        //3. La lista enlazada individualmente existe y el nodo debe insertarse.
        //después del último nodo
        temp = new Node();
        System.out.println("ingresa contenido de nodo posterior a inicial");
        temp.name = sc.nextLine();
        temp.next = null;

        Node temp2;

        temp2 = top;

        while (temp2.next != null) {
            temp2 = temp2.next;
        }

        temp2.next = temp;

        dump("Case 3", top);

        // 4. The singly linked list exists, and the node must be inserted
        //    between two nodes
        //4. La lista enlazada individualmente existe y el nodo debe insertarse.
        //    entre dos nodos
        temp = new Node();
        System.out.println("ingresa contenido de nodo intermedio");
        temp.name = sc.nextLine();

        temp2 = top;

        while (temp2.name.equals(top.name) == false) {
            temp2 = temp2.next;
        }

        temp.next = temp2.next;
        temp2.next = temp;

        dump("Case 4", top);
    }

    static void dump(String msg, Node topNode) {
        System.out.print(msg + " ");

        while (topNode != null) {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }
}