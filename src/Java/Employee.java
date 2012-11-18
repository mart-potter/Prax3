package Java;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private Long id;
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	public Employee() {} // ARGUMENTIDETA KONSTRUKTOR!!!
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee: " + name;
	}
}