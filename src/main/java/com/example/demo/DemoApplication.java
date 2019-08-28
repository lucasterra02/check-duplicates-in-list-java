package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===========================================INICIO========================================================");

		String sql = "select *\n" + "from TABELA\n" + "order by transacao_id asc";

		// Resultado da query
		List<Expiracao> expiracoes = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Expiracao>(Expiracao.class));

		HashSet<Long> unique = new HashSet<>();
		List<Long> transacoes = new ArrayList<>();

		// Cria uma lista só do atributo que vc quer verificar se tem repetido
		for (Expiracao expiracao : expiracoes) {
			transacoes.add(expiracao.getTransacaoId());
		}

//		transacoes.add(370456L);
//		transacoes.add(370459L);

		boolean temRepetido = false;
		//Verifica se existe repetido na lista, caso entrar no IF é pq achou repetido
		for (Long t : transacoes) {
			if (!unique.add(t)) {
				temRepetido = true;
				System.out.println(t);
			}
		}

		System.out.println("Tem Repetido? " + temRepetido);
		System.out.println("===========================================FIM========================================================");
	}

}
