package main;
import api.ExchangeRate;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws IOException, InterruptedException {

		int sairMenu = 0;
		int userNumber;
		float userNumberConversion;
		String base_code;
		String target_code;
		
		Scanner userInput = new Scanner(System.in); //Create a scanner object

		while (sairMenu == 0) {
			System.out.println("********************************************");
			System.out.println("Seja bem-vindo ao conversor de moedas! \nEscolha uma opção listada abaixo:");
			System.out.println("1) Dólar =>> Peso Argentino");
			System.out.println("2) Peso Argentino =>> Dólar");
			System.out.println("3) Dólar =>> Real Brasileiro");
			System.out.println("4) Real Brasileiro =>> Dólar");
			System.out.println("5) Dólar =>> Peso Colombiano");
			System.out.println("6) Peso Colombiano =>> Dólar");
			System.out.println("7) Sair");
			System.out.println("********************************************");
			System.out.println("");
			
			userNumber = userInput.nextInt(); //Read user input

			if (userNumber == 1) {
				System.out.println("Registre o valor que quer converter:");
				userNumberConversion = userInput.nextInt();
				//USD ==> ARS
				base_code = "USD";
				target_code = "ARS";
				Double conversion_rate = ExchangeRate.main(base_code,target_code);
				
				System.out.println("O valor " + userNumberConversion + " [USD] corresponde a ===> " + userNumberConversion*conversion_rate  + "[ARS]");
			}else if (userNumber == 2) {
				System.out.println("Registre o valor que quer converter:");
				userNumberConversion = userInput.nextInt();
				//ARS ==> USD
				base_code = "ARS";
				target_code = "USD";
				Double conversion_rate = ExchangeRate.main(base_code,target_code);
				
				System.out.println("O valor " + userNumberConversion + " [ARS] corresponde a ===> " + userNumberConversion*conversion_rate  + "[USD]");
			}else if (userNumber == 3) {
				System.out.println("Registre o valor que quer converter:");
				userNumberConversion = userInput.nextInt();
				//USD ==> BRL
				base_code = "USD";
				target_code = "BRL";
				Double conversion_rate = ExchangeRate.main(base_code,target_code);
				
				System.out.println("O valor " + userNumberConversion + " [USD] corresponde a ===> " + userNumberConversion*conversion_rate  + "[BRL]");
			}else if (userNumber == 4) {
				System.out.println("Registre o valor que quer converter:");
				userNumberConversion = userInput.nextInt();
				//BRL ==> USD
				base_code = "BRL";
				target_code = "USD";
				Double conversion_rate = ExchangeRate.main(base_code,target_code);
				
				System.out.println("O valor " + userNumberConversion + " [BRL] corresponde a ===> " + userNumberConversion*conversion_rate  + "[USD]");
			}else if (userNumber == 5) {
				System.out.println("Registre o valor que quer converter:");
				userNumberConversion = userInput.nextInt();
				//USD ==> ARS
				base_code = "USD";
				target_code = "COP";
				Double conversion_rate = ExchangeRate.main(base_code,target_code);
				
				System.out.println("O valor " + userNumberConversion + " [USD] corresponde a ===> " + userNumberConversion*conversion_rate  + "[COP]");
			}else if (userNumber == 6) {
				System.out.println("Registre o valor que quer converter:");
				userNumberConversion = userInput.nextInt();
				//COP ==> USD
				base_code = "COP";
				target_code = "USD";
				Double conversion_rate = ExchangeRate.main(base_code,target_code);
				
				System.out.println("O valor " + userNumberConversion + " [COP] corresponde a ===> " + userNumberConversion*conversion_rate  + "[USD]");
			}else if (userNumber == 7){
				System.out.println("Obrigada por usar nosso programa! Até mais.");
				sairMenu = 1;
			}else {
				System.out.println("Escolha uma opção válida!");
			}

		}

		userInput.close();

	}

}
