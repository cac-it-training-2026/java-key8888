package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {

		// TODO:ここに実装
		int applePrice = 100;
		String stationery = "鉛筆";
		int bananaPrice = applePrice;
		String writingUtensils = stationery;

		System.out.println("リンゴの値段は %d 円です。".formatted(applePrice));
		System.out.println("バナナの値段は %d 円です。".formatted(bananaPrice));
		System.out.println("この筆記用具は%sです。".formatted(writingUtensils));

	}

}
