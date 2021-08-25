public class Employees implements Comparable<Employees>{

 

    private int empId;
    private String empNm;

 

    public Employees() {
    }

 

    public Employees(int empId, String empNm) {
        super();
        this.empId = empId;
        this.empNm = empNm;
    }

 

    public int getEmpId() {
        return empId;
    }

 

    public void setEmpId(int empId) {
        this.empId = empId;
    }

 

    public String getEmpNm() {
        return empNm;
    }

 

    public void setEmpNm(String empNm) {
        this.empNm = empNm;
    }

 

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empNm=" + empNm + "]";
    }

 

    @Override
    public int compareTo(Employees o) {

 

        if (this.getEmpId() > o.getEmpId()) {
            return 1;
        } else if (this.getEmpId() < o.getEmpId()) {
            return -1;
        } else {
            return 0;
        }
    }
}