
package Classes;

public class Livro extends Exemplar implements Interface{
    protected Editora editora;
    private String anoPublicacao;
    private String dataEntrega;
    
    
    public Livro(){
        
    }
    
    public Livro(String titulo, int numPaginas, Editora editora, String anoPublicacao){
        super(titulo, numPaginas);
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
    
    @Override
    public void getDados() {
        System.out.println("INFORMAÇÕES DO LIVRO:");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Páginas: " + this.getNumPaginas());
        System.out.println("Editora: " + this.getEditora().getNome());
        System.out.println("Ano Publicação: " + this.getAnoPublicacao());
    }
    
    @Override
    public void emprestar(String dataEntrega){
        System.out.println("O livro está emprestado até: " + dataEntrega);
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
}
