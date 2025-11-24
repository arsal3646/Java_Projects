// Challenge: emaild id is given and check if it is on gmail or not

// Segregate username (before @) and domain name (after @)

// Given email id is    programmer@gmail.com

import java.lang.*;
import java.util.Scanner;


class Video_055_String_Methods
{
    public static void main (String args[])
    {
        System.out.println("Please enter email ID: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int at_The_Rate_Of = str.indexOf("@");
        int dot = str.indexOf(".");
        String userName = str.substring(0,at_The_Rate_Of);
        String domainName = str.substring(at_The_Rate_Of+1);
        String domainBrand = str.substring(at_The_Rate_Of+1,dot);

        System.out.println("Username is: "+userName);
        System.out.println("Domain name is: "+domainName);
        System.out.println("Domain brand is: "+domainBrand);
     }
}