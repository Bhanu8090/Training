import java.util.Scanner;
import java.util.Arrays;
public class Prgms2 {
	public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      int count=0;
	      System.out.println("Enter the size of an array  to be created: ");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<size; i++){
	         myArray[i] = sc.nextInt();
	      }
	      System.out.println("Enter the number: ");
	      int num = sc.nextInt();
	      System.out.println("Array created is: "+Arrays.toString(myArray));
	      System.out.println("indices of the elements whose sum is: "+num);
	      for(int i=0; i<myArray.length; i++){
	         for (int j=i+1; j<myArray.length; j++){
	            if((myArray[i]+myArray[j])== num){
	                count++;
	               System.out.println(myArray[i]+","+myArray[j]);
	               System.out.println(myArray[j]+","+myArray[i]);
	            }
	            }

	            }
	            if(count==0){
	                    System.out.println("cannot get value of given sum");
	                }
	            }
}
