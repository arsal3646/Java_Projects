// remove special characters from a string
// remove spaces from a string
// find number of words in a string

import java.lang.*;
import java.util.*;

class Video_057_Regular_Expressions_02
{
    public static void main(String args[])
    {
        String str = "a!B@c#1$2%3";        // remove the special characters. Use method called replace() and replaceAll()

        // replace will just replace one occurrence while replaceAll() will replace all occurrences

        str = str.replace("!","");
        str = str.replace("@","");
        str = str.replace("#","");
        str = str.replace("$","");
        str = str.replace("%","");

        System.out.println("The first string is: "+str);

        String str2 = "a!B!c!1!2!3"; 
        str2 = str2.replace("!","");

        System.out.println("The second string is: "+str2);

        // Let's see how ReplaceAll() works

        String str3 = "a!B@c#1$2%3";   
        str3 = str3.replaceAll("[^a-zA-Z0-9]","");   // NOT type regular expression, i.e. if not among these, then remove them.
        System.out.println("The third string is: "+str3);


        // Let's remove spaces and allow only one space

        String str4 = "A   quick     brown fox      jumps   over    the lazy dog .";   
        System.out.println("The fourth string is: "+str4.replaceAll("\\s+"," "));   // replace with single space if there are multiple spaces // small S means space while Capital S means not a space

        String str5 = "A quick brown fox jumps over the lazy dog.";   
        System.out.println("The fifth string is: "+str5.replaceAll(" +"," "));   // replace with single space if there are multiple spaces

        String words[] = str5.split("\\s");  // array of words split on basis of spaces

        System.out.println("number of words is: "+words.length);
    }
}