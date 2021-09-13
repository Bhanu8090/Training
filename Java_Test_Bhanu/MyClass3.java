
public class MyClass3 {
public static void main(String[] args) {
	try{
		throw new MyException("msg");
	}catch(MyException e){
		System.out.println("MyException");
	}catch(Exception ex){
		System.out.println("Exception");
	}
}
}
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
