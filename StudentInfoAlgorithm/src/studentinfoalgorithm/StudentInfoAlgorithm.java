//File name is StudentInfoAlgorithm
//File written by Garrison Konschak
//File written on 3/2/2022
package studentinfoalgorithm;
import java.io.*;
class Student
{
    int rollNum;
    String name;
    int subjectAmount;
    int mark[];
    Student(int roll, String studentName, int numberOfSubjects)throws IOException
        {
            rollNum = roll;
            name = studentName;
            subjectAmount = numberOfSubjects;
            getMarks(numberOfSubjects);
        }
    public void getMarks(int nosub) throws IOException
        {
            mark = new int[nosub];
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            for (int i = 0; i < nosub; i++)
                {
                    System.out.println("Enter: " + i + " Subject Marks: ");
                    mark[i] = Integer.parseInt(br.readLine());
                    System.out.println(" ");
                }
        }
    public void calculateMarks()
        {
            double percentage = 0;
            String grade;
            int tmarks = 0;
            for (int i = 0; i < mark.length; i++)
                {
                    tmarks += mark[i];
                }
            percentage = tmarks / subjectAmount;
            System.out.println("Roll Number: " + rollNum);
            System.out.println("Name Of Student is : " + name);
            System.out.println("Number Of Subject : " + subjectAmount);
            System.out.println("Percentage Is: "+ percentage);
            if (percentage >= 70)
                System.out.println("Grade Is First Class With Distinction");
                else if(percentage >= 60 && percentage < 70)
                    System.out.println("Grade Is First Class");
                else if(percentage >= 50 && percentage < 60)
                    System.out.println("Grade Is Second Class");
                else if(percentage >= 40 && percentage < 50)
                    System.out.println("Grade Is Pass Class");
                else
                    System.out.println("You Are Fail");
        }
    public subjectAmount append(subjectAmount node)
{
    subjectAmount lastNode = getNodeAtPosition(getSubjectAmountSize() - 1);
    lastNode.setNextNode(node);
    return this;
}
    public getSubjectAmountSize()
    {
        return subjectAmount;
    }
}
class StudentInfoDisplay
    {
        public static void main(String args[])throws IOException
            {
                int rollNumber, num, amountOfStudents;
                String name;
                BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter How many Students: ");
                amountOfStudents = Integer.parseInt(br.readLine());
                Student s[] = new Student[amountOfStudents];
                for(int i = 0; i < amountOfStudents; i++)
                    {
                        System.out.println("Enter Roll Number: ");
                        rollNumber = Integer.parseInt(br.readLine());
                        System.out.println("Enter Name: ");
                        name = br.readLine();
                        System.out.println("Enter No of Subject: ");
                        num = Integer.parseInt(br.readLine());
                        s[i] = new Student(rollNumber, name, num);
                    }
                for(int i = 0; i < amountOfStudents; i++)
                    {
                        s[i].calculateMarks();
                    }
            }
    }

