package Menus.MenusUser;

import java.util.Scanner;

import static Menus.MenusUser.CertificateMenu.certificateStart;
import static Menus.MenusUser.TicketMenu.ticketStart;

public class ClientMenu {
    public static void clientStart() {
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean exit = true;
        do {
            try {
                System.out.println(" ");
                System.out.println("*** Gestor de clientes***");
                System.out.println("1.-Jugadores en sala");
                System.out.println("2.-Comprar tiket");
                System.out.println("3.-Dar certificados");
                System.out.println("3.-Atras");
                System.out.print("Elige una opción: ");

                choose = sc.nextInt();
                sc.nextLine();

                switch (choose) {
                    case 1:// print jugadores en sala
                        break;
                    case 2:ticketStart();
                        break;
                    case 3:certificateStart();
                        break;
                    case 4:
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
