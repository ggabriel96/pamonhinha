import java.util.*;

class Conjunto {
	private ArrayList<Object> valores;
	
	public Object getValor(int indice) {
		return this.valores.get(indice);
	}
	
	public void add(Object valor) {
		if (this.valores == null) {
			this.valores = new ArrayList<Object>();
		}
		this.valores.add(valor);
	}
	
	public void del(Object valor) {
		this.valores.remove(valor);
	}
	
	public Conjunto interseccao(Conjunto x) {
		return null;
	}
	
	public Conjunto uniao(Conjunto x) {
		return null;
	}
	
	public Object encontraMaior() {
		return null;
	}
	
	public Object encontraMenor() {
		return null;
	}
	
	public int tamanhoArray() {
		if (this.valores == null) {
			this.valores = new ArrayList<Object>();
		}
		return this.valores.size();
	}
	
	public Integer encontraIndice(Object valor) {
		for (int i = 0; i < this.tamanhoArray(); i++) {
			if (this.getValor(i).equals(valor)) {
				return i;
			}
		}
		return null;
	}
	
	public void ordena() {
	}
	
	public boolean ehPrimo(int indice) {
		return false;
	}
}
