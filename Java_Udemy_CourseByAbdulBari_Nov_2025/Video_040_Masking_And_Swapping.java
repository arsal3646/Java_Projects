// Challenge No.1: Swapping of two numbers using Bitwise operation

// Challenge No.2: Perform Masking (OR Operation) and Merging (AND Operation)

class Video_040_Masking_And_Swapping
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
    System.out.println("\nUsing Bitwise method - New value of d is: "+d+" while new value of e is: "+e);

    // Challenge No.2: Perform Masking (OR Operation) and Merging (AND Operation)

    byte first = 9, second = 12, third;   // 9 is 1001 and 12 is 1100 (both are four bits only, i.e. nibble, required for both first and second)
    
    // third will merge these two together in one byte
    
    second = (byte) (second << 4);      // this is to move all bits by four places to left side, i.e. 00001100 will become 11000000
    
    third = (byte)(first | second);
    String binary_third = String.format("%8s", Integer.toBinaryString(third & 0xFF)).replace(' ', '0');

    int fourth = third & 0xFF;          // to get decimal value (not useful here)

    
    String binary = String.format("%8s", Integer.toBinaryString(fourth)).replace(' ', '0'); // to show output as binary - I copied this code from chatGPT. Yet to learn how to do this.

    System.out.println("\nThe merged value is now equal to binary number "+binary_third+" and its decimal value is equivalent to "+fourth);

    System.out.println("\nThe value using new method is: "+(third&0b11110000)+". This is wrong value because the value is in first four bits. We need to move it to right four bits to give the correct value.");  /*AND-ing will show which bits are 1 and which are 0. AND-ing will return those as 1 which are 1 already in 'third' */

    System.out.println("\nAfter right-shift, the correct value using new method is: "+((third&0b11110000)>>4)+".");

     System.out.println("\nThe initial value using new method is: "+(third&0b00001111)+"."); // AND-ing with the last four digits

    }
}