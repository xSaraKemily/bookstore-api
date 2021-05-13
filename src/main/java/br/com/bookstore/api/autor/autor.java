/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bookstore.api.autor;

import java.util.Date;

/**
 *
 * @author sarak
 */
public class Autor {
    private int id;
    private String nome;
    private Date dataNascimento;
    private Genero genero;

    public Autor(){
    }
    
     public Autor(int id, String nome, Date dataNascimento, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public Autor(String nome, Date dataNascimento, Genero genero) {  
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
     
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
}
