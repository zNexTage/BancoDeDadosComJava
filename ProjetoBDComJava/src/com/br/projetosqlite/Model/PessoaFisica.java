package com.br.projetosqlite.Model;
import java.util.*;

/**
 * 
 */
public class PessoaFisica extends DadosAdicionais {

    /**
     * Default constructor
     */
    public PessoaFisica() {
    }

    private int Id_Pessoa_Fisica;
    
    public int getId_Pessoa_Fisica() {
		return Id_Pessoa_Fisica;
	}

	public void setId_Pessoa_Fisica(int id_Pessoa_Fisica) {
		Id_Pessoa_Fisica = id_Pessoa_Fisica;
	}

	/**
     * 
     */
    private String Nome;

    /**
     * 
     */
    private String Sobrenome;

    /**
     * 
     */
    private String Email;

    /**
     * 
     */
    private String CPF;

    /**
     * 
     */
    private String RG;

    /**
     * 
     */
    private String EstadoCivil;

    /**
     * 
     */
    private String RegimeBens;

    /**
     * 
     */
    private String EstadoNaturalidade;

    /**
     * 
     */
    private String NomeDoPai;

    /**
     * 
     */
    private String NomeDaMae;

    /**
     * 
     */
    private char Sexo;

    /**
     * 
     */
    private String Escolaridade;

    /**
     * 
     */
    private String Profissao;

    /**
     * 
     */
    private String Anotacoes;

    /**
     * 
     */
    private Date DataNascimento;

    /**
     * @return
     */
    public String getNome() {
        // TODO implement here
        return this.Nome;
    }

    /**
     * @param value
     */
    public void setNome(String value) {
        this.Nome = value;
    }

    /**
     * @return
     */
    public String getSobrenome() {
        // TODO implement here
        return this.Sobrenome;
    }

    /**
     * @param value
     */
    public void setSobrenome(String value) {
    	this.Sobrenome = value;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return this.Email;
    }

    /**
     * @param value
     */
    public void setEmail(String value) {
    	this.Email = value;
    }

    /**
     * @return
     */
    public String getCPF() {
        // TODO implement here
        return this.CPF;
    }

    /**
     * @param value
     */
    public void setCPF(String value) {
    	this.CPF = value;
    }

    /**
     * @return
     */
    public String getRG() {
        // TODO implement here
        return this.RG;
    }

    /**
     * @param value
     */
    public void setRG(String value) {
    	this.RG = value;
    }

    /**
     * @return
     */
    public String getEstadoCivil() {
        // TODO implement here
        return this.EstadoCivil;
    }

    /**
     * @param value
     */
    public void setEstadoCivil(String value) {
    	this.EstadoCivil = value;
    }

    /**
     * @return
     */
    public String getRegimeBens() {
        // TODO implement here
        return this.RegimeBens;
    }

    /**
     * @param value
     */
    public void setRegimeBens(String value) {
    	this.RegimeBens = value;
    }

    /**
     * @return
     */
    public String getEstadoNaturalidade() {
        // TODO implement here
        return this.EstadoNaturalidade;
    }

    /**
     * @param value
     */
    public void setEstadoNaturalidade(String value) {
    	this.EstadoNaturalidade = value;
    }

    /**
     * @return
     */
    public String getNomeDoPai() {
        // TODO implement here
        return this.NomeDoPai;
    }

    /**
     * @param value
     */
    public void setNomeDoPai(String value) {
    	this.NomeDoPai = value;
    }

    /**
     * @return
     */
    public String getNomeDaMae() {
        // TODO implement here
        return this.NomeDaMae;
    }

    /**
     * @param value
     */
    public void setNomeDaMae(String value) {
    	this.NomeDaMae = value;
    }

    /**
     * @return
     */
    public char getSexo() {
        // TODO implement here
        return this.Sexo;
    }

    /**
     * @param value
     */
    public void setSexo(char value) {
    	this.Sexo = value;
    }

    /**
     * @return
     */
    public String getEscolaridade() {
        // TODO implement here
        return this.Escolaridade;
    }

    /**
     * @param value
     */
    public void setEscolaridade(String value) {
    	this.Escolaridade = value;
    }

    /**
     * @return
     */
    public String getProfissao() {
        // TODO implement here
        return this.Profissao;
    }

    /**
     * @param value
     */
    public void setProfissao(String value) {
    	this.Profissao = value;
    }

    /**
     * @return
     */
    public String getAnotacoes() {
        // TODO implement here
        return this.Anotacoes;
    }

    /**
     * @param value
     */
    public void setAnotacoes(String value) {
    	this.Anotacoes = value;
    }

    /**
     * @return
     */
    public Date getDataNascimento() {
        // TODO implement here
        return this.DataNascimento;
    }

    /**
     * @param value
     */
    public void setDataNascimento(Date value) {
    	this.DataNascimento = value;
    }

}