import java.util.Scanner;
public class IT24104067L3Q2{
public static void main(String[]args){
Scanner pf=new Scanner(System.in);

System.out.print("monthly salary : ");

int salary=pf.nextInt();

System.out.print("number of OT hours : ");

int hours=pf.nextInt();

System.out.print("OT hourly rate : ");

int rate=pf.nextInt();

System.out.println(" ");

double total=(salary+hours*rate);

System.out.print("total salary : "+total);

}}