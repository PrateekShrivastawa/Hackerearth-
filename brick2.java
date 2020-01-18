// brick game solution
package com.company;
import java.util.*;
public class brickgame {
public static void main(String [] args)
{
    int b=0,d=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();
    int c=a;
    for(int i=1;i<=a;i++)
    {
        b=b+i;
        d=d+i*2;
        c=c-i-i*2;
        if(b+d<a && c<i)
        {
            System.out.println("Patlu");
            System.exit(0);
        }
    }
    System.out.println("motu");
}
}
