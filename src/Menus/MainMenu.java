package Menus;

import java.util.Scanner;

import static Menus.MenusUser.ClientMenu.clientStart;
import static Menus.MenusItems.EscapeRoomMenu.escapeRoomStart;

public class MainMenu {

  public static void Start() {
      Scanner sc = new Scanner(System.in);
      int choose;
      boolean exit = true;
      do {
          try {
              System.out.println(" ");
              System.out.println("***Bienvenido al gestor del scape room***");
              System.out.println("1.-Gestión de Escaperoom");
              System.out.println("2.-Gestión de jugadores");
              System.out.println("3.-Salir de la aplicación");
              System.out.print("Elige una opción: ");

              choose = sc.nextInt();
              sc.nextLine();

              switch (choose) {

                  case 1: escapeRoomStart();
                      break;
                  case 2: clientStart();
                      break;
                  case 3:
                      System.out.println("Saliendo de la aplicación...");
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