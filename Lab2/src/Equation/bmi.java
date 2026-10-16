package Equation;

public class bmi {

	public static void main(String[] args) {
		double weightKg = 44.5;
        double heightM = 1.52;

        double bmi = weightKg / (heightM * heightM);
        System.out.println("BMI is: " + bmi);

	}

}
