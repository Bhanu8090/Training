import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
public class Test {
public static void main(String[] args)throws Exception {
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("employee.txt")));
	Employee emp = new Employee();
	emp.setId(100);
	emp.setName("java");
	oos.writeObject(emp);
	oos.close();
	System.out.println("completed");
    oos.close();
    System.out.println("completed");
    
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("employee.txt")));
    Employee obj = (Employee) ois.readObject();
    System.out.println(obj.getName()+"--"+obj.getId());
    ois.close();
}
}
class Employee implements Serializable {
	
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
}
