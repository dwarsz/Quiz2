package Quiz2;

public class CarPayment {

	private double TotalPrice;
	private double DownPay;
	private int length;
	private double rate;
	public double getTotalPrice() {
		return TotalPrice;
	}
	
	public CarPayment(double tot, double down,int len, double rate) {
		this.TotalPrice = tot;
		this.DownPay = down;
		this.length = len;
		this.rate = rate;
	}
	
	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}
	public double getDownPay() {
		return DownPay;
	}
	public void setDownPay(double downPay) {
		DownPay = downPay;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double monthlyPayment() {
		double principal = TotalPrice - DownPay;
		double monthRate = rate/1200;
		double r = Math.pow(monthRate + 1, length);
		double monthPay = principal * ((monthRate * r)/ (r-1));
		return monthPay;
	}
	
	public double totalInt() {
		double monthly = monthlyPayment();
		double principal = TotalPrice - DownPay;
		double total= length * monthly;
		double totalInt = total - principal;
		return totalInt;}
	}

