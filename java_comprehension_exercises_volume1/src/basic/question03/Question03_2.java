package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		// TODO:ここに実装

		//		通常料金
		int basePrice = 1200;

		int tickets = 3;
		//		最終価額
		int reducedPrice = basePrice - 200;

		int reducedTickets = --tickets;

		int totalPrice = reducedPrice * reducedTickets;

		double taxRate = 1.1;

		int totalWithTax = (int) (totalPrice * taxRate);

		System.out.println("購入可能枚数は%d枚です\n".formatted(reducedTickets)
				+ "値下げ後の 1 枚あたりの料金は%d\n".formatted(reducedPrice)
				+ "合計金額（税抜）は%dです。\n".formatted(totalPrice)
				+ "合計金額（税込）は%dです。 ".formatted(totalWithTax));
	}
}
