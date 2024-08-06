# RESERVATION SYSTEM


Initialization

The program starts by initializing an array of 10 boolean elements (seats), all set to false (unreserved).
User Interaction Loop

The main method contains an infinite loop that continuously prompts the user to choose an option from a menu:
markdown
Copy code
1. VIEW SEAT MAP
2. RESERVE SEAT
3. CANCEL THE RESERVATION
4. EXIT
The user inputs their choice, and the program performs the corresponding action.
Viewing the Seat Map

If the user chooses option 1, the program displays the current status of all seats.
Reserved seats are marked with an "X", and available seats are shown by their seat number (1-10).
Reserving a Seat

If the user chooses option 2, the program prompts the user to enter a seat number (1-10).
If the seat number is valid and the seat is not already reserved, the program reserves the seat (sets the corresponding array element to true).
Canceling a Reservation

If the user chooses option 3, the program prompts the user to enter a seat number (1-10).
If the seat number is valid and the seat is currently reserved, the program cancels the reservation (sets the corresponding array element to false).
Exiting the Program

If the user chooses option 4, the program terminates.
