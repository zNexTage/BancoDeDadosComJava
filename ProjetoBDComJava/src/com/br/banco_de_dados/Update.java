package com.br.banco_de_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.br.conexoes.Conexao;
import com.br.projetosqlite.Model.PessoaFisica;

public class Update {
	
	/**
	 * Atualiza os dados da tabela Pessoa Fisica
	 * @param pessoaFisica
	 */
	public void AtualizarPessoaFisica(PessoaFisica pessoaFisica) 
	{
		StringBuilder sbCommand;
		Connection conn;
		PreparedStatement pstCommand;
		
		//Instancia o string builder
		sbCommand = new StringBuilder();
		
		//Montagem do comando para realizar o update
		sbCommand.append(" UPDATE TBL_PESSOA_FISICA ");
		sbCommand.append(" SET NOME = ?, SOBRENOME = ? WHERE ID_PESSOA_FISICA = ? ");
	
		//Cria o objeto de conexao
		conn = Conexao.RealizaConexao();		
		
		try 
		{
			//Cria o prepared statement para declararmos os parametros
			pstCommand = conn.prepareStatement(sbCommand.toString());
			
			//Atribui os parametros da query
			pstCommand.setString(1, pessoaFisica.getNome());
			pstCommand.setString(2, pessoaFisica.getSobrenome());
			pstCommand.setInt(3, pessoaFisica.getId_Pessoa_Fisica());
			
			//Executa a query
			pstCommand.executeUpdate();
			
			System.out.println("Dados atualizados");
			
			//Fecha a conexao
			conn.close();
		} 
		catch(SQLException sqlErr)
		{
			System.out.println(sqlErr.getMessage());
		}
	}
}
