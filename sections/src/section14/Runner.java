package section14;

public class Runner {
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <5);
		
		for (int j = 0; j < 10; j++) {
			if (j == 10) {
				break;
			}
			System.out.println("j :" +j);
		}
	}
}