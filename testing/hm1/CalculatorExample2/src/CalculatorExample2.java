
public class CalculatorExample2 {
	public int add(int a, int b) {
		return a + b;
	    }


	    public int subtract(int a, int b) {
		return a - b;
	    }


	    public int multiply(int a, int b) {
		return a * b;
	    }

	    public int divide(int a, int b) {
		return a / b;
	    }


	    public int summation(int start) {
		int retVal = 0;
		while (start >= 1) {
		    retVal += start;
		    start--;
		}
		return retVal;
	    }


	    public boolean isPostive(int number) {
		return number >= 0;
	    }


	    public int compare(int a, int b) {
		int retVal = 0;
		if (a > b) {
		    retVal = 1;
		} else if (a < b){
		    retVal = -1;
		}

		return retVal;

	    }


}
