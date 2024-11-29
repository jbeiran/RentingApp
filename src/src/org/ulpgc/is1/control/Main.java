package src.org.ulpgc.is1.control;

import src.org.ulpgc.is1.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RentingManager rentingManager = new RentingManager();
        initializeData(rentingManager);
        displayRoomRentings(rentingManager.getRoom(0));
    }

    private static void initializeData(RentingManager rentingManager) {
        // Inicialización de clientes
        initializeCustomers(rentingManager);
        // Inicialización de salas
        initializeRooms(rentingManager);
        // Inicialización de equipamiento
        initializeEquipment(rentingManager);
        // Creación de alquileres
        createRentings(rentingManager);
    }

    private static void initializeCustomers(RentingManager rentingManager) {
        rentingManager.addCustomer("Adrian", "Mendez", CustomerType.Basic);
        rentingManager.addCustomer("Pablo", "Garcia", CustomerType.Gold);
    }

    private static void initializeRooms(RentingManager rentingManager) {
        rentingManager.addRoom("Sala mortal", 6, 13, RoomType.Showroom);
        rentingManager.addRoom("Classic", 4, 20, RoomType.MeetingRoom);
    }

    private static void initializeEquipment(RentingManager rentingManager) {
        rentingManager.addEquiment(5, "toallas");
        rentingManager.addEquiment(10, "microfonos");
    }

    private static void createRentings(RentingManager rentingManager) {
        rentingManager.rent(
            rentingManager.getRoom(1),
            rentingManager.getCustomer(0),
            null,
            "2024-10-19",
            "2024-10-20",
            "2024-10-26",
            "2024-10-19"
        );

        rentingManager.rent(
            rentingManager.getRoom(0),
            rentingManager.getCustomer(1),
            rentingManager.getEquiment(1),
            "2024-10-30",
            "2024-11-05",
            "2024-11-10",
            "2024-11-01"
        );
    }

    private static void displayRoomRentings(Room room) {
        System.out.println("\n\nAlquileres de: " + room.getName());
        displayRoomDetails(room);
        displayRentings(room);
    }

    private static void displayRoomDetails(Room room) {
        System.out.printf("""
            
            ******************************************************************
            *) Datos de la sala:
             <->  Nombre: %s
             <->  Capacidad: %d
             <->  Tipo: %s
             <->  Precio por día: %d euros.
            --------------------------------------------------------------------
            
            """,
            room.getName(),
            room.getCapacity(),
            room.getType(),
            room.getDayPrice()
        );
    }

    private static void displayRentings(Room room) {
        for (Renting rent : room.getRentings()) {
            System.out.printf("""
                
                /////////////////////////////////////////////////////////////////
                Alquiler--> %d
                /////////////////////////////////////////////////////////////////
                *) Atributos del alquiler:
                  *  Día en el que se realizó: %s
                  *  Día de entrada: %s
                  *  Día de salida: %s
                  *  Precio del alquiler: %d
                  *  Pago de %d euros el %s
                  *  Persona que realizó la reserva: %s [ Cliente tipo %s ]
                --------------------------------------------------------------------
                
                """,
                rent.getId(),
                rent.getDate(),
                rent.getFrom(),
                rent.getTo(),
                rent.getPayment().getPrice(),
                rent.getPayment().getPrice(),
                rent.getPayment().getDate(),
                rent.getCustomer().getName(),
                rent.getCustomer().getType()
            );
        }
    }
}