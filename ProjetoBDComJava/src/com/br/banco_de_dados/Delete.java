package com.br.banco_de_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.br.conexoes.Conexao;

public class Delete {

	/**
	 * Deleta uma pessoa fisica do banco de dados
	 */
	public void DeletarPessoaFisica(int Id) 
	{
		Connection con;
		PreparedStatement prepareCommand;
		StringBuilder sbCommand;
		
		try 
		{
			//Realiza a conexao
			con = Conexao.RealizaConexao();
			
			//Instancia um novo string builder
			sbCommand = new StringBuilder();
			
			//Monta o comando
			sbCommand.append(" DELETE FROM TBL_PESSOA_FISICA WHERE ID_PESSOA_FISICA = ? ");
			
			//Adiciona o comando ao prepare statement
			prepareCommand = con.prepareStatement(sbCommand.toString());
			
			//Seta o parametro
			prepareCommand.setInt(1, Id);
			
			//Executa a query
			prepareCommand.executeUpdate();
		}
		catch(SQLException sqlErr) 
		{
			System.err.println(sqlErr.getMessage());
		}
	}
}
