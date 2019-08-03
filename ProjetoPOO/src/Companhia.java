
public class Companhia implements Posicionavel, Propriedade {

	private String nome;
	private int posiçao;
	private int precoCompra;
	private int Hipoteca;
	private int Multiplicador;
	private Jogador dono;

	public Companhia(String nome, int posiçao, int precoCompra, int hipoteca, int multiplicador) {
		this.nome = nome;
		this.posiçao = posiçao;
		this.precoCompra = precoCompra;
		Hipoteca = hipoteca;
		Multiplicador = multiplicador;
	}

	@Override
	public int getPosiçao() {
		return this.posiçao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(int precoCompra) {
		this.precoCompra = precoCompra;
	}

	public int getHipoteca() {
		return Hipoteca;
	}

	public void setHipoteca(int hipoteca) {
		Hipoteca = hipoteca;
	}

	public int getMultiplicador() {
		return Multiplicador;
	}

	public void setMultiplicador(int multiplicador) {
		Multiplicador = multiplicador;
	}

	public void setPosiçao(int posiçao) {
		this.posiçao = posiçao;
	}

	public Jogador getDono() {
		return dono;
	}

	public void setDono(Jogador dono) {
		this.dono = dono;
	}

}
