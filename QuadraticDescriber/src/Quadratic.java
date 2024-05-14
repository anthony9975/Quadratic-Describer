/*Anthony Ma
 * 9/25/2023
 * This project gives the features of a quadratic function.
 */
public class Quadratic {
	public static String quadrDescriber (double a, double b, double c) {//this returns the features of a quadratic function like the axis of symmetry, vertex, x-intercept(s), y-intercept, and which direction it opens
		if (a==0) {
			throw new IllegalArgumentException("Not a Quadratic Function");
		}
		String descOfGraph = "\nDescription of the graph of:\ny = "+a+" x^2 + "+b+" x + "+c;
		String opens = "\n\nOpens: Up";
		if (a<0) {
			opens = "\n\nOpens: Down";
		}
		double vertexX = -(b/a)/2;
		String axisSymmetry = "\nAxis of Symmetry: "+Quadratic.round2(vertexX);
		double vertexY = c-Quadratic.square(vertexX)*a;
		String vertex = "\nVertex: ("+Quadratic.round2(vertexX)+","+Quadratic.round2(vertexY)+")";
		String xinter = "\nx-intercepts: "+Quadratic.quadForm(a, b, c);
		String yinter = "\ny-intercepts: "+c;
		return descOfGraph+opens+axisSymmetry+vertex+xinter+yinter;
	}
	
	public static double square(double squaredNum) {//square the number inputed
		return squaredNum*squaredNum;	
	}
	
	public static double discriminant(double a, double b, double c) {//returns the discriminant
		return (b*b)-(4*a*c);
	}
	
	public static double absValue(double num) {//returns the absolute value of the input
		if (num<0) {
			return num*-1.0;
		}else{
			return num;
		}
	}
	
	public static double max (double num1, double num2) {//returns the larger of the 2 inputs
		if (num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static double min (double num1, double num2) {//returns the smaller of the 2 real number inputs
		if (num1<num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static double round2 (double num) {//rounds the input to the hundredth place
		double roundedNum = Quadratic.absValue(num);
		roundedNum += 0.005;
		roundedNum *= 100;
		roundedNum = (int)roundedNum;
		roundedNum = roundedNum/100.0;
		if (num<0) {
			roundedNum*=-1;
		}
		num = roundedNum;
		return num;
	}
	
	public static double sqrt (double num) {//returns the square root of the number inputed
		if (num<0) {
			throw new IllegalArgumentException("Can't square root a negative number");
		}
		double guess = num/2;
		while (Quadratic.absValue(num-guess*guess)>0.000025) {
			guess = 0.5*(num/guess+guess);
		}
		return guess;
	}
	
	public static String quadForm (double a, double b, double c) {//Tells us the number of roots and what they are
		double discriminant = Quadratic.discriminant(a, b, c);
		if (discriminant<0) {
			return "no real roots";
		}
		double root1 = ((b*-1)+Quadratic.sqrt(discriminant))/(a*2);
		double root2 = ((b*-1)-Quadratic.sqrt(discriminant))/(a*2);
		if (root1==root2) {
			return ""+Quadratic.round2(root1);
		}else {
			return Quadratic.round2(Quadratic.min(root1, root2))+" and "+Quadratic.round2(Quadratic.max(root1, root2));
		}
		
	}

}
