/* Tarefa pra vocês fazerem: Faça um programa que receba 5 datas (com dia, mes e ano).
 * O programa informa quantas datas são maiores e quantas são menores que a data formada pela média de todas as datas.
 * */

class MediaDatas {
	public static int QTD = 7;
	
	public static void main(String[] args) {
		int dia = 0, mes = 0, ano = 0;
		int i, respMai = 0;
		Scanner s = new Scanner(System.in);
		Data[] input = new Data[QTD];
		
		for (i = 0; i < QTD; i++) {
			data[i] = new Data();
			
			System.out.println("Digite o número do dia da data " + i + ": ");
			data[i].setDia(s.nextInt());
			
			System.out.println("Digite o número do mês da data " + i + ": ");
			data[i].setMes(s.nextInt());
			
			System.out.println("Digite o número do ano da data " + i + ": ");
			data[i].setAno(s.nextInt());
			
			dia += data[i].getDia();
			mes += data[i].getMes();
			ano += data[i].getAno();
		}
		
		for (i = 0; i < QTD; i++) {
			
		}
	}
}
