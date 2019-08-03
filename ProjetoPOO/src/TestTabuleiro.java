
public class TestTabuleiro {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro();

		tabuleiro.adicionaPosicionavel(
				new Terreno("Leblon", 2, 100, 6, 30, 90, 270, 400, 500, 50, 50, 0, 6, new Jogador("", "")));

	}

}
