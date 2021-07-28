/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Scanner;
/**
 *
 * @author sathaiah balaji
 */
public class q1
{
    
 public static void main(String[] args) {
        // TODO code application logic here
        college c[]=new college[10];
        
        for(int i=0;i<10;i++)
        {
        c[i]=new college(); 
        c[i].getcollegedetails();
        c[i].show();
        }
    }
    
}
class student
{
    String stdname;
    Scanner obj=new Scanner(System.in);
    public void getstddetails()
    {
        System.out.println("Enter student name");
       stdname =obj.next(); 
    }
    public void show()
    {
     System.out.println("Student name:"+stdname);
    }
}
class department extends student
{
    String deptname;
    Scanner j=new Scanner(System.in);
    public void getdeptdetails()
    {
        super.getstddetails();
        System.out.println("Enter dept name");
        deptname =j.next();
        
    }
    @Override
    public void show()
    {
        super.show();
        System.out.println("department name:"+deptname);
    }
}
class college extends department
{
    String clgname;
    Scanner b=new Scanner(System.in);
    public void getcollegedetails()
    {
        super.getdeptdetails();
        System.out.println("Enter college name");
        clgname=b.next();
    }
    @Override
    public void show()
    {
      super.show();
      System.out.println("college  name:"+clgname);  
    }
}
    

