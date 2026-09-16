package src.week03;

public class PrintExample {
    public static void main(String[] args) {
		int price1 = 1000;
		int price2 = 2000;
		String label = "총액 : ";

		System.out.println(label + price1); //1.
		System.out.println(label + price1 + price2); //2.
		System.out.println(price1 + price2 + " 원"); //3.
		System.out.println(label + (price1 + price2)); //4.
		System.out.println("---------" + label + "--------------"); //5.
		System.out.println("price1 : " + price1 + "\nprice2 : " + price1); //6.
	}

}
