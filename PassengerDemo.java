
// I created a class (blueprint) for the passengers. It has all the attributes that a passenger has.

class Passenger 
{
    String name;            // name of the passenger
    String passengerId;     // unique identifier for the passenger (This must remain unique for each passenger)
                            // This must be 12 digits long and should not contain any letters or special characters.
  
    int age;                // age of the passenger
  
    String ticketClass;     // class of the ticket (e.g., economy, business, first class)
    String seatNumber;      // seat number assigned to the passenger

    String startPlace;      // starting point of the journey
    String destination;     // destination of the journey

/*  * The below is the constructor for the Passenger class. 
    * The constructor initializes all the attributes of the passenger when a new object is created.
    
    * The constructor takes parameters that correspond to each attribute and assigns them to the instance variables.
    * The constructor is called when we create a new Passenger object and pass the required information to it.
*/

Passenger
(
    String name, 
    String passengerId, 
    
    int age,
    
    String ticketClass, 
    String seatNumber,
    
    String startPlace, 
    String destination
) 
    
{   this.name = name;
    this.passengerId = passengerId;
    this.age = age;
    this.ticketClass = ticketClass;
    this.seatNumber = seatNumber;
    this.startPlace = startPlace;
    this.destination = destination;
}

}