package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero1, numero2;
		double adicao, subtracao, multiplicacao, divisao, raizquadrada, potencia;
		int opcao = 1;

		System.out.println("####### CALCULADORA #######");
		System.out.println("");
		System.out.println("Considere as operações a seguir e escolha a opção:");
		System.out.println("");
		System.out.println("[1] Adição.");
		System.out.println("[2] Subtração.");
		System.out.println("[3] Multiplicação.");
		System.out.println("[4] Divisão.");
		System.out.println("[5] Raiz Quadrada");
		System.out.println("[6] Potencia");

		opcao = sc.nextInt();

		while (opcao != 0) {
			switch (opcao) {

			case 1:
				System.out.print("Digite um número: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite outro número: ");
				numero2 = sc.nextDouble();
				adicao = numero1 + numero2;
				System.out.println("A Adição dos dois números é: " + adicao);

				if (adicao % 2 == 0) {
					System.out.println("O numero é par");
				} else if (adicao % 3 == 0) {
					System.out.println("O número é Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O número é impar e não divisivel por 3.");
				}
				break;

			case 2:
				System.out.print("Digite um número: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite outro número: ");
				numero2 = sc.nextDouble();
				subtracao = numero1 - numero2;
				System.out.println("A Subtração dos dois números é: " + subtracao);

				if (subtracao % 2 == 0) {
					System.out.println("O numero é par");
				} else if (subtracao % 3 == 0) {
					System.out.println("O número é Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O número é impar e não divisivel por 3.");
				}
				break;

			case 3:
				System.out.print("Digite um número: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite outro número: ");
				numero2 = sc.nextDouble();
				multiplicacao = numero1 * numero2;
				System.out.println("A Multiplicação dos dois números é: " + multiplicacao);

				if (multiplicacao % 2 == 0) {
					System.out.println("O numero é par");
				} else if (multiplicacao % 3 == 0) {
					System.out.println("O número é Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O número é impar e não divisivel por 3.");
				}
				break;

			case 4:
				System.out.print("Digite um número: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite outro número: ");
				numero2 = sc.nextDouble();

				divisao = numero1 / numero2;
				System.out.println("A divisão dos dois número é: " + divisao);
				if (divisao % 2 == 0) {
					System.out.println("O numero é par");
				} else if (divisao % 3 == 0) {
					System.out.println("O número é Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O número é impar e não divisivel por 3. ");
				}
				break;
			case 5:
				System.out.print("Digite um número: ");
				numero1 = sc.nextDouble();
				raizquadrada = Math.sqrt(numero1);
				System.out.println("A Raiz quadrada do número é: " + raizquadrada);
				if (raizquadrada % 2 == 0) {
					System.out.println("O numero é par");
				} else if (raizquadrada % 3 == 0) {
					System.out.println("O número é Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O número é impar e não divisivel por 3. ");
				}
				break;
			case 6:
				System.out.print("Digite o numero da base: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite o numero do expoente: ");
				numero2 = sc.nextDouble();
				potencia = Math.pow(numero1, numero2);
				System.out.println("A potencia dos dois número é: " + potencia);
				if (potencia % 2 == 0) {
					System.out.println("O numero é par");
				} else if (potencia % 3 == 0) {
					System.out.println("O número é Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O número é impar e não divisivel por 3. ");
				}
				break;
			default:
				System.out.println("Opção invalida");
				System.out.println("Digite uma opção de 01 a 06.");
			}
			
			opcao = sc.nextInt();
			System.out.println("Obrigado, estamos finalizando o sistema. ");
		}
		sc.close();
	}

}
