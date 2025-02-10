package Menus.MenusItems;

import java.util.Scanner;

public class ItemMenu {

    public static void itemStart() {
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean exit = true;
        do {
            try {
                System.out.println("***Bienvenido al gestor de items***");
                System.out.println("1.-Crear item");
                System.out.println("2.-Eliminar item");
                System.out.println("3.-Mostrar items");
                System.out.println("4.-Modificar item");
                System.out.println("5.-Atras");
                System.out.print("Elige una opción: ");

                choose = sc.nextInt();
                sc.nextLine();

                switch (choose) {
                    case 1: // metodo para crear item;
                        break;
                    case 2: // metodo para eliminar item;
                        break;
                    case 3: // metodo para mostar todas las items;
                        break;
                    case 4: // metodo para modificar item;
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



