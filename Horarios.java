import java.util.Scanner;

class Horarios {
	public static int QTD = 10;
	/* Domingo = 0
	 * Segunda = 1...
	 * Sábado = 6
	 * */
	public static void main(String[] args) {
		int i, maxDif, auxDif;
		Scanner s = new Scanner(System.in);
		Data[] input = new Data[QTD];
		Data resp;
		
		dif = new Data();
		
		// mais longe do dia 1 do próximo mês
		for (i = 0; i < QTD; i++) {
			data[i] = new Data();
			
			System.out.println("Digite o número do dia da data " + i + ": ");
			data[i].setDia(s.nextInt());
		}
		
		for (i = 0; i < QTD; i++) {
			auxDif = 30 - data[i].getDia() + 1;
			
			if (i == 0) {
				maxDif = auxDif;
				resp = data[i];
			}
			else if (auxDif > maxDif) {
				maxDif = auxDif;
				resp = data[i];
			}
		}
		
		System.out.println("O encontro mais distante do dia primeiro do mês seguinte é:");
		System.out.println(resp);
	}
}
