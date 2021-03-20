package exercicio2;

public class CalculosImpl implements Calculos {

	@Override
	public int Somar(int n1, int n2) {
		int result = n1+n2;
		return result;
	}

	@Override
	public int Multiplicar(int n1, int n2) {
		int result = n1*n2;
		return result;
	}

	@Override
	public int Subtrair(int n1, int n2) {
		int result = n1-n2;
		return result;
	}

	@Override
	public int Dividir(int n1, int n2) {
		int result = n1/n2;
		return result;
	}

}
