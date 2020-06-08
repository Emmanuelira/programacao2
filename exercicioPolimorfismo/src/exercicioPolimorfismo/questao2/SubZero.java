package exercicioPolimorfismo.questao2;

public class SubZero extends Lutador{
	
	public SubZero(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public void lancarMagia(Lutador l) {
		super.lancarMagia(l);
		l.vida -= 8;
	}

}
