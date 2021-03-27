package demo11;
import java.util.ArrayList;
import java.util.Collections;

class Employee {
  int id;
	String name;
	Status status;
	enum Status{
		CONFIRMED,PENDING,ALLOWED,DENIED,FAILED
	}		
public Employee(int id, String name, Status status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
}
class Company{
	public static void main(String[] args) {
    ArrayList  <Employee> al = new ArrayList <Employee>();
	Employee e1 = new Employee(101,"hema",Employee.Status.DENIED);
	Employee e2 = new Employee(105,"nivi",Employee.Status.CONFIRMED);
	Employee e3 = new Employee(104,"sweetha",Employee.Status.PENDING);
	Employee e4 = new Employee(103,"pavi",Employee.Status.FAILED);
	Employee e5 = new Employee(102,"ragavi",Employee.Status.ALLOWED);
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
	Collections.sort(al,new NameComparator());
	Collections.sort(al,new IdComparator());
	for(Employee e : al) {
		System.out.println("Employee id: "+e.id+"  "+"Emloyee Name: " +e.name+"  "+"Status: " +e.status);
	}
	}
}