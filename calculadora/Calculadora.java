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
		System.out.println("Considere as opera��es a seguir e escolha a op��o:");
		System.out.println("");
		System.out.println("[1] Adi��o.");
		System.out.println("[2] Subtra��o.");
		System.out.println("[3] Multiplica��o.");
		System.out.println("[4] Divis�o.");
		System.out.println("[5] Raiz Quadrada");
		System.out.println("[6] Potencia");

		opcao = sc.nextInt();

		while (opcao != 0) {
			switch (opcao) {

			case 1:
				System.out.print("Digite um n�mero: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite outro n�mero: ");
				numero2 = sc.nextDouble();
				adicao = numero1 + numero2;
				System.out.println("A Adi��o dos dois n�meros �: " + adicao);

				if (adicao % 2 == 0) {
					System.out.println("O numero � par");
				} else if (adicao % 3 == 0) {
					System.out.println("O n�mero � Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O n�mero � impar e n�o divisivel por 3.");
				}
				break;

			case 2:
				System.out.print("Digite um n�mero: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite outro n�mero: ");
				numero2 = sc.nextDouble();
				subtracao = numero1 - numero2;
				System.out.println("A Subtra��o dos dois n�meros �: " + subtracao);

				if (subtracao % 2 == 0) {
					System.out.println("O numero � par");
				} else if (subtracao % 3 == 0) {
					System.out.println("O n�mero � Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O n�mero � impar e n�o divisivel por 3.");
				}
				break;

			case 3:
				System.out.print("Digite um n�mero: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite outro n�mero: ");
				numero2 = sc.nextDouble();
				multiplicacao = numero1 * numero2;
				System.out.println("A Multiplica��o dos dois n�meros �: " + multiplicacao);

				if (multiplicacao % 2 == 0) {
					System.out.println("O numero � par");
				} else if (multiplicacao % 3 == 0) {
					System.out.println("O n�mero � Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O n�mero � impar e n�o divisivel por 3.");
				}
				break;

			case 4:
				System.out.print("Digite um n�mero: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite outro n�mero: ");
				numero2 = sc.nextDouble();

				divisao = numero1 / numero2;
				System.out.println("A divis�o dos dois n�mero �: " + divisao);
				if (divisao % 2 == 0) {
					System.out.println("O numero � par");
				} else if (divisao % 3 == 0) {
					System.out.println("O n�mero � Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O n�mero � impar e n�o divisivel por 3. ");
				}
				break;
			case 5:
				System.out.print("Digite um n�mero: ");
				numero1 = sc.nextDouble();
				raizquadrada = Math.sqrt(numero1);
				System.out.println("A Raiz quadrada do n�mero �: " + raizquadrada);
				if (raizquadrada % 2 == 0) {
					System.out.println("O numero � par");
				} else if (raizquadrada % 3 == 0) {
					System.out.println("O n�mero � Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O n�mero � impar e n�o divisivel por 3. ");
				}
				break;
			case 6:
				System.out.print("Digite o numero da base: ");
				numero1 = sc.nextDouble();
				System.out.print("Digite o numero do expoente: ");
				numero2 = sc.nextDouble();
				potencia = Math.pow(numero1, numero2);
				System.out.println("A potencia dos dois n�mero �: " + potencia);
				if (potencia % 2 == 0) {
					System.out.println("O numero � par");
				} else if (potencia % 3 == 0) {
					System.out.println("O n�mero � Impar e divisivel por 3. ");
				}

				else {
					System.out.println("O n�mero � impar e n�o divisivel por 3. ");
				}
				break;
			default:
				System.out.println("Op��o invalida");
				System.out.println("Digite uma op��o de 01 a 06.");
			}
			
			opcao = sc.nextInt();
			System.out.println("Obrigado, estamos finalizando o sistema. ");
		}
		sc.close();
	}

}
