package td8;

public class LanceDes {

	public static void main(String[] args) {
		double d = Math.random();// create random number from 0-1
		int a = (int) (Math.random() * 6) + 1;// cause the dice face has 1-6, so i add 1,make double b int因为骰子的点数是[1,6]，
		int b = (int) (Math.random() * 6) + 1;//因为骰子的点数是[1,6]，所以要加1，将double类型的数据强制转换为int类型数据。
		int c = (int) (Math.random() * 6) + 1;
		int count = a + b + c;
		if (count > 15) {
			System.out.println("good");
		}
		if (count >= 10 && count >= 15) {
			System.out.println("normal");
		}
		if (count <= 10) {
			System.out.println("oh no");
		}
		System.out.println("got " + count + " point");
	}

}
