import java.util.Scanner;

class MainConjuntos{

	public static void main(String[] args){
		int N = 10;
		Conjunto c = new Conjunto();
		Scanner scan = new Scanner(System.in);
		//System.out.print("Digite a quantidade de números desejada: ");
		//N = scan.nextInt();
		System.out.println("Digite " + 10 + " strings: ");
		while(N--){
			c.add(scan.nextLine());
		}
		for(i = c.tamanhoArray(); i >= 0; i++){
			if(c.get(i) instanceof String){
				String aux = (String)(c.get(i));
				System.out.print(aux);
			}
		}	
	}

}
