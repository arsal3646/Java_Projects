// Challenge No.1: Swapping of two numbers using Bitwise operation

// Challenge No.2: Perform Masking (OR Operation) and Merging (AND Operation)

import java.lang.*;

class Video_40_Masking_And_Swapping
{
    public static void main (String args[])
    {
    
    // Challenge No.1: Swapping of two numbers using Bitwise operation

    int a = 10, b = 15;   // swap these two numbers using normal method, i.e. 'a' should be 15 and 'b' should be 10
    int d= 10, e =15;     // swap these two numbers using bit-wise method, i.e. 'a' should be 15 and 'b' should be 10
    int c = a;
    a = b;
    b = c;

    // Use bitwise operation to swap. This is better because you don't need to get create an additional variable 'c'

    d = d ^ e;  // a XOR b - Just repeat this three times and it will swap the numbers.
    e = d ^ e; 
    d = d ^ e; 
    
    System.out.println("Using normal method - New value of a is: "+a+" while new value of b is: "+b);
    System.out.println("Using Bitwise method - New value of d is: "+d+" while new value of e is: "+e);

    // Challenge No.2: Perform Masking (OR Operation) and Merging (AND Operation)

    byte first = 9, second = 12, third;   // 9 is 1001 and 12 is 1100 (both are four bits only, i.e. nibble, required for both first and second)
    
    // third will merge these two together in one byte
    
    second = (byte) (second << 4);      // this is to move all bits by four places to left side, i.e. 00001100 will become 11000000
    
    third = (byte)(first | second);
    String binary_third = String.format("%8s", Integer.toBinaryString(third & 0xFF)).replace(' ', '0');

    int fourth = third & 0xFF;          // to get decimal value (not useful here)

    String binary = String.format("%8s", Integer.toBinaryString(fourth)).replace(' ', '0'); // to show output as binary - I copied this code from chatGPT. Yet to learn how to do this.
    System.out.println("The merged value is now equal to binary number "+binary_third+" and its decimal value is equivalent to "+fourth);

    }
}