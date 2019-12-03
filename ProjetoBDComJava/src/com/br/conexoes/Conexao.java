package com.br.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * @autor Christian de Oliveira
 * **/
public class Conexao {
	//Atributo de conexao com o banco de dados
	private Connection conexao;	
	
	//Url de conexao
	private String sUrlConnection = "jdbc:sqlite:D:/Projetos JAVA/BancoDeDadosComJava/ProjetoBDComJava/src/com/br/banco_de_dados/banco_sqlite.db";
	/**
	 * Realiza a conexão com o banco de dados 
	 * @return true - A conexao foi realizada
	 * @throws ClassNotFoundException 
	 */
	public boolean Conectar() throws ClassNotFoundException 
	{		
		try 
		{
			//Comando para abrir a biblioteca do Sqlite
			Class.forName("org.sqlite.JDBC");
			
			
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
	
	/**
	 * Cria e retorna um statement
	 * @return
	 */
	public Statement CreateStatement() 
	{
		try {
			return conexao.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Outra forma de se realiza conexao com o banco de dados
	 * @return
	 */
	public static Connection RealizaConexao() 
	{
		String sUrlConnection = "jdbc:sqlite:D:/Projetos JAVA/BancoDeDadosComJava/ProjetoBDComJava/src/com/br/banco_de_dados/banco_sqlite.db";
		Connection conn = null;
		
		try 
		{
			//Estabelece a url de conexao com o banco de dados
			conn = DriverManager.getConnection(sUrlConnection);
		}
		catch (SQLException sqlErr) 
		{
			System.err.println(sqlErr.getMessage());
		}
		
		//Retorna a conexao
		return conn;
	}
}
