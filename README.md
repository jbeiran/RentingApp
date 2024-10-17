# RentingApp

This project implements a room renting system as per the UML diagram and specifications provided.

## Project Structure

The project follows the specified package structure:

- `org.ulpgc.is1.control`: Contains the main application logic and control classes.
- `org.ulpgc.is1.model`: Contains the domain model classes.

## Classes

- `Customer`: Represents a customer with name, surname, and telephone.
- `Room`: Represents a room with name, capacity, day price, and type.
- `RoomType`: Enum representing different types of rooms.
- `Renting`: Represents a renting transaction with dates, room, customer, and extras.
- `Extra`: Abstract class for additional services (Equipment and Translator).
- `Equipment`: Represents equipment that can be rented.
- `Translator`: Represents a translator service.
- `Payment`: Represents a payment for a renting.
- `RentingManager`: Manages the overall renting system.
- `Main`: Contains the main method to run the application.

## How to Run

Compile and run the `Main` class to see a demonstration of the system's functionality.

## Notes

- The project uses Java's built-in `ArrayList` for managing collections.
- Date handling is done using `LocalDate` for better date manipulation.
- The system prevents adding duplicate customers, rooms, or extras.
