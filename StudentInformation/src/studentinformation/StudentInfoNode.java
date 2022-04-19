/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformation;
public class StudentInfoNode
{

    StudentInfoNode leftChild, rightChild;
    String name;
    int key;
    double gpa;
    public StudentInfoNode(int Key, String Name, double GPA)
    {
        key = Key;
        name = Name;
        gpa = GPA;
    }
        StudentInfoNode root;
        StudentInfoNode checkNode;
        StudentInfoNode parent;

        public void addNode(StudentInfoNode newNode)
        {
            if (root == null)
            {
                root = newNode;
            }
            else
            {
            checkNode = root;
            while (true)
            {
                parent = checkNode;
                if (newNode.key > checkNode.key)
                {
                    checkNode = checkNode.rightChild;
                    if (checkNode == null)
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
                if (newNode.key < checkNode.key)
                {
                    parent = checkNode;
                    checkNode = checkNode.leftChild;
                    if (checkNode == null)
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                } 
                else
                {
                    parent = checkNode;
                    checkNode = checkNode.rightChild;
                    if (checkNode == null)
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }}