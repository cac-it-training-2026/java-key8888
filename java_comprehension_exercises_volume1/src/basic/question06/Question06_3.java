package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//		鉛筆の個数
		int amount = 0;

		//		 鉛筆の値段
		int price = 100;

		System.out.println("鉛筆を購入しますか? \n"
				+ "はい：0、いいえ：1 > ");

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		int buyFlag = Integer.parseInt(reader.readLine());

		while (buyFlag == 0) {
			amount++;

			System.out.println("鉛筆を購入しますか? \n"
					+ "はい：0、いいえ：1 > ");
			buyFlag = Integer.parseInt(reader.readLine());
		}
		System.out.println("購入した鉛筆の本数は%d本です。".formatted(amount));
		System.out.println("購入した鉛筆の合計金額は%d円です。 ".formatted(amount * price));
	}

}
