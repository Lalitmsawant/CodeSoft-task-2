
package student_grade_cal;

import java.util.*;


public class Student_Grade_Cal {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int marathi,hindi,eng,phy,chem,bio,math,total;
        float avar;
        String grade;
        System.out.println("\t*****Find The Grade of The STUDENT*****");
        System.out.println("Enter the Marks of MARATHI:");
        marathi=s.nextInt();
        System.out.println("Enter the Marks of HINDI :");
        hindi=s.nextInt();
        System.out.println("Enter the Marks of ENGLISH : ");
        eng=s.nextInt();
        System.out.println("Enter the Marks of PHYSICS : ");
        phy=s.nextInt();
        System.out.println("Enter the Marks of CHEMISTRY : ");
        chem=s.nextInt();
        System.out.println("Enter the Marks of MATHMATICS: ");
        math=s.nextInt();
        System.out.println("Enter the Marks of BIOLOGY : ");
        bio=s.nextInt();
        
        if(marathi > 100 || hindi > 100 || eng > 100 || phy > 100 || chem > 100 || bio > 100 || math > 100 || marathi < 0 || hindi < 0 || eng < 0 || phy < 0 || chem < 0 || bio < 0 || math < 0 )
        {
            System.out.println("PLEASE Enter the Valid Number!!..");
        }
        else{
            total=marathi + hindi + eng + phy + chem + bio + math;
            avar=total/7;
            if(avar>=80){
                grade="A";
            }
            else if(avar>=70)
            {
                grade="B";
            }
            else if(avar>=60){
                grade="C";
            }
            else if(avar>=50){
                grade="D";
            }
            else if(avar>=40){
                grade="F";
            }
            else
                grade="FAIL!!..";
            
            System.out.println("Total obtain Marks of Student : "+total);
            System.out.println("Average Percentage of Marks is : "+avar);
            System.out.println("Obtain Grade : "+grade);
        }
    }
    
}
