import java.util.ArrayList;
import java.util.Comparator;

class Student {
	
	private int rollNo;
	private String name;
	private String address;
	
	public Student(String name, int rollNo, String address) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Name:" +name+
				",Roll number:" +rollNo+
				",Address:" +address;
	}
	
}