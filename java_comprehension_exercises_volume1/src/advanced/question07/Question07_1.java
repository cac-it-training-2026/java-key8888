package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		int itemNums = 5;
		String[] itemNames = new String[itemNums];
		int[] price = new int[itemNums];

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		int item = 0;
		while (item < itemNums) {
			System.out.print("商品 %d を入力してください: > ".formatted(item + 1));
			itemNames[item] = reader.readLine();
			item++;

		}
		System.out.println("各商品の単価を順に入力してください：");
		item = 0;
		while (item < itemNums) {
			System.out.print("%sの単価:　>　".formatted(itemNames[item]));
			price[item] = Integer.parseInt(reader.readLine());
			item++;
		}

		System.out.println("登録商品一覧");
		item = 0;
		while (item < itemNums) {
			System.out.println("%s : %d 円".formatted(itemNames[item], price[item]));
			item++;
		}
	}

}
