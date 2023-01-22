 import java.util.*;

public class  Employee_salary_calculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean Done=false;
        int Employee_Number,Days_Worked;
        String Employee_Status, Department,Employee_Name;
        double Daily_Rate,Gross_Pay,Less_Tax,SSS, CA,Net_Pay;
        while(!Done){
            System.out.println("==========================");
            System.out.println("Employee Name:");
            Employee_Name=sc.nextLine();
            System.out.println("Employee Number:");
            Employee_Number=sc.nextInt();
            sc.nextLine();
            System.out.println("Employee Status:");
            Employee_Status=sc.nextLine();
            System.out.println("Department:");
            Department=sc.nextLine();
            System.out.println("");
            System.out.println("Days Worked:");
            Days_Worked=sc.nextInt();
            System.out.println("Daily Rate:");
            Daily_Rate=sc.nextInt();
            System.out.println("");
            System.out.println("Less Tax:");
            Less_Tax=sc.nextInt();
            System.out.println("SSS:");
            SSS=sc.nextInt();
            System.out.println("CA:");
            CA=sc.nextInt();
            System.out.println("==========================");
            System.out.println("Employee Name: "+Employee_Name);
            System.out.println("Employee Number: "+Employee_Number);
            System.out.println("Employee Status: "+Employee_Status);
            System.out.println("Department: "+Department)+ "\n\n";
            System.out.println("Days Worked: "+Days_Worked);     
            System.out.println("Daily Rate: "+Daily_Rate);
            Gross_Pay=Days_Worked*Daily_Rate;
            System.out.println("Gross Pay: "+Gross_Pay+ "\n\n");
            System.out.println("Less Tax: "+Less_Tax);
            System.out.println("SSS: "+SSS);
            System.out.println("CA: "+CA);
            Net_Pay= Gross_Pay-(Less_Tax+SSS+CA);
            System.out.println("Net Pay: "+Net_Pay);
            Employee_Name=sc.nextLine();
        }
    }
}
