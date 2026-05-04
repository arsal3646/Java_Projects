/* Summary of the Assignment: 

    The task is to create a Java program that demonstrates the use of exceptions, collections, and sorting mechanisms. 

The program will consist of two main parts: 
    * Journal Registration system
    * Passenger Registration system. 

1. Journal Registration system:

    * user-defined exceptions will be created to validate journal details such as name, journal ID, issue number, and ISSN. 
    * The validation will be performed using character-level checks instead of regular expressions. 
    * Only valid journal entries will be accepted and displayed, ensuring robust error handling.
*/


The first problem requires the development of a Journal Registration system where user-defined exceptions 
are created by extending the Exception class. These exceptions are used to validate journal details such as name, 
journal ID, issue number, and ISSN. The validation must be performed using character-level checks instead 
of regular expressions. Only valid journal entries should be accepted and displayed, ensuring robust error handling.

The second problem involves designing a Passenger Registration system using Java Collections. A Passenger class must 


be created with various attributes, and multiple passenger objects should be stored in a list. The system must ensure that 
all passenger IDs are unique before processing further.

Additionally, the program should support sorting of passenger data using both Comparable and Comparator interfaces. 
Natural ordering must be defined based on the passenger name, while other attributes such as age, ID, 
and destination should be sorted using separate Comparator implementations.

Overall, the assignment aims to strengthen understanding of data validation, exception handling, 
object modeling, collection frameworks, and sorting techniques in Java through practical implementation.
*/

class Journal {
    String name;
    String journalId;
    String issueNumber;
    String issn;
}