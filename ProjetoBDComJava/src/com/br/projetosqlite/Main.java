package com.br.projetosqlite;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import com.br.banco_de_dados.CreateTable;
import com.br.banco_de_dados.Delete;
import com.br.banco_de_dados.InsertInto;
import com.br.banco_de_dados.SelectFrom;
import com.br.banco_de_dados.Update;
import com.br.conexoes.Conexao;
import com.br.projetosqlite.Model.PessoaFisica;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		CreateTable createTable = new CreateTable();
		InsertInto insertInto = null;
		PessoaFisica pessoaFisica;
		Calendar calendario;
		Date dtAniversario;
		SelectFrom selectFrom;
		Update AtualizarDados;
		Delete delete = null;

		try {
			createTable.CreateTablePessoaFisica();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Instancia a classe para podermos inserir dados na tabela de pessoas fisica
		/*
		 * insertInto = new InsertInto();
		 * 
		 * pessoaFisica = new PessoaFisica();
		 * 
		 * pessoaFisica.setNome("Asuka"); pessoaFisica.setSobrenome("Langley");
		 * pessoaFisica.setCPF("451.214.545-90"); pessoaFisica.setRG("30.310.559-70");
		 * pessoaFisica.setEstadoCivil("Solteira"); pessoaFisica.setRegimeBens("-");
		 * pessoaFisica.setEstadoNaturalidade("Tókio");
		 * pessoaFisica.setNomeDoPai("Não mencionado");
		 * pessoaFisica.setNomeDaMae("Não mencionado"); pessoaFisica.setSexo('F');
		 * pessoaFisica.setEscolaridade("Não mencionado");
		 * pessoaFisica.setProfissao("Piloto de mecha");
		 * pessoaFisica.setAnotacoes("Nada a declarar");
		 * 
		 * calendario = Calendar.getInstance();
		 * 
		 * calendario.set(Calendar.DATE, 12); calendario.set(Calendar.MONTH, 04);
		 * calendario.set(Calendar.YEAR, 2001);
		 * 
		 * dtAniversario = calendario.getTime();
		 * 
		 * pessoaFisica.setDataNascimento(dtAniversario);
		 * 
		 * insertInto.InserirPessoaFisica(pessoaFisica);
		 */

		// Instancia a classe de update
		AtualizarDados = new Update();

		// Instancia a class de pessoas fisicas
		pessoaFisica = new PessoaFisica();

		// Seta os valores parfa o update
		pessoaFisica.setId_Pessoa_Fisica(2);
		pessoaFisica.setNome("SORYU");
		pessoaFisica.setSobrenome("ASUKA");
		pessoaFisica.setCPF("562.859.748-90");

		// Chama o metodo para atualzar os dados
		AtualizarDados.AtualizarPessoaFisica(pessoaFisica);

		// Instancia a classe para realiza a consulta
		selectFrom = new SelectFrom();

		// Realiza um select do dados
		selectFrom.SelectPessoaFisica();

		// Instancia a classe que deleta dados do banco de dados.
		delete = new Delete();

		// Deleta a pessoa pelo id
		delete.DeletarPessoaFisica(2);

		// Realiza um select do dados
		selectFrom.SelectPessoaFisica();
	}

}
