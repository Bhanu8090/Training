public class JavaDemo {
public static void main(String[] args) {
DemoInterface demo = (a, b)-> (a+b);
System.out.println(demo.addition(9, 21));
System.out.println("--------------------------");
DemoInterface demo2 = (a,b)->{
	return(a+b);
};
System.out.println(demo.addition(21, 33));
}
}
