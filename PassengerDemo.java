
// I created a class (blueprint) for the passengers. It has all the attributes that a passenger has.

class Passenger {
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

Passenger(
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

/*  * The above Passenger class is a blueprint for creating passenger objects.
    * While the below PassengerDemo class is where we enter execution of the program. 
    * This is where we will create instances of the Passenger class and perform operations on them.
*/

public class PassengerDemo {
    public static void main(String[] args) {

/*  * The below line creates an ArrayList to store multiple 'Passenger' objects.
    * This allows us to manage a list of passengers easily.

    * The ArrayList is GENERICS type, which means it can only hold objects of the specified type (in this case, Passenger).
    * Generics provide type safety, ensuring that we can only add Passenger objects.

    * We can add, remove, and access passengers in this list as needed.
*/
    Scanner sc = new Scanner(System.in);
    ArrayList<Passenger> passengers = new ArrayList<>();

/* For demonstration purposes, I will add passengers to the list in two ways:
   1. Manual input from the user (for one passenger)
   2. Hardcoded data for four passengers
*/

//  The Scanner class is used to read input from the user. 
//  We create an instance of Scanner to read data from the console.


// ----------- MANUAL INPUT FROM USER (1 Passenger) -----------

System.out.println("Enter Passenger Name:");
String name = sc.nextLine();

System.out.println("Enter Passenger ID:");
String id = sc.nextLine();

System.out.println("Enter Age:");
int age = sc.nextInt();
sc.nextLine();

System.out.println("Enter Ticket Class:");
String ticketClass = sc.nextLine();

System.out.println("Enter Seat:");
String seat = sc.nextLine();

System.out.println("Enter Start:");
String start = sc.nextLine();

System.out.println("Enter Destination:");
String dest = sc.nextLine();

Passenger p1 = new Passenger(name, id, age, ticketClass, seat, start, dest);
passengers.add(p1);

// ----------- HARDCODED (4 PASSENGERS) -----------

Passenger p2 = new Passenger("Amit", "123456789010", 55, "Economy", "A1", "Delhi", "Mumbai");
Passenger p3 = new Passenger("Shah", "123456789011", 30, "Business", "B2", "Chennai", "Kolkata");
Passenger p4 = new Passenger("Priya", "123456789012", 18, "First", "C3", "Bangalore", "Hyderabad");
Passenger p5 = new Passenger("Justin", "123456789012", 42, "Economy", "D4", "London", "Jaipur");

passengers.add(p2);
passengers.add(p3);
passengers.add(p4);
passengers.add(p5);
    }
}