
public class EX0401 {

	public static void main(String[] args) {
		Vetor vetor1 = new Vetor(7.2320, 9.0212);
		
		Vetor clone = vetor1.clone();
		
		System.out.println(clone.toString());
	}
}
