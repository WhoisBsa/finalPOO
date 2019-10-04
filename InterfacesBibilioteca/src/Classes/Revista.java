
package Classes;

public class Revista  extends Exemplar implements Interface{
    private String categoria;
    private String mesPublicacao;
    private String anoPublicacao;
    private String dataEntrega;
    private Editora editora;
    
    public Revista(){
        
    }
    
    public Revista(String titulo, int numPaginas, String categoria, String mesPublicacao, String anoPublicacao, Editora editora){
        super(titulo, numPaginas);
        this.categoria = categoria;
        this.mesPublicacao = mesPublicacao;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }
    
    @Override
    public void getDados() {
        System.out.println("INFORMAÇÕES DA REVISTA:");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Páginas: " + this.getNumPaginas());
        System.out.println("Editora: " + this.getEditora().getNome());
        System.out.println("Mês Publicação: " + this.getMesPublicacao());
        System.out.println("Ano Publicação: " + this.getAnoPublicacao());
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    @Override
    public void emprestar(String dataEntrega){
        System.out.println("A revista está emprestado até: " + dataEntrega);
    }
    
}
