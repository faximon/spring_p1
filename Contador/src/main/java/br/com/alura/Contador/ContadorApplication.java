package br.com.alura.Contador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bem vindo ao contador!");
		System.out.println("----------------------");
		System.out.println("Digite um número para contagem: ");
		Scanner input = new Scanner(System.in);
		var numero = input.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("--------------------");

		Tarefa tarefa = new Tarefa("assistir aula 1", false, "João");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Dados salvos no arquivo tarefa.json!");

		Tarefa tarefaLida = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida do JSON:");
		System.out.println(tarefaLida);

	}
}
