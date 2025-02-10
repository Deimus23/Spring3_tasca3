package Menus.MenusItems;

import java.util.Scanner;

public class TrackMenu {

    public static void hintStart() {
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean exit = true;
        do {
            try {
                System.out.println("***Bienvenido al gestor de pistas***");
                System.out.println("1.-Crear pista");
                System.out.println("2.-Eliminar pista");
                System.out.println("3.-Mostrar pistas");
                System.out.println("4.-Modificar pista");
                System.out.println("5.-Atras");
                System.out.print("Elige una opción: ");

                choose = sc.nextInt();
                sc.nextLine();

                switch (choose) {
                    case 1: // metodo para crear sala;
                        break;
                    case 2: // metodo para eliminar sala;
                        break;
                    case 3: // metodo para mostar todas las salas;
                        break;
                    case 4: // metodo para modificar sala;
                        break;
                    case 5:
                        exit = false;
                        break;
                    default:
                        System.out.println("Valor incorrecto");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Debes ingresar un número entero.");
                sc.nextLine();
            }
        } while (exit);
    }
}

