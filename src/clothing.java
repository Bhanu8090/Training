import java.util.Scanner;
public class clothing {
public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	char  choice;
	System.out.println("Hi There, Welcome to Clothing Store");
	System.out.println("please select clothing for M/W:");
	try{
		switch (choice = (char)System.in.read()){
		case 'M':
		case 'm': System.out.println("****Displaying Men Clothing*****");
		          System.out.println("*	1 Jeans 		*");
		          System.out.println("*	2 Shoes 		*");
		          System.out.println("*	3 Shirts		*");
		          System.out.println("*Please choose clothing type:  	* ");
		          System.out.println("********************************");
		         break;
		case 'W':
		case 'w':System.out.println("****Displaying Women Clothing*****");
          System.out.println("*	1 Jeans 		*");
          System.out.println("*	2 Shoes 		*");
          System.out.println("*	3 Shirts		*");
          System.out.println("*Please choose clothing type:  	* ");
          System.out.println("********************************"); 
         break;
		         default: System.out.println("Inavlid input");

		}
	}
	catch (Exception e){
		System.out.println("I/O Error");
	}
	int i;
	i = userInput.nextInt();
	if (i == 1){
		System.out.println("----------------------------------");
		System.out.println("products      quantity      Amount");
		System.out.println("----------------------------------");
		System.out.println("  A              1          100.00");
		System.out.println("  B              2          200.00");
		System.out.println("  C              3          300.00");
		System.out.println("----------------------------------");
		System.out.println("select product :");
	}else if (i== 2){
		System.out.println("----------------------------------");
		System.out.println("products      quantity      Amount");
		System.out.println("----------------------------------");
		System.out.println("  A              1          100.00");
		System.out.println("  B              2          200.00");
		System.out.println("  C              3          300.00");
		System.out.println("----------------------------------");
		System.out.println("select product :");
	}else if (i == 3){
		System.out.println("----------------------------------");
		System.out.println("products      quantity      Amount");
		System.out.println("----------------------------------");
		System.out.println("  A              1          100.00");
		System.out.println("  B              2          200.00");
		System.out.println("  C              3          300.00");
		System.out.println("----------------------------------");
		System.out.println("select product :");
		
	}else  {
		System.out.println(" Invalid Input");
	}
	int D;
	D = userInput.nextInt();
	if (D == 1){
		System.out.println("Invoice generated :");
		System.out.println("-----------------------------------");
		System.out.println("products    quantity     Bill ");
		System.out.println("-----------------------------------");
		System.out.println("   A            1        100.00 ");  
		System.out.println("-----------------------------------");
		System.out.println("Total : 100.0");
	}
	else if (D == 2){
		System.out.println("Invoice generated :");
		System.out.println("-----------------------------------");
		System.out.println("products    quantity     Bill ");
		System.out.println("-----------------------------------");
		System.out.println("   B            2        200.00 ");  
		System.out.println("-----------------------------------");
		System.out.println("Total : 200.0");
	}
	else if (D == 3){
		System.out.println("Invoice generated :");
		System.out.println("-----------------------------------");
		System.out.println("products    quantity     Bill ");
		System.out.println("-----------------------------------");
		System.out.println("   C            3        300.00 ");  
		System.out.println("-----------------------------------");
		System.out.println("Total : 300.0");
	}
	else{
		System.out.println(" Invalid Input");
	}
}
}
