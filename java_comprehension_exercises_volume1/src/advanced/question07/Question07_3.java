package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];
		int[] buy = new int[5];

		// TODO: 実装ここから
		int[] stocks = new int[5];
		int items = itemNames.length;

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		int item = 0;
		while (item < items) {
			System.out.print("%sの在庫数 : >".formatted(itemNames[item]));
			amounts[item] = Integer.parseInt(reader.readLine());
			item++;
		}

		item = 0;
		while (item < items) {
			System.out.print("%sの購入数 : >".formatted(itemNames[item]));

			int temp = Integer.parseInt(reader.readLine());

			if (temp <= amounts[item]) {
				buy[item] = temp;
				item++;
			} else {
				System.err.println("在庫を超えています。もう一度入力してください。");
			}

		}

	}
}
