package Aula02;

public class Livro {
    String TituloLivro;
    String NomeAutor;
    String NomeEditora;
    Integer AnoPublicacao;
    Integer QuantidadeLivros;
    Integer QuantidadeDisponivel;

    public Livro(String TituloLivro, String NomeAutor, String NomeEditora,
                 Integer AnoPublicacao, Integer QuantidadeLivro, Integer QuantidadeDisponivel){
        this.TituloLivro = TituloLivro;
        this.NomeAutor = NomeAutor;
        this.NomeEditora = NomeEditora;
        this.AnoPublicacao = AnoPublicacao;
        this.QuantidadeLivros = QuantidadeLivros;
        this.QuantidadeDisponivel = QuantidadeDisponivel;
    }
    public void exibir(){
        System.out.println("========Livro========");
        System.out.println("Titulo do seu livro: " + this.TituloLivro);
        System.out.println("Nome do autor: " + this.NomeAutor);
        System.out.println("Nome da editora: " + this.NomeEditora);
        System.out.println("Ano de publicação do livro: " + this.AnoPublicacao);
        System.out.println("Quantidade de livros: " + this.QuantidadeLivros);
        System.out.println("Quantidade de livros disponivel: " + this.QuantidadeDisponivel);
    }
}

