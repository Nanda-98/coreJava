package ClassObject;

public class Employee {
    //variables
    int eid;
    String ename;
    String job;
    int sal;

    //methods
    void display(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }



    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.eid = 101;
        emp.ename = "kumar";
        emp.job = "Test Engineer";
        emp.sal = 30000;
        emp.display();

    }
}
