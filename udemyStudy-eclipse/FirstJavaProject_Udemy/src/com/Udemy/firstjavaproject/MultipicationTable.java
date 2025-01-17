package com.Udemy.firstjavaproject;

public class MultipicationTable {
	void print() {
		System.out.println("5단, 디폴트");
		print2(5, 1, 9);
	}

	void print(int table) {
		System.out.printf("%d단", table).println();
		print2(table, 1, 9);
	}

	void print(int table, int from, int to) {
		System.out.printf("%d단. %d부터 %d까지", table, from, to).println();
		print2(table, from, to);
	}
	
	void print2(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}
}