/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acervo;

/**
 *
 * @author Aluno02
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int qtd_pag;
    private int ano;
    private String editora;
    private double valor;
    
    public void setTitulo(String titulo){
        if(titulo!=""){
            this.titulo=titulo;
        }
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        if(autor!=""){
            this.autor=autor;
        }
    }
    public String getAutor(){
        return this.autor;
    }
    public void setIsbn(String isbn){
        if(isbn!=""){
            this.isbn=isbn;
        }
    }
    public String getIsbn(){
        return this.isbn;
    }
    public void setQtd_pag(int qtd_pag){
        if(qtd_pag>0){
            this.qtd_pag=qtd_pag;
        }
    }
    public int getQtd_pag(){
        return this.qtd_pag;
    }
    public void setAno(int ano){
        if(ano>0){
            this.ano=ano;
        }
    }
    public int getAno(){
        return this.ano;
    }
    public void setEditora(String editora){
        if(editora!=""){
            this.editora=editora;
        }
    }
    public String getEditora(){
        return this.editora;
    }
    public void setValor(double valor){
        if(valor>0){
            this.valor=valor;
        }
    }
    public double getValor(){
        return this.valor;
    }
    public String Exibir(){
        return "titulo: "+this.getTitulo()+"\r\nautor: "+this.getAutor()+"\r\nisbn: "+this.getIsbn()+"\r\nano:"+this.getAno()+"\r\nquantidade de paginas: "+this.getQtd_pag()+"\r\neditora:"+this.getEditora()+"\r\nvalor unitario:"+this.getValor();
    }
    public double Vender(int qnt){
        return this.valor*qnt;
    }
}
