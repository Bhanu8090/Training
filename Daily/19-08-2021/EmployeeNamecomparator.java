import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeNamecomparator {
	public static void main(String[] args) throws Exception{
		Employee emp1 = new Employee(1, "a");
        Employee emp2 = new Employee(3, "c");
        Employee emp3 = new Employee(5, "e");
        Employee emp4 = new Employee(4, "d");
        Employee emp5 = new Employee(2, "f");

        List<Employee> empList = new ArrayList();

        empList.add(emp1);
        empList.add(emp3);
        empList.add(emp2);
        empList.add(emp5);
        empList.add(emp4);

        Collections.sort(empList,Collections.reverseOrder());
        System.out.println(empList);
	}
}
