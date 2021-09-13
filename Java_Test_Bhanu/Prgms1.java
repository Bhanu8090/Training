import java.util.Scanner;

public class Prgms1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("enter String1");
        String str1=sc.next();
        System.out.println("enter String2");
        String str2=sc.next();
        boolean result=str1.contains(str2);
        if(result){
            System.out.println("true"+ " "+ "(string1 contain string2)");
        }
        else{
            System.out.println("false"+ " "+ "(string1 not contain string2)");
        }
        
    }
}
