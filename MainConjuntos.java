import java.util.Scanner;

class MainConjuntos{

	public static void main(String[] args){
		int N = 11;
		Conjunto c = new Conjunto();
		Scanner scan = new Scanner(System.in);
		//System.out.print("Digite a quantidade de números desejada: ");
		//N = scan.nextInt();
		System.out.println("Digite " + 11 + " INTEIROS PARES: ");
		while(N > 0){
			Integer aux = scan.nextInt();
			if(aux % 2 == 0) c.add(aux);

			N--;
		}
		for(int i = c.tamanhoArray() - 1; i >= 0; i--){
			if((c.getValor(i)) instanceof Integer){
				Integer aux = (Integer)(c.getValor(i));
				if(aux > 3.14f) System.out.print(aux + " ");
			}
		}	
		System.out.print("\n");
	}

}
