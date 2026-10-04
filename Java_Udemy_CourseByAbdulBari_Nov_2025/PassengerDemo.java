import java.util.*;

// I created a class (blueprint) for the passengers. It has all the attributes that a passenger has.

class Passenger implements Comparable<Passenger> {  // implements allows us to compare passengers based on their names for sorting purposes.
                                                    // The class says, "I know how to compare my name with another Passenger name"  
    
    public int compareTo(Passenger other) {         // This method compares current Passenger object with another Passenger object based on name.  
    return this.name.compareToIgnoreCase(other.name); // This line compares the names of two passengers in a case-insensitive manner.         
    }

    
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

// Assignment Requirement: Ensure that the passenger ID is unique.
// the below code checks if the passenger ID entered by the user is unique. 
// If it is a duplicate, it will not add the passenger to the list.

// the boolean variable 'isDuplicate' is used to track whether the entered passenger ID already exists in the passengers list.

boolean isDuplicate = false;

// this for-each loop compares existing passengerId(s) in the list with the ID entered by the user.
for (Passenger p : passengers) {
    if (p.passengerId.equals(id)) {
        isDuplicate = true;
        break;
    }
}

if (isDuplicate) {
    System.out.println("You entered a Duplicate ID! The passenger details are not added to the list.");
} else {
    passengers.add(p1);
}

// ----------- HARDCODED (4 PASSENGERS) -----------

Passenger p2 = new Passenger("Amit", "123456789010", 55, "Economy", "A1", "Delhi", "Mumbai"); 

// Here, I am creating a new Passenger object with hardcoded values and adding it to the passengers list.

Passenger p3 = new Passenger("Shah", "123456789011", 30, "Business", "B2", "Chennai", "Kolkata");
Passenger p4 = new Passenger("Priya", "123456789012", 18, "First", "C3", "Bangalore", "Hyderabad");
Passenger p5 = new Passenger("Justin", "123456789013", 42, "Economy", "D4", "London", "Jaipur");

// The below lines add the hardcoded passenger objects to the passengers list.
passengers.add(p2);
passengers.add(p3);
passengers.add(p4);
passengers.add(p5);

/*  * The below line sorts the passengers list based on the name of the passengers in alphabetical order.
    * We can use lambda expression but I don't know how to use it properly.
    
    * The Collections is used when we want to perform operations on collections of objects, such as sorting, searching, or modifying them.
    * Collection is an alternative to arrays. 
    * It provides more flexible and powerful data structures for managing groups of objects.

    * The comparator is an interface in Java that defines a method for comparing two objects.
    * It is used to sort objects based on specific criteria. In this case, we are comparing passengers based on their names.

    * The comparator's compare method takes two Passenger objects (a and b). 
    * It compares their names using the compareTo method of the String class.
    * It is used to compare objects based on specific criteria. 
    * In this case, we are comparing passengers based on their names.
    
    Revision: Comparator vs Comparable

    * Comparable is an interface that defines a "natural" ordering for objects of a class. 
    * It has a compareTo method that compares the current object with another object of the same type, e.g. two passenger objects.
    * A class that implements Comparable can be sorted using Collections.sort() without needing an external comparator.
    
    * Comparator is an interface that defines a "custom" ordering for objects of a class. 
    * It has a compare method that compares two objects of the "same" type, e.g. two Passenger objects. 
    * The above (i.e. two same objects comparison) is same as comparable, but 
    * the difference is that it is used when we want to sort objects based on different criteria.
*/    

Collections.sort(passengers, new Comparator<Passenger>() {  // comparator to sort passengers based on name
    public int compare(Passenger a, Passenger b) {
        return a.name.compareTo(b.name);  // This line compares the names of two passengers based on alphabetical order.
    }
   });

// The below code sorts the passengers list based on the age of the passengers in ascending order.

/* Collections.sort(passengers, new Comparator<Passenger>() {  // comparator to sort passengers based on age
    public int compare(Passenger a, Passenger b) {          
        return a.age - b.age;
}

});    
*/

Collections.sort(passengers);  // This line sorts the passengers list based on the natural ordering (i.e., by name).

System.out.println("\nPassenger List:\n");  // This line prints a header for the passenger list.

for (Passenger p : passengers) {            // for-each loop iterates each Passenger object and prints their details.
                                    
    System.out.println(
        p.name + " | " +                    // prints name of the passenger
        p.passengerId + " | " +             // prints passenger ID
        p.age + " | " +                     // prints age of the passenger   
        p.ticketClass + " | " +             // prints ticket class of the passenger
        p.seatNumber + " | " +              // prints seat number of the passenger
        p.startPlace + " -> " +             // prints starting point of the journey
        p.destination                       // prints destination of the journey
    );
}
}
}