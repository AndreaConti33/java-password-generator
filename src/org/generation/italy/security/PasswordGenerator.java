package org.generation.italy.security;


public class PasswordGenerator {

	public static void main(String[] args) {
		
		//Dichiarazioni ed essegnamento
		
		String name = "Andrea";
		String lastName = "Conti";
		String color = "Azzurro";
		int day = 28;
		int month = 07;
		int year = 1997;
		
		System.out.print("Type your first name: ");
		// Esecuzione e stampa
		
		int somma = (day + month + year);
		String password = (name + "-" + lastName + "-" + color + "-" + somma);
		System.out.println(password);
		
	}

}
