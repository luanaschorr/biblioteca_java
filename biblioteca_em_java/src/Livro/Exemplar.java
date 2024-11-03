package Livro;
import java.time.LocalDate;


public class Exemplar {

	private int id;
	private String titulo;
	private LocalDate dataPubliacao;
	private int estante;
	private int quantidade;
	
	public Exemplar(int id, String titulo, LocalDate dataPublicacao, int estante, int quantidade) {
		
		this.id = id;
		this.titulo = titulo;
		this.dataPubliacao = dataPublicacao;
		this.estante = estante;
		this.quantidade = quantidade;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataPubliacao() {
		return dataPubliacao;
	}

	public void setDataPubliacao(LocalDate dataPubliacao) {
		this.dataPubliacao = dataPubliacao;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
