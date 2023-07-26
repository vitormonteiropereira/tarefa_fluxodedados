package controlefluxo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextDouble();
			
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextDouble();

		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextDouble();
				
		System.out.println("Digite a quarta nota: ");
		n4 = ler.nextDouble();
				
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("A media do aluno e igual:" + media);
		
		if (media >= 7) {
			System.out.println("O aluno esta aprovado");
		}
		else if (media >=5) {
			System.out.println("O aluno esta de exame");
		}
		else {
			System.out.println("O aluno esta reprovado");
		}
}
}