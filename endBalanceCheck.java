public class endBalanceCheck{
	
	private static double endBalance(double loan, double rate, int n, double payment) {
		
		double endResult = 0.0;
		double temp = 0.0;
		double currentCalc = 0.0;

		temp = (loan-payment) * (1+rate/100);

		for (int i = 1; i < n ; i++) {
			currentCalc = (temp-payment) *(1+rate/100);
			temp = currentCalc;

		}
		
		if (n ==1) {
			return temp;
			
		}
		else{
			return currentCalc;
		}


		




}








	public static void main(String[] args) {

	int y = Integer.parseInt(args[0]);

	double x = endBalance (100000.0, 5.0, y, 10000);
	System.out.print(x);















	}

















}