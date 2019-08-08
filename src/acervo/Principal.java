/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acervo;

/**
 *
 * @author Usuário
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro tr= new Livro();
        tr.setTitulo("as lindas traças de um careca");
        tr.setAutor("paula Tejando");
        tr.setIsbn("p@rr4");
        tr.setQtd_pag(502);
        tr.setAno(1987);
        tr.setEditora("autismoComics");
        tr.setValor(15.50);
        
        System.out.println(tr.Exibir());
        tr.Vender(6);
    }
    
}
