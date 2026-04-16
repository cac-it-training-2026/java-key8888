package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		int[] ageGroup = new int[6];

		ageGroup[0] = 23;
		ageGroup[1] = 33;
		ageGroup[2] = 26;
		ageGroup[3] = 21;
		ageGroup[4] = 25;
		ageGroup[5] = 22;

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("4 番目の人の年齢を入力してください。 ");
		int temporaryAge = Integer.parseInt(reader.readLine());
		ageGroup[3] = temporaryAge;

		System.out.println("4 番目の人の年齢は%d歳です。".formatted(ageGroup[3]));

		System.out.println("人数は%d人です。 ".formatted(ageGroup.length));
	}

}
