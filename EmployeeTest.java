import java.io.*;
class Employee{
	private int eid;
	private String ename;
	private double esalary;
	public Employee(int eid, String ename, double esalary){
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public void showData(){
		System.out.println(eid + " "+ ename+" "+ esalary);
	}

	public void computeTax(){
		if (esalary >= 200000){
				System.out.println("Tax to be paid "+(esalary*0.20));
		}
		else{
				System.out.println("Tax to be paid "+(esalary*0.10));
		}
	}
}

class EmployeeTest{
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter emp id ");
		int eid = Integer.parseInt(br.readLine());

		System.out.println("Enter emp name ");
		String ename = br.readLine();

		System.out.println("Enter emp salary ");
		double esalary = Double.parseDouble(br.readLine());

		Employee e1 = new Employee(eid, ename, esalary);
		e1.showData();
		e1.computeTax();


	}
}