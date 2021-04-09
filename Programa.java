package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("SISTEMA ESPECIALISTA - SAÚDE");
		System.out.println(".....................................");
		System.out.println("Digite 1 - Busca por Sintomas");
		System.out.println("Digite 2 - Busca por Doenças");
		int opcao = sc.nextInt();
		
		if (opcao==1) {
		System.out.println(" 1 - Sintomas: Dor de garganta, febre, dor no corpo");
		System.out.println(" 2 - Sintomas: Febre, dificuldade para respirar, dor nas costas, tosse");
		System.out.println(" 3 - Sintomas: Tosse, calafrios, dor no corpo, febre, mal estar, perda de apetite");
		System.out.println(" 4 - Sintomas: Dor nos músculos, dor no abdômem, mal estar, suor, tremor, perda de apetite");
		System.out.println(" 5 - Sintomas: Febre, tosse, cansaço, dor de cabeça, perda de paladar, dor de garganta");
		System.out.println(".....................................");
		System.out.print("Digite o código referente aos sintomas: ");
		
		int x = sc.nextInt();
		String doenca;
		
		switch (x) {
		case 1:
			doenca = "Amigdalite";
			break;
		case 2:
			doenca = "Pneumonia";
			break;
		case 3:
			doenca = "Gripe";
			break;
		case 4:
			doenca = "Dengue";
			break;
		case 5:
			doenca = "Covid-19";
			break;
		default:
			doenca = "valor inválido";
			break;
		}
		
		System.out.println("Doença: " + doenca);
		
		}else{
			System.out.println(" 1 - Amigdalite");
			System.out.println(" 2 - Pneumonia");
			System.out.println(" 3 - Gripe");
			System.out.println(" 4 - Dengue");
			System.out.println(" 5 - Covid-19");
			System.out.println(".....................................");
			System.out.print("Digite o código referente aos sintomas: ");
			
			int x = sc.nextInt();
			String doenca;
			
			switch (x) {
			case 1:
				doenca = "Dor de garganta, febre, dor no corpo";
				break;
			case 2:
				doenca = "Febre, dificuldade para respirar, dor nas costas, tosse";
				break;
			case 3:
				doenca = "Tosse, calafrios, dor no corpo, febre, mal estar, perda de apetite";
				break;
			case 4:
				doenca = "Dor nos músculos, dor no abdômem, mal estar, suor, tremor, perda de apetite";
				break;
			case 5:
				doenca = "Febre, tosse, cansaço, dor de cabeça, perda de paladar, dor de garganta";
				break;
			default:
				doenca = "valor inválido";
				break;
			}
			
			System.out.println("Sintomas: " + doenca);
			
		}
		sc.close();

	}

}
