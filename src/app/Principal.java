package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		List<Boolean> respostas = new ArrayList<Boolean>();
		
		Scanner scanner = new Scanner(System.in);
		String resposta;
		boolean erro = false;
		
		do {
			System.out.println("Telefonou para a vítima? (S/N)");
			resposta = scanner.next();
			
			erro = !(resposta.toUpperCase().equals("S") || resposta.toUpperCase().equals("N"));
			
			if(!erro) {				
				respostas.add(resposta.toUpperCase().equals("S"));
			}
			else {
				System.out.println("Respota inválida, digite S ou N para responder.");
			}
			
		}while(erro);
		
		
		do {
			System.out.println("Esteve no local do crime? (S/N)");
			resposta = scanner.next();
			
			erro = !(resposta.toUpperCase().equals("S") || resposta.toUpperCase().equals("N"));
			
			if(!erro) {				
				respostas.add(resposta.toUpperCase().equals("S"));
			}
			else {
				System.out.println("Respota inválida, digite S ou N para responder.");
			}
		}while(erro);
		
		do {
			System.out.println("Mora perto da vítima? (S/N)");
			resposta = scanner.next();
			
			erro = !(resposta.toUpperCase().equals("S") || resposta.toUpperCase().equals("N"));
			
			if(!erro) {				
				respostas.add(resposta.toUpperCase().equals("S"));
			}
			else {
				System.out.println("Respota inválida, digite S ou N para responder.");
			}
		}while(erro);
		
		do {
			System.out.println("Devia para a vítima? (S/N)");
			resposta = scanner.next();
			
			erro = !(resposta.toUpperCase().equals("S") || resposta.toUpperCase().equals("N"));
			
			if(!erro) {				
				respostas.add(resposta.toUpperCase().equals("S"));
			}
			else {
				System.out.println("Respota inválida, digite S ou N para responder.");
			}
		}while(erro);
		
		do {
			System.out.println("Já trabalhou com a vítima? (S/N)");
			resposta = scanner.next();
			
			erro = !(resposta.toUpperCase().equals("S") || resposta.toUpperCase().equals("N"));
			
			if(!erro) {				
				respostas.add(resposta.toUpperCase().equals("S"));
			}
			else {
				System.out.println("Respota inválida, digite S ou N para responder.");
			}
		}while(erro);
		
		scanner.close();
		
		int nivelSuspeita = 0;
		
		for (boolean resp : respostas){
			if(resp) {
				nivelSuspeita++;
			}	
		}
		
		if (nivelSuspeita > 1) {
			if(nivelSuspeita > 2) {
				if(nivelSuspeita > 4) {
					System.out.println("Assassina");
				}
				else {
					System.out.println("Cúmplice");
				}
			}
			else {
				System.out.println("Suspeita");
			}
		}
		else {
			System.out.println("Inocente");
		}
		
	}
}
