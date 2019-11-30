package com.br.projetosqlite;

import com.br.conexoes.Conexao;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {		
		Conexao conexao;
		
		//Instanciar a classe conexao
		conexao = new Conexao();
		
		conexao.Conectar();
		conexao.Desconectar();
	}

}
