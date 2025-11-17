// This concept is related to conversion of data types of given data items.
// Widening (upcasting) means accomodating smaller data type (e.g. byte or short) in bigger data type (e.g. int) and must be compatible (char is not compatible with byte even though size of char is 2 bytes while byt is one).
// Narrowing (downcasting) means opposite of widening.

import java.lang.*;
import java.util.Scanner;

class Video_041_WideningAndNarrowing
{
    public static void main(String args[])
    {
        // Note: Destination is one LHS while source is on RHS - Remember this to avoid confusion as a beginner.
        byte b = 10;        // byte takes one byte
        short s = 10;       //short takes two bytes
        int i = 10;         // int takes four bytes
        long l = 10;        
        float f = 12.5f;
        double d = 10;
        char c = 10;
        boolean bl = true;

        // Check BYTE data type
        // b = s;           // This will not work because byte is smaller than short. Narrowing can help us do this.
        b = (byte) s;       // This is called typecasting or narrowing. CAVEAT: There will be loss of data so be sure that the value is smaller enough to fit in byte
        s = b;              // will one byte accommodate in two bytes (short)? Yes - this is called widening.
        i = b;
        l = b;
        f = b;
        d = b;
        // c = b;           // byte is one byte while char is two bytes but still char will not take byte because they are not compatible.
        // bl = b;          // byte cannot be converted to boolean. Actually, nothing can be converted to boolean.
        
        // s = i;           // This will not work because short is smaller than int
        i = b;              // This will also accomodate because int is bigger than byte.
        i = s;              // THis will also accomodate because int is bigger than short.
        l = s;
        l = i;
        
        // i = f;           // This will not work because float is bigger than int.

        // LOSS OF DATA in Narrowing. Let's see - first take a smaller value which will fit in byte and then take larger value which will not fit.

        b = 5;
        s = 10;
        b = (byte) s;
        System.out.println("Byte vale is "+b+". This narrowing (downcasting) is safe because we knew that short value is small enough to fit in byte b.");

        b = 5;
        s = 1000;
        b = (byte) s;
        System.out.println("\nByte vale is "+b+". This value is not correct as value changed from the original value of s - this issue is know as Possible Lossy Conversion.");   

        // i = f; Not allowed because int is smaller than float
        f = i;
        
        // f = d; Not allowed because float is smaller than double
        f = (float) d;  // This called downcasting or narrowing. There is possibility of loss of data
        d = f;

        // char only accepts char and int data types

        // boolean does not accept any data type except boolean.


    }
}