//File name is StudentInfoListing
//Written by Garrison Konschak
//Written on 4/19/2022
package studentinfolisting;
public class StudentInfoListing
{
    private String name;
    private String address;
    private String number;
    public StudentInfoListing(String n, String add, String num)
    {
        name = n;
        address = add;
        number = num;
    }
    public String toString()
    {
        return("Student's name is " + name + "\nStudent's address is " + address + "\nStudent's number is " + number + "\n");
    }
    public StudentInfoListing copy()
    {
        StudentInfoListing clone = new StudentInfoListing(name, address, number);
        return clone;
    }
    public int compareTo(String key)
    {
        return(name.compareTo(key));
    }
    public void setAddress(String add)
    {
        address = add;
    }
}