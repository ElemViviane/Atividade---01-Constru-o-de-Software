package livros;

public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;

    public Livro(String titulo, String autor, String anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirLivro(){
        System.out.println("Livro: " + titulo + "\nAutor: " + autor + "\nAno Publicação: " + anoPublicacao);
    }
}


package livros;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A culpa é das estrelas", "John Green", "2013");
        livro1.exibirLivro();
    }
}
