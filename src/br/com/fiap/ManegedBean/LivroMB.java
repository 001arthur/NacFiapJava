package br.com.fiap.ManegedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.DAO.LivroDAO;
import br.com.fiap.Model.Livro;

@ManagedBean
@SessionScoped
public class LivroMB {
	
	private Livro livro;
	private GeralMB mb = new GeralMB();
	private List<Livro> livros;
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LivroMB(){
		livro = new Livro();
		//ListarLivros = new ArrayList<Livro>();

	}
	
	public String cadastrarLivro(){
		try{
		LivroDAO dao = new LivroDAO();
		dao.inserirLivro(livro);
		mb.setSucesso("Livro cadastrado com sucesso");
		return "Erro";
		}
		catch(Exception ex){
			mb.setErro(ex.getMessage());
			return "Erro";
		}
	}
	public List<Livro> getLivros(){
		LivroDAO l = new LivroDAO();
		livros = l.listarLivros();
		return livros;
	}

	public void setLivros(ArrayList<Livro> listarLivros) {
		this.livros = listarLivros;
	}
	
	public String abrirCadastroEditar(){

		System.out.println("OSIDASOIDHASIUDHAOSIUDAHSD ----> " + livro.getNomeLivro());
		try{
			LivroDAO dao = new LivroDAO();
			livro = dao.pesquisarLivro(livro.getId());
			System.out.println("OSIDASOIDHASIUDHAOSIUDAHSD ----> " + livro.getNomeLivro());
			return "Cadastro_livro";
		}
		catch(Exception e){
			String erro = e.getMessage();
			return "erro";
		}
	}
	
}
