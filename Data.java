class Data {
	- String nome;
	- int dia, mes, ano, hora, min, seg, diaSemana;
	- boolean feriado, primo;
	
	// não sei se precisam, mas tá aí um monte de construtor :P
	+ Data();
	+ Data(int i, boolean feriado); // se quiser setar só um dos valores
	+ Data(int dia, int mes, int ano, String nome);
	+ Data(int dia, int mes, int ano, boolean feriado);
	+ Data(int dia, int mes, int ano, String nome, boolean feriado);
	+ Data(int dia, int mes, int ano, int hora, int min, int seg, boolean feriado);
	+ Data(int dia, int mes, int ano, int hora, int min, int seg, int diaSemana, boolean feriado);
	
	+ int getDia();
	+ void setDia(int dia);
	+ int getMes();
	+ void setMes(int mes);
	+ int getAno();
	+ void setAno(int ano);
	+ int getHora();
	+ void setHora(int hora);
	+ int getMin();
	+ void setMin(int min);
	+ int getSeg();
	+ void setSeg(int seg);
	+ int getDiaSemana();
	+ void setDiaSemana(int diaSemana);
	+ boolean ehFeriado();
	+ void setFeriado(boolean feriado);
	+ String getNome();
	+ void setNome(String nome);
	+ boolean getPrimo();
	+ void setPrimo(boolean primo);
	
	// conversões
	+ int emDias();
	+ int emMeses();
	+ int emAnos();
	+ int emHoras();
	+ int emMin();
	+ int emSeg();
	+ int emSemanas();
	
	+ boolean ehBissexto();
	+ String toString();
	+ String getEstacao();
	
	// retorna um objeto Data contendo a diferença de tempo
	// entre "outra" e "this"
	+ Data diferenca(Data outra);
	// retorna a data resultante de "this" + "outra"
	+ Data soma(Data outra);
}
