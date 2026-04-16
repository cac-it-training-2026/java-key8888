package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };

		// TODO: 実装ここから
		int items = itemNames.length;
		int[] amounts = new int[items];

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		int item = 0;
		while (item < items) {
			System.out.print("%sの購入数: > ".formatted(itemNames[item]));
			amounts[item] = Integer.parseInt(reader.readLine()) * prices[item];

			item++;
		}
		item = 0;
		int sum = 0;
		while (item < items) {
			System.out.println("%s : %d 円".formatted(itemNames[item], amounts[item]));
			sum += amounts[item];
			item++;
		}

		System.out.println("合計金額：%d 円".formatted(sum));

	}
}
