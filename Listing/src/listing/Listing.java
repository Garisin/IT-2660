//File name is Listing
//Written by Garrison Konschak
//Written on 2/3/2022
package listing;

import java.util.Scanner;


public class Listing
{
    public static void main(String[] args)
    {
        
        Listing object1 = new Listing();
        object1.input();
        Listing object2 = new Listing();
        object2.setName("John Doe");
        object2.setAge(21);
        Listing object3 = new Listing("Ajay Klems", 31);
        System.out.println("\nListing 1...");
        System.out.println(object1);
        System.out.println("\nListing 2...");
        System.out.println(object2);
        System.out.println("\nListing 3...");
        System.out.println("Name: " + object3.getName() + ",  Age: " + object3.getAge());
    }
    
    private String name;
    private int age;
    
    public Listing()
    {
        name = " ";
        age = 0;
    }
    
    Listing(String newName, int newAge)
    {
        name = newName;
        age = newAge;
    }
    
    public String toString()
    {
        return "Name: " + name + ",  Age: " + age;
    }
    
    public void input()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = userInput.nextLine();
        System.out.print("Enter the age: ");
        age = userInput.nextInt();
        userInput.nextLine();
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setAge(int newAge)
    {
        age = newAge;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
}


