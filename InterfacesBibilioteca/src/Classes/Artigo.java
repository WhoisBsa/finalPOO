
package Classes;

public class Artigo  extends Exemplar{
    private String anoPublicacao;
    private String nomeConferencia;
    
    public Artigo(){
        
    }
    
    public Artigo(String titulo, int numPaginas, String anoPublicacao, String nomeConferencia){
        super(titulo, numPaginas);
        this.anoPublicacao = anoPublicacao;
        this.nomeConferencia = nomeConferencia;
    }
    
    @Override
    public void getDados() {
        System.out.println("INFORMAÇÕES DO ARTIGO:");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Páginas: " + this.getNumPaginas());
        System.out.println("Ano Publicação: " + this.getAnoPublicacao());
        System.out.println("Conferência: " + this.getNomeConferencia());
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getNomeConferencia() {
        return nomeConferencia;
    }

    public void setNomeConferencia(String nomeConferencia) {
        this.nomeConferencia = nomeConferencia;
    }
    
}
