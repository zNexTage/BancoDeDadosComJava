package com.br.projetosqlite;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import com.br.banco_de_dados.CreateTable;
import com.br.banco_de_dados.InsertInto;
import com.br.conexoes.Conexao;
import com.br.projetosqlite.Model.PessoaFisica;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {		
		CreateTable createTable = new CreateTable();
		InsertInto insertInto = null;
		PessoaFisica pessoaFisica;
		Calendar calendario;
		Date dtAniversario;
		
		try {
			createTable.CreateTablePessoaFisica();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Instancia a classe para podermos inserir dados na tabela de pessoas fisica
		insertInto = new InsertInto();
		
		pessoaFisica = new PessoaFisica();
		
		pessoaFisica.setNome("Ayanami");
		pessoaFisica.setSobrenome("Rei");
		pessoaFisica.setCPF("444.666.111-80");
		pessoaFisica.setRG("40.410.589-80");
		pessoaFisica.setEstadoCivil("Solteira");
		pessoaFisica.setRegimeBens("-");
		pessoaFisica.setEstadoNaturalidade("Tókio");
		pessoaFisica.setNomeDoPai("Não mencionado");
		pessoaFisica.setNomeDaMae("Não mencionado");
		pessoaFisica.setSexo('F');
		pessoaFisica.setEscolaridade("Não mencionado");
		pessoaFisica.setProfissao("Piloto de mecha");
		pessoaFisica.setAnotacoes("Seria rei a mâe de Shinji?");
		
		calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DATE, 30);
		calendario.set(Calendar.MONTH, 03);
		calendario.set(Calendar.YEAR, 2003);
		
		dtAniversario = calendario.getTime();
		
		pessoaFisica.setDataNascimento(dtAniversario);
		
		insertInto.InserirPessoaFisica(pessoaFisica);
	}

}
