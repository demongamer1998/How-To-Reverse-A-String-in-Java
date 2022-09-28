/*****
#Programmed By: 
#Name: Denmark Warrene Alulod
#Project: ReverseAstring
******/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    String str;
    System.out.print("String: ");
    str=s.nextLine();
    ReverseAstring(str);
	}
	
	private static void  ReverseAstring(String n) {
	    String names = n;
	    String newName="";
	    char a;
	        for (int i =0;i<names.length() ; i++ ) {
        a=names.charAt(i);
        newName=a+newName;
    }
    System.out.print("\nReversed Printed String --> [ ' "+newName+" ' ]");
	}
}
