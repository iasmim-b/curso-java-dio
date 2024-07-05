import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();

		try {
		contar(parametroUm, parametroDois);
		}
        catch (ParametrosInvalidosException e) {

            System.err.println("O segundo parametro precisa ser maior que o primeiro! ");
	
		}

		scanner.close();
	}
	static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        
        if (parametroDois < parametroUm){ 
        throw new ParametrosInvalidosException();
        }
		
        int contagem = parametroDois - parametroUm;

		for (int i = 1 ; i <= contagem; i++) {
        System.out.println("Imprimindo nº " + i);
        }
	}
}