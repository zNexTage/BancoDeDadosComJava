package com.br.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * @autor Christian de Oliveira
 * **/
public class Conexao {
	//Atributo de conexao com o banco de dados
	private Connection conexao;
	
	/**
	 * Realiza a conexão com o banco de dados 
	 * @return true - A conexao foi realizada
	 * @throws ClassNotFoundException 
	 */
	public boolean Conectar() throws ClassNotFoundException 
	{
		String sUrlConnection = "";
		
		try 
		{
			//Comando para abrir a biblioteca do Sqlite
			Class.forName("org.sqlite.JDBC");
			
			//Url de conexao
			sUrlConnection = "jdbc:sqlite:D:/Projetos JAVA/BancoDeDadosComJava/ProjetoBDComJava/src/com/br/banco_de_dados/banco_sqlite.db";
			
			//Conectar com o banco
			this.conexao = DriverManager.getConnection(sUrlConnection);
		}
		catch(SQLException sqlErr)
		{
			System.err.println(sqlErr.getMessage());
			
			return false; //Caso não conecte retorne falso
		}
		
		System.out.println("Conectou com o banco");
		
		return true; //Caso conecte retorna verdadeiro
	}
	
	/**
	 * Realiza a desconexao com o banco de dados
	 * @return true - Desconexao realizada
	 */
	public boolean Desconectar() 
	{
		
		try 
		{
			if(!this.conexao.isClosed()) 
			{
				this.conexao.close();
				
				System.out.println("Desconectoudo banco de dados");
			}		
			
		}
		catch(SQLException sqlErr) 
		{
			
		}
		return true; // Caso desconecte retorna verdadeiro
	}
}
