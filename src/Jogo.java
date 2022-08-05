public class Jogo extends Presente {
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private String plataforma;
    private String genero;

    public Jogo(int codigo, String descricao, double valor, int escalaDeDesejo, String plataforma, String genero){
        super(codigo, descricao, valor, escalaDeDesejo);
        this.plataforma = plataforma;
        this.genero = genero;
    }
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Plataforma: "+ plataforma);
        System.out.println("Genero: "+ genero);
    }
}