package Actividad5;

import java.util.Scanner;

public class Actividad7_SumaPilas {

    int tam = 0, cont = 0, cont2 = 0, Sum = 0;//Variables usadas
    private int vector[];
    private int vector2[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0, x;
        System.out.println("***********************************************************");
        System.out.println("* Tecnologico de Estudios Superiores del Estado de Mexico *");
        System.out.println("* \t\t Estructura de datos AED-1026   \t  *");
        System.out.println("* \t\t     Omar Valencia Cruz \t\t  *");
        System.out.println("* \t\t     Aldair Ramón Silva \t\t  *");
        System.out.println("* \t\t\t    3S11 \t\t\t  *");
        System.out.println("***********************************************************");
        System.out.print("\t\033[34m     Ingresa el tamaño de la pila A y B: \033[m");
        x = sc.nextInt();
        Actividad7_SumaPilas Pilass = new Actividad7_SumaPilas(x);
        System.out.println("");
        do {
            System.out.println("1 - Llenar pilas A y B.\n"
                    + "2 - Mostrar pilas A y B.\n"
                    + "3 - Vaciar pilas A y B.\n"
                    + "4 - Unir pilar.\n"
                    + "5 - Mostrar pila C.\n"
                    + "6 - Salir.");

            System.out.print("\n\033[34m" + "Seleccione una opción: \033[m");

            switch (opt = sc.nextInt()) {
                case 1: //Opc. 1 para llenar la pila con el tamaño que el usuario ingrese
                    Pilass.Llenar();
                    break;

                case 2: //Opc. 2 para mostrar la pila con los números aleatorios generada.
                    Pilass.Mostrar();
                    break;

                case 3: //Opc. 3 para eliminar las pilas A y B generadas.
                    Pilass.Eliminar();
                    break;
                case 4: //Opc. 4 para sumar las pilas A y B.
                    Pilass.Unir();
                    break;
                case 5: //Opc. 5 para mostrar la pila C.
                    Pilass.PilaC();
                    break;
            }
        } while (opt != 6); //Si el usuario selecciona Opc. 6 terminara la ejecución
    }

    public Actividad7_SumaPilas(int x) {
        tam = x;
        vector = new int[tam];
        vector2 = new int[tam];
    }

    public void Llenar() {
        if (cont > 0 || cont2 > 0) { //Condición para detecta si el usuario ya habia llenado las pilas A y B anterior 
            System.out.println("\033[31m" + "Las Pila A y B estan llenas, elegir Opc. 3 para eliminar los valores de las pilas y poder llenar de nuevo la pilas A y B con el tamaño "+tam+"\033[m\n");
        } else {
            for (int i = 0; i < tam; i++) {
                int a = (int) (Math.random() * (100) + (1)); //Math.random para generar números randoms del 1 al 100
                vector[i] = a;
            }
            System.out.println("\n\033[31m" + "Pila A llena \033[m");
            for (int j = 0; j < tam; j++) { 
                cont++;//Incremento para la pila A hasta que la variable j sea igual al tamaño de la pila
            }
            for (int i = 0; i < tam; i++) {
                int a = (int) (Math.random() * (101) + (100)); //Math.random para generar números randoms del 100 al 200
                vector2[i] = a;
            }
            System.out.println("\033[35m" + "Pila B llena \033[m");
            for (int r = 0; r < tam; r++) {
                cont2++; //Incremento para la pila B hasta que la variable r sea igual al tamaño de la pila
            }
            System.out.println("");
        }
    }

    public void Mostrar() {
        if (cont > 0 && cont2 > 0) { //Si los cont y cont2 fuerón incrementando entonces se mostraran las pilas.
            System.out.println("\n\033[31m" + "Pila A \033[m");
            for (int j = 0; j < tam; j++) {
                System.out.print(vector[j] + "  "); //Mostrar la pila A.
            }

            System.out.println("\n\n\033[35m" + "Pila B \033[m");
            for (int r = 0; r < tam; r++) {
                System.out.print(vector2[r] + "  "); //Mostrar la pila B.
            }
            System.out.println("\n");

        } else {
            System.out.println("\033[31m" + "Pila A \033[m" + "y" + "\033[35m" + " Pila B \033[m" + "están vacias... \n"); // Si el usuario aun no selecciona la Opc. 1 no mostrara ningún dato.
        }
    }

    public void Eliminar() {
        if (cont > 0 && cont2 > 0) { //Si el usuario a generado de manera correcta la pila, entonce cont y cont2 seran mayores a 0 y se eliminaran las pilas
            for (int i = 0; i <= tam; i++) {
                cont--;//Eliminar pila A (decremento)
                cont2--;//Eliminar pila B
            }
            if (Sum > 1) { //Si el usuario ya había sumado anterior las pilas a la variable Sum eleminara los datos.
                for (int i = 0; i < Sum; i--) {
                    Sum--;
                }
            }
            System.out.println("Pilas eliminadas \n");
        } else {
            System.out.println("No hay elementos para eliminar... \n"); //Si el usuario no a generado las pilas, entonces no se eliminara ningún dato.
        }
    }

    public void Unir() {
        if (cont > 0 || cont2 > 0) { //Si el usuario a generado de manera correcta la pila, entonces cont y cont2 seran mayores a 0 y se sumaran las pilas.
            System.out.println("Pilas sumadas...");
            for (int j = 0; j < tam; j++) {
                Sum = (vector[j] + vector2[j]); //Almacenar los vectores en la variable Sum
            }
            System.out.println("");
        } else {
            System.out.println("No hay datos para unir las pilas... \n"); //Si el usuario no a generado las pilas, entonces no se sumaran las pilas.
        }
    }

    public void PilaC() {
        if (cont > 0 || cont2 > 0) { //Si el usuario a generado de manera correcta la pila, entonces cont y cont2 seran mayores a 0 y se sumaran las pilas.
            System.out.println("\n\033[34m" + "Pila C \033[m");

            if (Sum > 0) {//Si la variable Sum se almacenaron los vectores, entoces mostrara la pila C
                for (int j = 0; j < tam; j++) {
                    System.out.print(vector[j] + vector2[j] + "  ");
                    /*vector = Pila A, vector2 = Pila B, Ejem. Pila A[18][58][29][21] + Pila B[132][186][187][102] = Pila C[150][244][216][123]*/
                }
                System.out.println("\n");
            } else { //Si el usuario no a seleccionado la Opc. 4 entonces no se podra mostrar la pila C
                System.out.println("No se a sumado las pilas A y B \n");
            }
        } else {
            System.out.println("No existe la Pila C \n");
            /*Si el usuario aun no a seleccionado la Opc. 1 entonces no podra mostrar la pila C, porque no a generado la pila A y B*/
        }
    }
}
