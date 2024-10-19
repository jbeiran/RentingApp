package src.org.ulpgc.is1.control;

import src.org.ulpgc.is1.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RentingManager rentingManager = new RentingManager();


        Customer customer1 = new Customer("Adrian", "Mendez", CustomerType.Basic);
        rentingManager.addCustomer(customer1);
        rentingManager.addCustomer(customer1);
        Customer customer2 = new Customer("Pablo", "Garcia", CustomerType.Gold);
        rentingManager.addCustomer(customer2);


        Room room1 = new Room("Sala mortal", 6, 13, RoomType.Showroom);
        rentingManager.addRoom(room1);
        rentingManager.addRoom(room1);
        Room room2 = new Room("Classic", 4, 20, RoomType.MeetingRoom);
        rentingManager.addRoom(room2);

        Equipment toallas = new Equipment(5, "toallas");
        rentingManager.addEquiment(toallas);
        rentingManager.addEquiment(toallas);

        rentingManager.rent(room2, customer1, null, "2024-10-19", "2024-10-20", "2024-10-26", "2024-10-19");
        rentingManager.rent(room2, customer2, toallas, "2024-10-30", "2024-11-05", "2024-11-10", "2024-11-01");

        System.out.print("\n\nAlquileres de: " + room2.getName() + "\n");
        System.out.print("\n******************************************************************\n" +
                "*) Datos de la sala: \n" + " <->  Nombre: " + room2.getName() +
                "\n" + " <->  Capacidad: " + room2.getCapacity() + "\n <->  Tipo:"
                + room2.getType() + "\n <->  Precio por día: " + room2.getDayPrice() +
                " euros.\n" + "--------------------------------------------------------------------\n\n");
        for(Renting rent: room2.getRentings()) {

            System.out.print("\n/////////////////////////////////////////////////////////////////\n" +
                    "Alquiler--> " + rent.getId() +
                    "\n/////////////////////////////////////////////////////////////////\n*) Atributos del alquiler: \n" +
                    "  *  Día en el que se realizó: " + rent.getDate() + "\n  *  Día de entrada:"
                    + rent.getFrom() + "\n  *  Día de salida: " + rent.getTo() + "\n  * Precio del alquiler: " + rent.getPayment().getPrice() +
                    "\n  * Pago de " + rent.getPayment().getPrice() + " euros el " + rent.getPayment().getDate() +
                    "\n  * Persona que realizó la reserva: " + rent.getCustomer().getName() + " [ Cliente tipo " + rent.getCustomer().getType() + " ]" +
                    "\n--------------------------------------------------------------------\n\n");
        }
    }

}
