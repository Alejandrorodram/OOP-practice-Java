package interfaceSegregationPrinciple;

public class TransactionReportGenerator {
	
	private Reporting transactionObject;

	public void generateReport() {
		System.out.println(transactionObject.getName()+" "+transactionObject.getDate()+" "+transactionObject.productBreakDown());
	}
	
}
