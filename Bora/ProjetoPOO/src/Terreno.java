
public class Terreno implements Posicionavel, Propriedade {

	private String nome;
	private int posi�ao;
	private int precoCompra;
	private int aluguelSemCasa;
	private int aluguelUmaCasa;
	private int aluguelDuasCasas;
	private int aluguelTresCasas;
	private int aluguelQuatroCasas;
	private int aluguelHotel;
	private int hipoteca;
	private int precoCasa;
	private int numCasas;
	private int aluguel;
	private Jogador dono;

	public Terreno(String nome, int posi�ao, int precoCompra, int aluguelSemCasa, int aluguelUmaCasa,
			int aluguelDuasCasas, int aluguelTresCasas, int aluguelQuatroCasas, int aluguelHotel, int hipoteca,
			int precoCasa, int numCasas, int aluguel, Jogador dono) {
		this.nome = nome;
		this.posi�ao = posi�ao;
		this.precoCompra = precoCompra;
		this.aluguelSemCasa = aluguelSemCasa;
		this.aluguelUmaCasa = aluguelUmaCasa;
		this.aluguelDuasCasas = aluguelDuasCasas;
		this.aluguelTresCasas = aluguelTresCasas;
		this.aluguelQuatroCasas = aluguelQuatroCasas;
		this.aluguelHotel = aluguelHotel;
		this.hipoteca = hipoteca;
		this.precoCasa = precoCasa;
		this.numCasas = numCasas;
		this.aluguel = aluguel;
		this.dono = dono;
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

	public int getAluguelSemCasa() {
		return aluguelSemCasa;
	}

	public void setAluguelSemCasa(int aluguelSemCasa) {
		this.aluguelSemCasa = aluguelSemCasa;
	}

	public int getAluguelUmaCasa() {
		return aluguelUmaCasa;
	}

	public void setAluguelUmaCasa(int aluguelUmaCasa) {
		this.aluguelUmaCasa = aluguelUmaCasa;
	}

	public int getAluguelDuasCasas() {
		return aluguelDuasCasas;
	}

	public void setAluguelDuasCasas(int aluguelDuasCasas) {
		this.aluguelDuasCasas = aluguelDuasCasas;
	}

	public int getAluguelTresCasas() {
		return aluguelTresCasas;
	}

	public void setAluguelTresCasas(int aluguelTresCasas) {
		this.aluguelTresCasas = aluguelTresCasas;
	}

	public int getAluguelQuatroCasas() {
		return aluguelQuatroCasas;
	}

	public void setAluguelQuatroCasas(int aluguelQuatroCasas) {
		this.aluguelQuatroCasas = aluguelQuatroCasas;
	}

	public int getAluguelHotel() {
		return aluguelHotel;
	}

	public void setAluguelHotel(int aluguelHotel) {
		this.aluguelHotel = aluguelHotel;
	}

	public int getHipoteca() {
		return hipoteca;
	}

	public void setHipoteca(int hipoteca) {
		this.hipoteca = hipoteca;
	}

	public int getPrecoCasa() {
		return precoCasa;
	}

	public void setPrecoCasa(int precoCasa) {
		this.precoCasa = precoCasa;
	}

	public int getNumCasas() {
		return numCasas;
	}

	public void setNumCasas(int numCasas) {
		this.numCasas = numCasas;
	}

	public int getAluguel() {
		return aluguel;
	}

	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}

	public Jogador getDono() {
		return dono;
	}

	public void setDono(Jogador dono) {
		this.dono = dono;
	}

	public void setPosi�ao(int posi�ao) {
		this.posi�ao = posi�ao;
	}

	@Override
	public int getPosi�ao() {

		return this.posi�ao;
	}
}
