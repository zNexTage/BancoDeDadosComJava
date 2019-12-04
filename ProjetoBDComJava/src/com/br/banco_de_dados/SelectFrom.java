package com.br.banco_de_dados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.br.conexoes.Conexao;

public class SelectFrom {

	/**
	 * Realiza um select de pessoas de fisica
	 */
	public void SelectPessoaFisica() {
		StringBuilder sbCommand;
		Statement stmCommad;
		Connection connection;
		Conexao conexao;
		ResultSet resultadoConsulta;
		
		// Instancia o stringbuilder
		sbCommand = new StringBuilder();

		// Monta o comando
		sbCommand.append(" SELECT * ");
		sbCommand.append(" FROM TBL_PESSOA_FISICA ");
		
		try 
		{		
			
			//Realiza a conexao com o banco
			connection  = Conexao.RealizaConexao();
			
			//Cria um objeto statement
			stmCommad = connection.createStatement();
			
			//Executa a query e retorna os valores
			resultadoConsulta = stmCommad.executeQuery(sbCommand.toString());
			
			//Loop pelos dados retornados da query
			while(resultadoConsulta.next()) 
			{
				System.out.println("-------------------------------------------");
				System.out.println("ID: "+resultadoConsulta.getInt("ID_PESSOA_FISICA"));
				System.out.println("Nome: "+resultadoConsulta.getString("NOME"));
				System.out.println("Sobrenome: "+resultadoConsulta.getString("SOBRENOME"));
				System.out.println("Cpf: "+resultadoConsulta.getString("CPF"));
				
				System.out.println("-------------------------------------------");
			}
			
			//Fecha a conexao com o banco
			connection.close();
		}
		catch(SQLException sqlErr) 
		{
			System.out.println(sqlErr.getMessage());
		}
	}
}
