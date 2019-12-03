package com.br.banco_de_dados;

import java.sql.SQLException;
import java.sql.Statement;

import com.br.conexoes.Conexao;

/*
 * @autor Christian de Oliveira Bueno
 * */
public class CreateTable {
	public void CreateTablePessoaFisica() throws SQLException 
	{
		String sUrlConnection;
		StringBuilder sSqlCommand;
		Conexao conexao;
		Statement command;
		
		//Url da conexao
		sUrlConnection = "jdbc:sqlite:D:/Projetos JAVA/BancoDeDadosComJava/ProjetoBDComJava/src/com/br/banco_de_dados/banco_sqlite.db";
		
		//Cria um novo StringBuilder
		sSqlCommand = new StringBuilder();
		
		//SQl statemente para criar uma nova tabela
		//Monta a query para criar a tabela de pessoas fisicas
		sSqlCommand.append("CREATE TABLE IF NOT EXISTS TBL_PESSOA_FISICA \n"); //ID_PESSOA_FISICA INTEGER PRIMARY KEY, \n
		sSqlCommand.append("(\n");
		sSqlCommand.append("ID_PESSOA_FISICA INTEGER PRIMARY KEY, \n");
		sSqlCommand.append("NOME TEXT NOT NULL, \n");
		sSqlCommand.append("SOBRENOME TEXT NOT NULL, \n");
		sSqlCommand.append("CPF TEXT NOT NULL, \n");
		sSqlCommand.append("RG TEXT NOT NULL, \n");
		sSqlCommand.append("ESTADOCIVIL TEXT NOT NULL, \n");
		sSqlCommand.append("REGIMEBENS TEXT NOT NULL, \n");
		sSqlCommand.append("ESTADONATURALIDADE TEXT NOT NULL, \n");
		sSqlCommand.append("NOMEDOPAI TEXT NOT NULL, \n");
		sSqlCommand.append("NOMEDAMAE TEXT NOT NULL, \n");
		sSqlCommand.append("SEXO CHARACTER NOT NULL, \n");
		sSqlCommand.append("ESCOLARIDADE TEXT NOT NULL, \n");
		sSqlCommand.append("PROFISSAO TEXT NOT NULL, \n");
		sSqlCommand.append("ANOTACOES TEXT NOT NULL, \n");
		sSqlCommand.append("DATANASCIMENTO DATE NOT NULL \n");
		sSqlCommand.append(");");
		
		conexao = new Conexao();
		
		//Inicia a conexao com o banco de dados
		try {
			conexao.Conectar();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Cria um statement
		command = conexao.CreateStatement();
		
		//Executa o comando
		command.execute(sSqlCommand.toString());
		
		//Desconecta do banco 
		conexao.Desconectar();
	}
}
