import java.util.ArrayList;
import java.util.List;

public class Arr {
public static void main(String[] args) {
	List<Integer> lstInt = new ArrayList<>();
	lstInt.add(2);
	lstInt.add(3);
	lstInt.remove(index: 2);
	lstInt.add(1);
	lstInt.add(4);
	lstInt.add(5);
	System.out.println(lstInt);
}
}
