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

/*  * The Journal class represents a journal with its details such as name, journal ID, issue number, and ISSN. 
    * This is a blueprint for creating journal objects in the Journal Registration system.
*/

class Journal {
    String name;
    String journalId;
    String issueNumber;
    String issn;

/*  * The below constructor initializes the attributes of the Journal class. 
    * It takes four parameters: name, journalId, issueNumber, and issn.
    * When a Journal object is created, these parameters are passed to the constructor to set the initial values of the journal's attributes.
    
    * THIS keyword means that the current instance of the Journal class is being referred to. 
    * This is used to differentiate between the instance variables (attributes) and the parameters passed to the constructor.
    * Both have the same names, i.e. both the instance variable and the parameter are named 'name', 'journalId', 'issueNumber', and 'issn'.
        
*/  
    Journal(String name, String journalId, String issueNumber, String issn) {
        this.name = name;
        this.journalId = journalId;
        this.issueNumber = issueNumber;
        this.issn = issn;
    }

/*  * The validateName() method is responsible for validating the journal name according to specific criteria.
    
    * This method checks if the journal name is valid based on the rules given in the assignment requirements:
    
    * The journal name must not exceed 30 characters in length. 
    * If it does, a CheckNameException is thrown with an appropriate error message.
    
    * The journal name must contain only alphabetic characters (letters). 
    * If it contains any non-alphabetic characters, a CheckNameException is thrown with an error message.    
 
    * If the journal name passes both checks, it is considered valid, and the method completes.

    * Let's break down the method line by line:

    * The method signature includes "throws CheckNameException".
    * This indicates that this method may throw a CheckNameException if the validation fails. 
    * This allows the calling code to handle this exception appropriately when it is thrown.

    * The "void" keyword indicates that this method does not return any value.

    * The method name is "validateName", which clearly indicates its purpose, i.e. to validate the journal name.

    * The first check in the method is to see if the length of the journal name exceeds 30 characters. 
    * If it does, a CheckNameException is thrown with the message "Journal name must not exceed 30 characters." 
    * This provides specific feedback to the user about why their journal name is invalid.
    * 
    * The second check is a for-loop that iterates through each character of the journal name. 
    * Instead of REGEX (regular expressions), the Character.isLetter() method is used to check if each character is a letter.
    * If any character is found that is not a letter, a CheckNameException is thrown with the message "Journal name must contain only alphabets."
    
    * For my knowledge only - the difference between throw and throws in Java:
    
    * "throw" is used to actually throw an exception.
    * "throws" is used in a method signature to declare that the method may throw certain exceptions. 
*/

    void validateName() throws CheckNameException {
        if (name.length() > 30) {
            throw new CheckNameException("Journal name must not exceed 30 characters."); 
            
            // is this constructor or method? 
            // I think this is a constructor because it is creating an instance of the CheckNameException class and passing a message to it.
        
        }

    // this for-loop iterates through each character of the journal name and checks if it is a letter using Character.isLetter() method.
    // If any character is found that is not a letter, a CheckNameException is thrown with the message "Journal name must contain only alphabets."

    // the ! before Character.isLetter() means that if the character is NOT a letter, then the condition is true and the exception is thrown.

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                throw new CheckNameException("Journal name must contain only alphabets.");
            }
        }
    }

/* * This is our second validation method, i.e. validateJournalId().

    * This method is responsible for validating the journal ID according to specific criteria given in the assignment requirements.
    * The journal ID must contain only letters and numbers. 
    * If the journal ID contains any character that is not a letter or a number, a CheckJournalIdException is thrown with an appropriate error message. 

    * The method signature includes "throws CheckJournalIdException". 
    * This indicates that this method may throw a CheckJournalIdException if the validation fails.
    
    * The method uses a for-loop to iterate through each character of the journal ID. 
    * It checks if it is either a letter or a digit using Character.isLetterOrDigit() method.
    
    * If any character is found that is not a letter or a digit, a CheckJournalIdException is thrown with a message to user.

    * The method does not return any value, as indicated by the "void" keyword in the method signature.

    *The "throws" keyword in the method signature indicates that this method may throw a CheckJournalIdException.
*/

    void validateJournalId() throws CheckJournalIdException {

    // less-than journalId.length() because we want to check each character of the journal ID, and the index starts from 0.
    // The ! before Character.isLetterOrDigit() means that if the character is NOT a letter or a digit.
        
    for (int i = 0; i < journalId.length(); i++) {
        if (!Character.isLetterOrDigit(journalId.charAt(i))) {
            throw new CheckJournalIdException("Journal ID must contain only letters and numbers.");
        }
    }
}

/* * The below method is our third validation method, i.e. validateIssueNumber(). 

    * This method validates the journal issue number according to the criteria given in the assignment requirements.
    * The issue number must not exceed 20 characters in length. 
    * If the issue number exceeds this limit, a CheckIssueNumberException is thrown with an appropriate error message.

    * The method signature includes "throws CheckIssueNumberException". 
    * 'Throws' indicates that this method may throw a CheckIssueNumberException if the validation fails.
*/

void validateIssueNumber() throws CheckIssueNumberException {
    if (issueNumber.length() > 20) {
        throw new CheckIssueNumberException("Issue number must not exceed 20 characters.");
    }
}

/* * The below method is our fourth validation method, i.e. validateISSN().

    * This method validates the ISSN of the journal according to the assignment requirements.
    * The ISSN must be exactly 9 characters long and follow the format NNNN-NNNN.
    * If the ISSN does not meet these criteria, a Check_ISSN_Exception is thrown with an appropriate error message.

    * The method signature includes "throws Check_ISSN_Exception". 
    * 'Throws' indicates that this method may throw a Check_ISSN_Exception if the validation fails.

    * The method performs three checks as required by the assignment:
    
        1. Is the length of the ISSN exactly 9 characters? If not, it throws an exception with a message.
        
        2. Is hyphen at the 5th position (index 4) a hiphen? If not, it throws an exception with a message.
        
        3. Are first four characters and the last four characters digits? If not, it throws an exception with a message. 
*/

void validateISSN() throws Check_ISSN_Exception {

// This ensures that length is exactly 9 characters.

    if (issn.length() != 9) {
        throw new Check_ISSN_Exception("ISSN must be exactly 9 characters long.");
    }

// This ensures that there is a hyphen at the 5th position (index 4).

    if (issn.charAt(4) != '-') {
        throw new Check_ISSN_Exception("ISSN must have a hyphen at the 5th position.");
    }
        
// The first for-loop checks the first four characters (index 0 to 3) to ensure they are digits.

    for (int i = 0; i < 4; i++) {
        if (!Character.isDigit(issn.charAt(i))) {
            throw new Check_ISSN_Exception("First four ISSN characters must be digits.");
        }
    }
// The second for-loop checks the last four characters (index 5 to 8) to ensure they are digits.

    for (int i = 5; i < 9; i++) {
        if (!Character.isDigit(issn.charAt(i))) {
            throw new Check_ISSN_Exception("Last four ISSN characters must be digits.");
        }
    }
}

}