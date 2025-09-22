// 소수 구하기

package section14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNum {
	private List<Integer> list;

	public List<Integer> search(int number) {
		list = new ArrayList<>();

		if (number < 2) {
			return list;
		}

		boolean[] isPrime = new boolean[number + 1];
		for (int i = 2; i <= number; i++) {
			isPrime[i] = true;
		}

		for (int p = 2; p * p <= number; p++) {
			if (isPrime[p] == true) {
				for (int i = p * p; i <= number; i += p) {
					isPrime[i] = false;
				}
			}
		}

		for (int i = 2; i <= number; i++) {
			if (isPrime[i] == true) {
				list.add(i);
			}
		}

		return list;
	}
	
	public long sumPrimeNum(int number) {		
		List<Integer> primeList = search(number);
		
		long sum = 0;
		
		for (int prime : primeList) {
			sum += prime;
		}
		
		return sum;
	}
	
	public List<Long> cubePrimeNum(int number) {		
		List<Long> cubedPrimes = new ArrayList<>();
		List<Integer> searchNums = search(number);
		
		for (int prime : searchNums) {
			long cubedValue = (long) prime*prime*prime;
			cubedPrimes.add(cubedValue);
		}
		
		return cubedPrimes;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("소수를 찾을 숫자를 입력하세요 : ");

		int num = sc.nextInt();

		PrimeNum primeFinder = new PrimeNum();
		List<Integer> primeList = primeFinder.search(num);

		System.out.println(num + " 이하의 소수: ");
		System.out.println(primeList);
		
		long primeSum = primeFinder.sumPrimeNum(num);
		System.out.println(num + " 이하의 소수들의 합계: " + primeSum);
		
		List<Long> cubedPrimes = primeFinder.cubePrimeNum(num);
		System.out.println(num + "이하의 소수의 3제곱 : ");
		System.out.println(cubedPrimes);		
		
		sc.close();
	}

}
