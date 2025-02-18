package Controller;

import Model.Client;
import Model.Room;
import Model.Ticket;
import Services.ClientService;
import Services.RoomService;

import java.util.Scanner;

import static Controller.ClientController.createClient;
import static Controller.ClientController.showClient;
import static Controller.RoomController.showRooms;

public class TicketController {
    public static void createTicketClient(){
        Scanner sc= new Scanner(System.in);
        RoomService roomService=new RoomService();
        ClientService clientService=new ClientService();
        int idUser=0;
        int choose;
        int sesionId=0;
        float price= 24.95f;

        System.out.println("Selecciona la posicion de la room a la que quieres añadir un ticket:");
        showRooms();
        choose=sc.nextInt();
        sc.nextLine();
        Room room=roomService.getRoom(choose);
        System.out.println("Selecciona la posicion de la sesion para la que quieres el ticket");
        choose=sc.nextInt();
        sc.nextLine();
        //metodo que devuelva la sesion por posicion;
        //sesionId=sesion.getID();
        System.out.println("Selecciona la posicion del cliente al que quieres añadir un ticket:");
        showClient();
        choose=sc.nextInt();
        sc.nextLine();
        Client client=clientService.getClient(choose);

        client.setSesionId(sesionId);
        idUser=client.getId();
        Ticket ticket= new Ticket(idUser,price);
        //metodo servicio para asignar tiket a user
        System.out.println("Se le ha asignado ticket");
    }
    public static void createTicket(){
        Scanner sc= new Scanner(System.in);
        RoomService roomService= new RoomService();
        int idUser;
        int sesionId=0;
        int choose;
        float price= 24.95f;

        System.out.println("Selecciona la posicion de la room a la que quieres añadir un ticket:");
        showRooms();
        choose=sc.nextInt();
        sc.nextLine();
        Room room=roomService.getRoom(choose);
        System.out.println("Selecciona la posicion de la sesion para la que quieres el ticket");
        choose=sc.nextInt();
        sc.nextLine();
        //sesionID=room.getID();

        idUser=createClient(sesionId).getId();
        Ticket ticket= new Ticket(idUser,price);
        //metodo servicio para asignar tiket a user;
    }
    public static void showTicket(){
        ClientService clientService = new ClientService();
        Scanner sc= new Scanner(System.in);
        int idUser=0;
        int choose;
        showClient();
        System.out.println("Selecciona la posicion del cliente al que quieres mostrar los  tikets:");
        choose=sc.nextInt();
        sc.nextLine();
        Client client=clientService.getClient(choose);
        //print tiket por posicion ;
    }
    public static void deleteTicket(){
        Scanner sc=new Scanner(System.in);
        int choose;
        showTicket();
        System.out.println("Selecciona la posicion del tiket que quieres eliminar :");
        choose= sc.nextInt();
        sc.nextLine();
        //eliminar tiket por posicion;
    }


}
