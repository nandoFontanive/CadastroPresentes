public class Livro extends Presente{
    public Livro(int codigo, String descricao, double valor, int escalaDeDesejo, String autor, String editora){
        super(codigo, descricao, valor, escalaDeDesejo);
        this.autor = autor;
        this.editora = editora;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    private String autor;
    private String editora;


    public void exibeDados(){
        super.exibeDados();
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        }
}