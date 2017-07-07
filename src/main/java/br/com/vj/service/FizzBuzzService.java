package br.com.vj.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public String fizzBuzz(Integer numero) {
		String result = Optional.of(numero)
				.map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : ""))
				.get();
		return result.isEmpty() ? Integer.toString(numero) : result;
	}
	
}
