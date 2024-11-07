import java.util.Scanner;
public class IT24104067L3Q1A{
public static void main (String[]args){

Scanner pf= new Scanner(System.in);
System.out.print("ENTER price of 1kg : ");
int price=pf.nextInt();
System.out.print("ENTER number of kg : ");
int number=pf.nextInt();
System.out.println();
int total=number*price;

System.out.print("Total amount : "+ total);
}}