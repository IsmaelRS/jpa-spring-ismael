package br.ufc.quixada.npi.ui;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.service.PessoaService;

public class MainPessoa {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PessoaService ps = (PessoaService)ctx.getBean("pessoaServiceImpl");
		try {
			ps.insere();
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}
		
		List<Pessoa> l = ps.findAll();

	    for (Pessoa c : l) {
	    	System.out.println(c);
	    }
		ctx.close();
	}
	
}
