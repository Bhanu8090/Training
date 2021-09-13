
public class MyClass2 {
public static void main(String[] args) {
	new TataCar();
}
}
class Car{
	Car(){
		System.out.println("car");
	}
}
class MarutiCar extends Car{
	MarutiCar(){
		System.out.println("maruti");
	}
	
}
class TataCar extends MarutiCar{
	TataCar(){
		System.out.println("tata");
	}
}
