package br.com.teste.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.helloworld.entity.Mensagem;
import br.com.teste.helloworld.entity.Produto;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@GetMapping("/inicio/{texto}/{numero}")
	public Mensagem inicio (@PathVariable String texto,@PathVariable int numero) {
		Mensagem msg = new Mensagem();
		msg.setTexto(texto);
		msg.setNumero(numero);
		return msg;
	}
	
	@GetMapping("/fim")
	public String fim () {
		return " Bye World! ";
	}
	
	@GetMapping("/produto/{codigo}")
	public Produto buscar (@PathVariable long codigo) {
		Produto prod = new Produto();
		prod.setCodigo(codigo);
		prod.setCodSgotica(1010);
		prod.setDescricao("Oculos");
		prod.setPreco(10.00);
		
		Produto prod1 = new Produto();
		prod1.setDescricao("Outra");
		return prod;
	}
	
}
