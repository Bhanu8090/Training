
public class Pro2 {
public static void main(String[] args) {
	System.out.println("start");
	try{
		throw new RuntimeException("runtime");
	}
	catch(Exception ex){
		System.out.println("exception");
	}
	finally{
		System.out.println("finaly");
	}
	System.out.println("end");
}
}
