package br.com.fiap.DAO;

import java.util.ArrayList;

import br.com.fiap.Model.Livro;

public class tests {

	public static void main(String[] args) {
		LivroDAO l = new LivroDAO();
		
							//Adicionar livro
		//Livro livro = new Livro(1, 2, 100, 1, "lalala2", 1, 1, 1);
		//l.inserirLivro(livro);
		
							//Listar todos os livros
		/*ArrayList<Livro> livroArray = l.listarLivros();
		for (Livro livro2 : livroArray) {
			System.out.println("Nome:"+livro2.getNomeLivro()+"\n");
		}*/
		
							//Remover Livro
		//l.removerLivro(6);
		
							//Alterar Livro
		//Livro livro = new Livro(1, 2, 100, 1, "Blevers2", 1, 1, 1);
		//l.alterarLivro(livro, 5);
		
		//Pesquisar livro (nome)
		/*ArrayList<Livro> livroArray = l.pesquisarLivro("lalasdfsd");
		System.out.println(livroArray.size());
		for (Livro livro2 : livroArray) {
			System.out.println("Nome:"+livro2.getNomeLivro()+"\n");
		}*/
	}

}
