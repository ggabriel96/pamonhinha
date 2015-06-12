class Data {
	- String nome;
	- int dia, mes, ano, hora, min, seg, diaSemana;
	- boolean feriado, primo, aniversario;
	
	// não sei se precisam, mas tá aí um monte de construtor :P
	+ Data();
	+ Data(int i, boolean feriado); // se quiser setar só um dos valores
	+ Data(int dia, int mes, int ano, String nome);
	+ Data(int dia, int mes, int ano, String nome, boolean aniversario);
	+ Data(int dia, int mes, int ano, boolean feriado);
	+ Data(int dia, int mes, int ano, String nome, boolean feriado);
	+ Data(int dia, int mes, int ano, int hora, int min, int seg);
	+ Data(int dia, int mes, int ano, int hora, int min, int seg, int diaSemana);
	
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
	+ boolean getAniversario();
	+ void setAniversario(boolean aniversario);
	

	public int emDias(){
		return this.emMeses()*30 + this.dia;
	}

	public int emMeses(){
		return this.emAnos()*12 + this.mes;
	}

	public int emAnos(){
		return this.ano;
	}

	public int emHoras(){
		return this.emDias()*24 + this.hora;
	}

	public int emMin(){
		return this.emHoras()*60 + this.min;
	}

	public int emSeg(){
		return this.emMin()*60 + this.seg;
	}

	public int emSemanas(){
		return this.emDias()/7;
	}

	public boolean ehBissexto(){
		if(this.ano % 400 == 0 || (this.ano % 4 == 0 && this.ano % 100 != 0)) return true;
		else return false;
	}

	public String toString(){
		return dia + "/" + mes + "/" + ano + "	" + hora + ":" + min + ":" + seg;
	}
	
	+ String getEstacao();
	
	// retorna um objeto Data contendo a diferença de tempo
	// entre "outra" e "this"
	+ Data diferenca(Data outra);
	// retorna a data resultante de "this" + "outra"
	+ Data soma(Data outra);
}
