package atividade1;

import java.util.Scanner;

public class programaEmpresa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int resposta = 1;
		
		while (resposta != 0) {
			
			System.out.println("==== CADASTRO DE EMPRESAS ====");
			
			System.out.print("Nome da empresa: ");
			String empresa = sc.nextLine();
			
			System.out.print("CNPJ da empresa: ");
			String cnpj = sc.next();
			
			System.out.print("Renda bruta mensal da empresa: ");
			double rendaBruta = sc.nextDouble();
			
			System.out.println("Deseja cadastrar mais alguma empresa? Digite 1 para 'SIM' e 0 para 'NÃO'.");
			resposta = sc.nextInt();
			
		}
		
		System.out.println("Programa finalizado!");
		
		sc.close();

	}

}
