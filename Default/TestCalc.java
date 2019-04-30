package Default;

public class TestCalc {

	public static void main(String[] args) {
		Soma s = new Soma();
		Subtracao t = new Subtracao();
		Multiplicacao m = new Multiplicacao();
		Divisao d = new Divisao();
		
		System.out.println("Soma: "+s.calcula(2,4));
		System.out.println("Subtração: "+t.calcula(7,4));
		System.out.println("Multiplicação: "+m.calcula(2,5));
		System.out.println("Divisão: "+d.calcula(6,3));

	}

}
