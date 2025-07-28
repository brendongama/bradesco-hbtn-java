public class Numero {

	public static void dividir(int numero1, int numero2) {
		int resultado = 0;
		try {
			resultado  = numero1 / numero2;
		} catch (Exception e) {
			System.out.println("Nao eh possivel dividir por zero");
		} finally {
			
			System.out.println(numero1+" / "+numero2+ " = " + resultado);
		}
	}
}
