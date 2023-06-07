import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			// chamando o método contendo a lógica de contagem
			// iniciando o try catch, para retornar uma exceção customizada
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			// imprimindo mensagem no catch, caso o usuário declare  o segundo numero menor que  o primeiro "O segundo parâmetro deve ser maior que o primeiro".
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}


	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// verificando se o parametroUm é maior que o parametroDois dois e lançando a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		// realizando o for para imprimir os números com base na variável contagem
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}

    }
}
