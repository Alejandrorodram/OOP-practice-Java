package employeeUML.clients;

import employeeUML.dao.EmployeeDAO;
import employeeUML.reporting.EmployeeReportFormatter;
import employeeUML.reporting.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		Employee peggy = new Employee(1, "peggy", "accounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.XML);
	}
	
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);
	}
	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee, FormatType format) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, format);
		System.out.println(formatter.getFormattedEmployee());
	}



}
