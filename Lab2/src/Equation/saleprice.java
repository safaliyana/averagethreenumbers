package Equation;

public class saleprice {

	public static void main(String[] args) {
		double originalPrice = 2000.0;
        double discountPercentage = 20.0; // e.g., 20%

        double salePrice = originalPrice - (originalPrice * (discountPercentage / 100.0));
        System.out.println("The sale price is: " + salePrice);

	}

}
