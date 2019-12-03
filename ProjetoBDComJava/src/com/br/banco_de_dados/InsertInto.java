package com.br.banco_de_dados;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.br.conexoes.Conexao;
import com.br.projetosqlite.Model.PessoaFisica;

public class InsertInto {

	public void InserirPessoaFisica(PessoaFisica pessoaFisica) {
		StringBuilder sqlCommand = null;
		PreparedStatement preparedStatement = null;
		Connection conexao;

		sqlCommand = new StringBuilder();

		// Monta o comando de inserção
		sqlCommand.append(
				" INSERT INTO TBL_PESSOA_FISICA (NOME, SOBRENOME, CPF, RG, ESTADOCIVIL, REGIMEBENS, ESTADONATURALIDADE, NOMEDOPAI, NOMEDAMAE, SEXO, ESCOLARIDADE, PROFISSAO, ANOTACOES, DATANASCIMENTO) ");
		sqlCommand.append(" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");

		try {
			conexao = Conexao.RealizaConexao(); // Realiza a conexao

			// Adiciona o comando e passa os parametros para o preparedstatement
			preparedStatement = conexao.prepareStatement(sqlCommand.toString());
			preparedStatement.setString(1, pessoaFisica.getNome());
			preparedStatement.setString(2, pessoaFisica.getSobrenome());
			preparedStatement.setString(3, pessoaFisica.getCPF());
			preparedStatement.setString(4, pessoaFisica.getRG());
			preparedStatement.setString(5, pessoaFisica.getEstadoCivil());
			preparedStatement.setString(6, pessoaFisica.getRegimeBens());
			preparedStatement.setString(7, pessoaFisica.getEstadoNaturalidade());
			preparedStatement.setString(8, pessoaFisica.getNomeDoPai());
			preparedStatement.setString(9, pessoaFisica.getNomeDaMae());
			preparedStatement.setString(10, String.valueOf(pessoaFisica.getSexo()));
			preparedStatement.setString(11, pessoaFisica.getEscolaridade());
			preparedStatement.setString(12, pessoaFisica.getProfissao());
			preparedStatement.setString(13, pessoaFisica.getAnotacoes());
			preparedStatement.setString(14, pessoaFisica.getDataNascimento().toString());
			
			//Executa o comando
			preparedStatement.executeUpdate();
			
			System.out.println("Cadastro realizado");
			
		} catch (SQLException sqlErr) {
			System.err.printf(sqlErr.getMessage());
		}
	}
}
