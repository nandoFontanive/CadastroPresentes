public abstract class Presente {
    private int codigo;
    private String descricao;
    private double valor;
    private int escalaDeDesejo;

    public Presente(int codigo, String descricao, double valor, int escalaDeDesejo){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.escalaDeDesejo = escalaDeDesejo;
    }

    public double getValor() {
        return valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEscalaDeDesejo() {
        if (escalaDeDesejo == 1)
            return "Nao vivo sem este presente";
        if (escalaDeDesejo == 2)
            return "Quero demais este presente";
        else
            return "Este presente eh legal";
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEscalaDeDesejo(int escalaDeDesejo) {
        this.escalaDeDesejo = escalaDeDesejo;
    }
    public void exibeDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Escala: " + escalaDeDesejo);
    }
}
