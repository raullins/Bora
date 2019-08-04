import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

	private ArrayList<Posicionavel> casas;

	public Tabuleiro() {
		this.casas = new ArrayList<Posicionavel>();
	}

	public void adicionaPosicionavel(Posicionavel p) {
		this.casas.add(p);
	}

}