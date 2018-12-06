package boolean_expressions;

public class Calculator {
	
	public static String getResult(String n1, String n2, String op) {
		
		double num1 = Double.valueOf(n1);
		double num2 = Double.valueOf(n2);
		String operation = op;
		
		boolean isAddition = operation.equals("+");
		boolean isSubtration = operation.equals("-");
		boolean isMultiplication = operation.equals("*");
		boolean isDivision = operation.equals("/");
		boolean isRemainder = operation.equals("%");
		
		if (isAddition) {
			return (num1 + num2) + "";
		}
		else if (isMultiplication) {
			return (num1 * num2) + "";
		}
		else if (isDivision) {
			return (num1 / num2) + "";
		}
		else if (isRemainder) {
			return (num1 % num2) + "";
		}
		else if (isSubtration) {
			return (num1 - num2) + "";
		}
		else {
			return "";
		}
	}

}
