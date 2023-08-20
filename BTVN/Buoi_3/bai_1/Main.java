package bai_1;

import java.util.Scanner;

class Book {

	private String index;
	private String name;
	private String author_name;
	private String publisher;
	private String year;

	public Book() {

	}

	public Book(String index, String name, String author_name, String publisher, String year) {
		super();
		this.index = index;
		this.name = name;
		this.author_name = author_name;
		this.publisher = publisher;
		this.year = year;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void input() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap ma sach: ");
		index = sc.nextLine();

		System.out.print("Nhap ten sach: ");
		name = sc.nextLine();

		System.out.print("Nhap tac gia sach: ");
		author_name = sc.nextLine();

		System.out.print("Nhap NXB sach: ");
		publisher = sc.nextLine();

		System.out.print("Nhap nam SX sach: ");
		year = sc.nextLine();
	}

	public void output() {
		System.out.printf("%-10s%-20s%-15s%-15s%-10s%n", index, name, author_name, publisher, year);
	}

}

public class Main {
	public static void title() {
		System.out.printf("%-10s%-20s%-15s%-15s%-10s%n", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban",
				"Nam xuat ban");
	}

	public static void main(String[] args) {
		Book[] books = new Book[5];
		for (int i = 0; i < books.length; i++) {
			System.out.println("Nhap sach thu " + (i + 1) + ": ");
			books[i] = new Book();
			books[i].input();
		}
		
		title();
		for (Book x : books)
			x.output();
	}
}
