package atividade2;

import java.util.Scanner;

public class programaConcessionaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 123;
		int senhaDigitada, opcao, opcaoCarro, quantidade, cor, formaPagamento;
		String acessorio;
		
		System.out.println("==== BEM-VINDO AO SISTEMA ====");
		
		System.out.print("Digite sua senha: ");
		senhaDigitada = sc.nextInt();
		
		while (senhaDigitada != senhaCorreta) {
		
			System.out.println("ERRO DE SENHA!");
			
			System.out.print("Digite sua senha novamente: ");
			senhaDigitada = sc.nextInt();
		
		}
		
		System.out.println("SENHA CORRETA!");
		
		do {
		
			System.out.println("==== ESCOLHA A OPÇÃO DESEJADA ====");
		
			System.out.println(" 1 - Cadastro de cliente");
			System.out.println(" 2 - Compra de carro");
			System.out.println(" 3 - Compra de acessório");
			System.out.println(" 4 - Sair do programa");
			
			System.out.print(" Digite o número correspondente: ");
			opcao = sc.nextInt();
		
			switch (opcao) {
		
			case 1:
				System.out.println("==== CADASTRO DE CLIENTE ====");
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				sc.nextLine();
				
				System.out.print("Telefone: ");
				String tel = sc.next();
				
				System.out.print("Endereço: ");
				String endereco = sc.nextLine();
				
				sc.nextLine();
				
				break;
			case 2:
				do {
					System.out.println("==== COMPRA DE CARRO ====");
					
					System.out.println("==== ESCOLHA A OPÇÃO DESEJADA ====");
					
					System.out.println(" 1 - Fiat Argo");
					System.out.println(" 2 - Fiat Pulse");
					System.out.println(" 3 - Fiat Toro");
					System.out.println(" 4 - Voltar");
					
					System.out.print(" Digite o número correspondente: ");
					opcaoCarro = sc.nextInt();
					
					switch (opcaoCarro) {
					
					case 1:
						System.out.println("Escolheu o Fiat Argo!");
						
						System.out.println("Cores disponíveis: ");
						System.out.println(" 1 - Azul");
						System.out.println(" 2 - Branco");
						System.out.println(" 3 - Preto");
						System.out.println(" 4 - Vermelho");
						System.out.println("Qual a cor? ");
						cor = sc.nextInt();
						
						System.out.println("Formas de pagamento disponíveis: ");
						System.out.println(" 1 - Dinheiro");
						System.out.println(" 2 - Pix");
						System.out.println(" 3 - Crédito");
						System.out.println(" 4 - Débito");
						System.out.println("Qual a forma de pagamento? ");
						formaPagamento = sc.nextInt();
						
						break;
					case 2:
						System.out.println("Escolheu o Fiat Pulse!");
						
						System.out.println("Cores disponíveis: ");
						System.out.println(" 1 - Azul");
						System.out.println(" 2 - Branco");
						System.out.println(" 3 - Preto");
						System.out.println(" 4 - Vermelho");
						System.out.println("Qual a cor? ");
						cor = sc.nextInt();
						
						System.out.println("Formas de pagamento disponíveis: ");
						System.out.println(" 1 - Dinheiro");
						System.out.println(" 2 - Pix");
						System.out.println(" 3 - Crédito");
						System.out.println(" 4 - Débito");
						System.out.println("Qual a forma de pagamento? ");
						formaPagamento = sc.nextInt();
						
						break;
					case 3:
						System.out.println("Escolheu a Fiat Toro!");
						
						System.out.println("Cores disponíveis: ");
						System.out.println(" 1 - Azul");
						System.out.println(" 2 - Branco");
						System.out.println(" 3 - Preto");
						System.out.println(" 4 - Vermelho");
						System.out.println("Qual a cor? ");
						cor = sc.nextInt();
						
						System.out.println("Formas de pagamento disponíveis: ");
						System.out.println(" 1 - Dinheiro");
						System.out.println(" 2 - Pix");
						System.out.println(" 3 - Crédito");
						System.out.println(" 4 - Débito");
						System.out.println("Qual a forma de pagamento? ");
						formaPagamento = sc.nextInt();
					
						break;
					case 4:
						break;
					default:
						System.out.println("Opção incorreta!");
						break;
					}
				} while (opcaoCarro != 1 && opcaoCarro != 2 && opcaoCarro != 3 && opcaoCarro != 4);
				break;
			case 3:
				System.out.println("==== COMPRA DE ACESSÓRIO ====");
				
				System.out.print("Digite o nome do acessório: ");
				acessorio = sc.nextLine();
				
				sc.nextLine();
				
				System.out.print("Digite a quantidade: ");
				quantidade = sc.nextInt();
				
				break;
			case 4:	
				break;
			default:
				System.out.println("Opção incorreta!");
				break;
			}
		} while (opcao != 4);
		
		System.out.println("Programa finalizado!");
		
		sc.close();

	}

}
