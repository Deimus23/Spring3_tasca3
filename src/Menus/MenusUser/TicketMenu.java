package Menus.MenusUser;

import java.util.Scanner;

public class TicketMenu {
    public static void ticketStart() {
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean exit = true;
        do {
            try {
                System.out.println(" ");
                System.out.println("*** Gestor de tickets***");
                System.out.println("1.-Jugadores exisente");
                System.out.println("2.-Nuevo jugador");
                System.out.println("3.-Atras");
                System.out.print("Elige una opción: ");

                choose = sc.nextInt();
                sc.nextLine();

                switch (choose) {
                    case 1:// print jugadores;
                        break;
                    case 2:// nuevo jugador y dar tiket;
                        break;
                    case 3:
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
