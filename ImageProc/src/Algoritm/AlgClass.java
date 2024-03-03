package Algoritm;

public class AlgClass extends ImlAlgs{
	
	public int alg(double d, int col) {
		return (int)(d * Math.log( col + 1) / Math.log(2));
	}
	
	public void getD(){
		System.out.println("Valoare D: " + d);
	}
}
