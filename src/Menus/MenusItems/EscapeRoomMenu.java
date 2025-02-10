package Menus.MenusItems;

import java.util.Scanner;

import static Menus.MenusItems.TrackMenu.hintStart;
import static Menus.MenusItems.ItemMenu.itemStart;
import static Menus.MenusItems.RoomMenu.roomStart;

public class EscapeRoomMenu {

    public static void escapeRoomStart() {

        Scanner sc = new Scanner(System.in);
        int choose;
        boolean exit = true;
        do {
            try {

                System.out.println(" ");
                System.out.println("***Bienvenido al gestor de salas***");
                System.out.println("1.-Gestión de salas");
                System.out.println("2.-Gestión de ítems");
                System.out.println("3.Gestión de pistas");
                System.out.println("4.-Salir de la aplicación");

                System.out.print("Elige una opción: ");

                choose = sc.nextInt();
                sc.nextLine();

                switch (choose) {

                    case 1: roomStart();
                    break;
                    case 2: itemStart();
                    break;
                    case 3: hintStart();
                    break;
                    case 4: exit = false;
                    break;
                    default:System.out.println("Valor incorrecto");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Debes ingresar un número entero.");
                sc.nextLine();
            }
        } while (exit);
    }
}

