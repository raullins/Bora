
public class Companhia implements Posicionavel, Propriedade {

	private String nome;
	private int posi�ao;
	private int precoCompra;
	private int Hipoteca;
	private int Multiplicador;
	private Jogador dono;

	public Companhia(String nome, int posi�ao, int precoCompra, int hipoteca, int multiplicador) {
		this.nome = nome;
		this.posi�ao = posi�ao;
		this.precoCompra = precoCompra;
		Hipoteca = hipoteca;
		Multiplicador = multiplicador;
	}

	@Override
	public int getPosi�ao() {
		return this.posi�ao;
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

	public void setPosi�ao(int posi�ao) {
		this.posi�ao = posi�ao;
	}

	public Jogador getDono() {
		return dono;
	}

	public void setDono(Jogador dono) {
		this.dono = dono;
	}

}
