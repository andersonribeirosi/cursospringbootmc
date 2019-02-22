package com.andersonribeiro.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andersonribeiro.cursomc.domain.Categoria;
import com.andersonribeiro.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursospringbootmcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursospringbootmcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Eletrodomésticos");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
