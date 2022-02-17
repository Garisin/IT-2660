//File name is StudentListings
//Written by Garrison Konschak
//Written on 2/16/2022
package studentlistings;
import javax.swing.JOptionPane;

public class StudentListings
{
  
   private String name;
   private int ID;
   private double gpa;

   public StudentListings()
   {
       name = "name";
       ID = 1212;
       gpa = 3.14;
   }

   public String toString()
   {
        return("Name is " + name +"\nID is " + ID +"\nGPA is " + gpa+ "\n");
   }

   public StudentListings copy( )
   {
      StudentListings clone = new StudentListings();
      return clone;
   }

   public int compareTo(String targetKey)
   {
       return(name.compareTo(targetKey));
   }

   public void input()
   {
        name = JOptionPane.showInputDialog("Enter the name");
        ID = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID"));
        gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter the GPA"));
   }

    public static void main(String[] args)
    {
      StudentListings classlist= new StudentListings();
      classlist.input();
      System.out.println(classlist.toString());
      int flag = classlist.compareTo("Gru");
      classlist.copy();
      if(flag == 0)
      {
          System.out.println("Gru is there in the list");
      }
      else
          System.out.println("Gru is not there in the list");
    }
}