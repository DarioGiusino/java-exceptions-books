package org.lessons.exceptions;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int index = 0;

		System.out.println("Benvenuto, quanti libri vuoi creare?");
		int number = sc.nextInt();

		Book[] books = new Book[number];

		while(index < number) {
			System.out.println("------------Nuovo Libro----------------");
			System.out.print("Inserisci il titolo del libro: ");
			String title = sc.nextLine();

			sc.nextLine();

			System.out.print("Inserisci il numero di pagine che contiene: ");
			int pages = sc.nextInt();

			System.out.print("Inserisci l'autore del libro: ");
			String author = sc.nextLine();

			sc.nextLine();

			System.out.print("Inserisci l'editore del libro: ");
			String editor = sc.nextLine();

			try {
				System.out.println("---------------------------------------\n");
				Book newBook = new Book(title, pages, author, editor);
				books[index++] = newBook;
			} catch (Exception e) {
				System.out.println("An error occured: " + e.getMessage() +"\nRitenta con un nuovo inserimeto...\n");
				continue;
			}
		}
		sc.close();
	}
}
