import java.util.Scanner;

class Horarios {
	/* Domingo = 0
	 * Segunda = 1...
	 * Sábado = 6
	 * */
	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		Data[] = new Data[3];
		
		for (i = 0; i < 3; i++) {
			data[i] = new Data();
			
			System.out.println("Digite o número do dia da data " + i + ": ");
			data[i].setDia(s.nextInt());
			
			System.out.println("Digite o número do mês da data " + i + ": ");
			data[i].setMes(s.nextInt());
			
			System.out.println("Digite o número do ano da data " + i + ": ");
			data[i].setAno(s.nextInt());
		}
	}
}
