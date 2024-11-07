import java.util.Scanner;
public class IT24104067L3Q1B{
public static void main(String[]args){
Scanner pf=new Scanner(System.in);

System.out.print("enter the price of 1kg : ");

int price=pf.nextInt();

System.out.print("number of kilograms you want to buy :  ");

int number=pf.nextInt();

double total=(price*number)-((price*number)/100.0)*10.0 ;
System.out.println("  ");
System.out.print("last amount :  "+ total);


}}
