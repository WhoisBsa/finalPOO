
package Classes;

public abstract class Exemplar {
    protected String titulo;
    protected int numPaginas;
    
    public Exemplar(){
        
    }
    
    public Exemplar(String titulo, int numPaginas){
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the numPaginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    /**
     * @param numPaginas the numPaginas to set
     */
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public abstract void getDados();
    
}
