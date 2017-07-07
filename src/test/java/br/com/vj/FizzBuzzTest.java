package br.com.vj;

import org.junit.Before;
import org.junit.Test;

import br.com.vj.service.FizzBuzzService;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	private FizzBuzzService service;
	
	@Before
	public void setUp() {
		service = new FizzBuzzService();
	}
	
	@Test
	public void deveTestarSeNumeroTresEFizz() {
		Integer numero = 3;
		String retorno = service.fizzBuzz(numero);
		assertEquals(retorno, "Fizz");
	}
	
	@Test
	public void deveTestarSeNumero5EBuzz() {
		Integer numero = 5;
		String retorno = service.fizzBuzz(numero);
		assertEquals(retorno, "Buzz");
	}
	
	@Test
	public void deveTestarSeNumero15EFizzBuzz() {
		Integer numero = 15;
		String retorno = service.fizzBuzz(numero);
		assertEquals(retorno, "FizzBuzz");
	}
	
	@Test
	public void deveTestarRetornoDeNumeroDiferente() {
		Integer numero = 7;
		String retorno = service.fizzBuzz(numero);
		assertEquals(retorno, String.valueOf(numero));
	}
}
