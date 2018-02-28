package Quiz2;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

public class CarPaymentTest {
	/*
	public static void main(String[]args) {
		CarPayment c = new CarPayment(35000, 0, 60, 10);
		System.out.println(c.monthlyPayment());
		System.out.print(c.totalInt());
	} */

	@Test
	void test() {
		DecimalFormat df = new DecimalFormat("0.00");
		CarPayment c = new CarPayment(35000, 0, 60, 10);
		assertEquals(Double.parseDouble(df.format(c.monthlyPayment())), 743.65);
		assertEquals(Double.parseDouble(df.format(c.totalInt())), 9618.79);
	} 
}
