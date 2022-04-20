package funcao;

public class Media {

	public void mediaAritimetica(Double[] number) {

		double soma = 0;
		int length = number.length;
		Double mediaArit;

		for (int i = 0; i < length; i++) {
			soma = soma + number[i];
		}

		mediaArit = soma / length;

		System.out.println("Media aritimetica: " + mediaArit);
	}

	public void mediaGeo(Double[] number) {

		double produto = 1;
		int length = number.length;
		Double mediaGeo;

		for (int i = 0; i < length; i++) {
			produto = produto * number[i];
		}

		mediaGeo = Math.pow(produto, (double) 1 / length);

		System.out.println("Media geometrica: " + mediaGeo);
	}
	
}
