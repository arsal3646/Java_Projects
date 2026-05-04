/* Summary of the Assignment: 

    The task is to create a Java program that demonstrates the use of: 
    
    * exceptions handling 
    * collections
    * sorting mechanisms. 

The program consists of two main parts: 

    * Journal Registration system
    * Passenger Registration system. 

1. Journal Registration system:

    * User-defined exceptions validate journal details such as name, journal ID, issue number, and ISSN. 
    * Regex (regular expressions) are not permitted to be used as per the assignment instructions.
    * The validation is performed using character-level checks instead of regex (regular expressions). 
    * Only valid journal entries will be accepted and displayed. This ensures proper error handling. 

2. Passenger Registration system:
    * A Passenger class is created with various attributes. 
    * Multiple passenger objects are stored in a list. 
    * The system ensures that all passenger IDs are unique before processing further. 
    * The program supports sorting of passenger data using both Comparable and Comparator interfaces. 
    
*/

/*  The Journal class represents a journal with its details such as name, journal ID, issue number, and ISSN. 
    This is a blueprint for creating journal objects in the Journal Registration system.
*/

class Journal {
    String name;
    String journalId;
    String issueNumber;
    String issn;
}