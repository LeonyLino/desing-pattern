package strategy;

import java.util.Random;

public class Arrojado implements Investimento {

	private Random random;
	
	public Arrojado(Random random) {
		this.random = random;
	}
	
	@Override
	public double calcula(Conta conta) {
		int chute = random.nextInt(10);
		if(chute >= 0 && chute <= 1)
			return conta.getSaldo() * 0.05;
		else if(chute >= 2 && chute <=40)
			return conta.getSaldo() * 0.03;
		else
			return conta.getSaldo() * 0.006;
	}

}
