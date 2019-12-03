package com.br.projetosqlite;

import java.sql.SQLException;

import com.br.banco_de_dados.CreateTable;
import com.br.conexoes.Conexao;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {		
		CreateTable createTable = new CreateTable();
		
		try {
			createTable.CreateTablePessoaFisica();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
