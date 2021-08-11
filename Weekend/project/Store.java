package project;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import project.Bill;
import billing.*;
import java.util.*;
import java.util.Map.Entry;
public class Store {
	public
	Scanner sc = new Scanner(System.in);
	Map<String,String> map = new HashMap<>();
	Map<String,String> map_1 = new HashMap<>();

	
void login()
{
	
	System.out.print("Enter UserName : ");
	String use = sc.nextLine();
	System.out.print("Enter Password: ");
	String pass = sc.nextLine();
	if(map.size()==0) {
		System.out.println(" User Not Present :");
	}
	else
	{  
		if(map.containsKey(use))
		{
			String check = map.get(use);
			if(pass.equals(check))
			{
				System.out.println("        Login Successfully        ");
				Userlogin();
			}
			else
				System.err.println("   Invalid Password Or Username   ");

		}
	}
}
private void Userlogin() {
	// TODO Auto-generated method stub
	
}
void register() {
	
    	System.out.println("       Enter user name:     ");
	String str_1=sc.nextLine();
	if(map.containsKey(str_1))
	{
		System.out.println("User Already Exist:");
	
	}
	else
	{
		System.out.println("         Enter password      ");
		String str2=sc.nextLine();
	  System.out.println("          Enter role:         ");
		System.out.println("admin");
		System.out.println("user");
		System.out.println("manager");
		 
		String str3=sc.nextLine();
		map.put(str_1,str2);
		map_1.put(str_1,str3);
		System.out.println("       User Register Successfully       ");
		System.out.println("          User size :"+map.size()        );
	}
}

   public static void main(String[] args) {
		String productTypes[] = { "Jeans", "shoes", "shirts" };
		String products[] = { "A", "B", "C" };
		float amount[] = { 100, 200, 300 };
		int quantity[] = { 1, 2, 3 };

		System.out.println("Hi There, Welcome to Clothing Store");
		System.out.println("please select clothing for M/W: ");
		Scanner sc = new Scanner(System.in);
		switch (sc.next().toLowerCase()) {
		case "m":
			System.out.println("**Displaying Men Clothing*");
			break;
		case "w":
			System.out.println("**Displaying Women Clothing*");
			break;
		default:
			System.err.println("Invalid input");
			System.exit(1);
			break;
		}
		for (int i = 0; i < productTypes.length; i++) {
			System.out.printf("%1$s %2$10s %3$s %4$" + (22 - productTypes[i].length()) + "s%n", "*", i + 1,
					productTypes[i], "*");
		}
		System.out.printf("%1$s %2$5s %3$4s%n", "", "Please choose clothing type: ", "");
		System.out.println("****");
		switch (sc.next()) {
		case "1":
		case "2":
		case "3":
			System.out.println("----------------------------");
			System.out.println("products  quantity  Amount ");
			System.out.println("----------------------------");
			for (int i = 0; i < products.length; i++) {
				System.out.printf("%1$4s %2$10s %3$10.2f%n", products[i], quantity[i], amount[i]);
			}
			System.out.println("----------------------------");
			System.out.println("select product:");
			String product = sc.next();
			System.out.println("select quantity:");
			int quant = sc.nextInt();
			int index = 0;
			switch (product.toLowerCase()) {
			case "a":
				index = 0;
				break;
			case "b":
				index = 1;
				break;
			case "c":
				index = 2;
				break;
			default:
				System.err.println("Invalid product");
				System.exit(3);
				break;
			}
			int originalQuant = quantity[index];
			if (quant > originalQuant) {
				System.err.println("qunatity is not valid");
				System.exit(3);
			} else {
				System.out.println("*Invoice generated**");
				System.out.println("----------------------------");
				System.out.println("products  quantity  Bill ");
				System.out.println("----------------------------");
				Bill bill = new Bill();
				float originalBill = bill.calculateBill(quant, amount[index]);
				int gst = 0;
				if (originalBill > 100 && originalBill <= 200) {
					gst = 10;
				} else if (originalBill > 200 && originalBill <= 500) {
					gst = 20;
				} else if (originalBill > 500) {
					gst = 30;
				}
				float finalBill = bill.calculateBill(quant, amount[index], gst);
				System.out.printf("%1$4s %2$10s %3$10.2f%n", products[index], quant, originalBill);
				System.out.println("----------------------------");
				System.out.println("Total: " + finalBill + " (" + originalBill + "Rs + " + gst + "% GST i.e. "
						+ bill.calculateGst(originalBill, gst)+"Rs)");
				
				 System.out.println("Do you want to print invoice:(y/n) ");
				 
				
					switch (sc.next().toLowerCase()) {
					case "y":
						try {
							 FileWriter filewriter = new FileWriter("Invoice.txt");   
							 filewriter.write("*Invoice generated**");
							 filewriter.write("\n----------------------------");
							 filewriter.write("\nproducts  quantity  Bill ");
							 filewriter.write("\n----------------------------\n"); 
							 String str =  "   "+ products[index]+"      " +  quant +"       "  + originalBill ;
							 filewriter.write(str);
							 filewriter.write("\n");
							String st = "Total: "+ finalBill + "(" + originalBill + "Rs. + " + gst + "% GST i.e. " + bill.calculateGst(originalBill,  gst) + ")" ;
							filewriter.write(st);
							filewriter.close();
					 }catch(IOException io){				 		
					}				
						break;
					case "n":
					
						break;
					}
			}
			break;
		default:
			System.exit(2);
			System.err.println("Invalid input");
			break;
		}
		sc.close();
	}
}



