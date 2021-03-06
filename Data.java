class Data {
	private String nome;
	private int dia, mes, ano, hora, min, seg, diaSemana;
	private boolean feriado, primo, aniversario;
	
	// não sei se precisam, mas tá aí um monte de construtor :P

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
	
	// public String getEstacao();

	public Data diferenca(Data outra){
		Data resp = new Data();
		resp.setDia(outra.getDia() - this.dia);
		resp.setMes(outra.getMes() - this.mes);
		resp.setAno(outra.getAno() - this.ano);
		resp.setHora(this.hora - outra.hora);
		resp.setMin(this.min - outra.min);
		resp.setSeg(this.seg - outra.seg);

		return resp;
	}

	// retorna a data resultante de "this" + "outra"
	// public Data soma(Data outra);

	public Data() {}

	public Data(int i, boolean feriado) { // se quiser setar só um dos valores
		this.setDia(i);
		this.setAno(i);
		this.setMes(i);
		this.setFeriado(feriado);
	}

	public Data(int dia, int mes, int ano, String nome) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setNome(nome);
	}

	public Data(int dia, int mes, int ano, String nome, boolean aniversario) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setNome(nome);
		this.setAniversario(aniversario);
	}
	public Data(int dia, int mes, int ano, boolean feriado) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setFeriado(feriado);
	}

	/*public Data(int dia, int mes, int ano, String nome, boolean feriado) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setNome(nome);
		this.setFeriado(feriado);
	}*/

	public Data(int dia, int mes, int ano, int hora, int min, int seg) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setFeriado(feriado);
	}
	public Data(int dia, int mes, int ano, int hora, int min, int seg, int diaSemana) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setHora(hora);
		this.setMin(min);
		this.setSeg(seg);
		this.setDiaSemana(diaSemana);
	}
	
	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getHora() {		
		return this.hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return this.min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return this.seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public int getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

	public boolean ehFeriado() {
		return this.feriado;
	}

	public void setFeriado(boolean feriado) {
		this.feriado = feriado;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getPrimo() {
		return this.primo;
	}

	public void setPrimo(boolean primo) {
		this.primo = primo;
	}

	public boolean getAniversario() {
		return this.aniversario;
	}

	public void setAniversario(boolean aniversario) {
		this.aniversario = aniversario;
	}

	
	/*// conversões
	public int emDias();
	public int emMeses();
	public int emAnos();
	public int emHoras();
	public int emMin();
	public int emSeg();
	public int emSemanas();
	
	public boolean ehBissexto();
	public String toString();
	public String getEstacao();
	
	// retorna um objeto Data contendo a diferença de tempo
	// entre "outra" e "this"
	public Data diferenca(Data outra);
	// retorna a data resultante de "this" public "outra"
	public Data soma(Data outra);*/
}
