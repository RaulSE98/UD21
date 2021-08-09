package Test.UD21;

import static org.junit.jupiter.api.Assertions.*;



class Test {

	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	public void testAreaCuadrado () {
		Geometria calc = new Geometria();
		int resultado = calc.areacuadrado(5);
		int esperado = 25;
		assertEquals(resultado, esperado);
	}
	
	public void testAreaCirculo() {
		Geometria calc = new Geometria();
		double resultado = calc.areaCirculo(5);
		double esperado = 78.54;
		assertEquals(resultado, esperado);
	}
	
	public void testAreaTriangulo () {
		Geometria calc = new Geometria();
		double resultado = calc.areatriangulo(5, 10);
		double esperado = 25;
		assertEquals(resultado, esperado);
	}
	
	public void testAreaRectangulo () {
		Geometria calc = new Geometria();
		int resultado = calc.arearectangulo(5, 10);
		int esperado = 50;
		assertEquals(resultado, esperado);
	}
	
	public void testAreaPentagono () {
		Geometria calc = new Geometria();
		double resultado = calc.areapentagono(5, 10);
		double esperado = 25;
		assertEquals(resultado, esperado);
	}
	
	public void testAreaRombo () {
		Geometria calc = new Geometria();
		double resultado = calc.arearombo(5, 10);
		double esperado = 25;
		assertEquals(resultado, esperado);
	}
	
	public void testAreaRomboide () {
		Geometria calc = new Geometria();
		int resultado = calc.arearomboide(5, 10);
		int esperado = 50;
		assertEquals(resultado, esperado);
	}
	
	public void testAreaTrapecio () {
		Geometria calc = new Geometria();
		double resultado = calc.areatrapecio(5, 10, 1);
		double esperado = 25;
		assertEquals(resultado, esperado);
	}
	
	public void testFigura () {
		Geometria calc = new Geometria();
		String s = calc.figura(9);
		System.out.println(s);
	}
	
	public void testGetId() {
		Geometria calc = new Geometria(2);
		System.out.println(calc.getId());
	}
	
	public void testSetId() {
		Geometria calc = new Geometria();
		calc.setId(5);
		System.out.println(calc.getId());
	}
	
	public void testGetNom() {
		Geometria calc = new Geometria(6);
		System.out.println(calc.getNom());
	}
	
	public void testSetNom() {
		Geometria calc = new Geometria(6);
		calc.setNom("Rombo");
		System.out.println(calc.getNom());
	}
	
	public void testGetArea() {
		Geometria calc = new Geometria(6);
		System.out.println(calc.getArea());
	}
	
	public void testSetArea() {
		Geometria calc = new Geometria(6);
		calc.setArea(50);
		System.out.println(calc.getArea());
	}
	
	public void testToString() {
		Geometria calc = new Geometria(6);
		calc.toString();
	}


}
