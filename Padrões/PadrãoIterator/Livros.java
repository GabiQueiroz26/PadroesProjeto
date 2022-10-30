public class Livros {
    private String nomeLivro;
    private String editora;
    private int idLivro;
    
    public Livros(String nomeLivro, String editora, int idLivro) {
        this.nomeLivro = nomeLivro;
        this.editora = editora;
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    
    
}
