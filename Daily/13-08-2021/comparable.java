package compar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class comparable {
	public static void main(String[] args){
	List<Employee> empLst = new ArrayList();
    empLst.add(new Employee(1, "java"));
    empLst.add(new Employee(5, "dotnet"));
    empLst.add(new Employee(3, "android"));
    empLst.add(new Employee(2, "python"));
    empLst.add(new Employee(4, "c"));
   System.out.println("before");
   System.out.println(empLst);
    Collections.sort( empLst,new EmployeeNameComparator());
	 System.out.println("after");
	 System.out.println(empLst);
}
}
 class Employee  implements Comparable<Employee> {  

	 

    
	
	private int id;
    private String name;

  public Employee() {
    }
   public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
 public void setId(int id) {
        this.id = id;
    }
public String getName() {
        return name;
    }
public void setName(String name) {
        this.name = name;
    }
    
 public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

 @Override
 public int compareTo(Employee o) {

 if (this.getId() > o.getId()) {
         return 1;
     } else if (this.getId() < o.getId()) {
         return -1;
     } else {
         return 0;
     }
 }
}
