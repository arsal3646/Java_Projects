/* Summary of the Assignment: 

    The task is to create a Java program that demonstrates the use of: 
    
    * exception handling 
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

/*  * The Journal class represents a journal with its details such as name, journal ID, issue number, and ISSN. 
    * This is a blueprint for creating journal objects in the Journal Registration system.
*/

class Journal {
    String name;
    String journalId;
    String issueNumber;
    String issn;
}

/*  * The CheckNameException class is a custom exception that extends the Exception class.
    * It is using inheritance concept of Object-Oriented Programming (OOP).
    * The class creates a custom exception for handling errors related to journal name validation. 
    * It is used to handle specific errors related to journal name validation in the Journal Registration system. 
    * When a journal name does not meet the required criteria, this exception can be thrown with a custom error message.
    
    * The exception is used when the journal name is invalid, such as when it contains non-alphabetic characters or is empty.
    * The message passed to the constructor is sent to the parent Exception class using the super() method.
    * Super() method allows for custom error messages to be displayed when the exception is thrown.

*/      

class CheckNameException extends Exception {
    CheckNameException(String message) {
        super(message);
    }
}

/*  * The CheckJournalIdException class is also a custom exception that extends the Exception class.
    * An exception is thrown when the journal ID is invalid such as not following the required format or containing invalid characters. 
    * Valid characters for journal ID include only letters and numbers only. Special characters are not allowed.
    * The error message is passed to the parent Exception class using super(message).

    Line-by-line explanation of the CheckJournalIdException class:
    
    * The first line extends the built-in Exception class. 
    * This means that CheckJournalIdException is a custom exception that can be thrown and caught in the program.
    
    * CheckJournalIdException(String message) is the constructor for the CheckJournalIdException class. 
    * The constructor takes a single parameter (message), which is a String that contains the error message.       
*/

class CheckJournalIdException extends Exception {
    CheckJournalIdException(String message) {
        super(message);
    }
}

/*  * The CheckIssueNumberException class is a custom exception that extends the Exception class.
    * This exception is specifically created to handle errors related to the journal issue number.

    * According to the assignment requirements, the issue number should NOT exceed 20 characters.
    * In other words, if the issue number length is greater than 20 characters, then it is considered invalid.
    * This custom exception will be thrown with an error message.

    * The class has one constructor, i.e. CheckIssueNumberException(String message).
    * This constructor accepts a custom error message when the exception is thrown.
    * The statement super(message) passes this custom error message to the constructor of the parent Exception class.

    Note: The parent Exception class stores this message internally, and it can later be retrieved using methods like getMessage() when the exception is caught.
*/

class CheckIssueNumberException extends Exception {
    CheckIssueNumberException(String message) {
        super(message);
    }
}

/*  * The Check_ISSN_Exception class is a custom exception that extends the Exception class.
    * This exception is specifically created to handle errors related to the ISSN of the journal.

    * According to the assignment requirements, the ISSN must be exactly 9 characters long (in a specific format).
    * The required ISSN format is NNNN-NNNN.
    * This means there must be four digits, then one hyphen, and then four more digits.
    * The hyphen must be present at the 5th position. This is important as it must not be in any other position.
    * Note: In Java index terms, the 5th position means index 4, because Java indexing starts from 0.
    
    * This custom exception will be thrown when the ISSN does not follow the required format.

    * The constructor Check_ISSN_Exception(String message) accepts a custom error message.
    * The statement super(message) passes this custom error message to the constructor of the parent Exception class.
    * The parent Exception class stores this message internally, and it can later be displayed using getMessage().
*/

class Check_ISSN_Exception extends Exception {
    Check_ISSN_Exception(String message) {
        super(message);
    }
}

