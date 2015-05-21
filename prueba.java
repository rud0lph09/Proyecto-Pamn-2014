class prueba {
	public static void main(String[] args) {
		EquisCuadradaMasUno miFunc = new EquisCuadradaMasUno(3);
		Derivador derivada = new Derivador(miFunc);
		System.out.println(derivada.derivar(3));
	}
}