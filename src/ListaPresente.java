public class ListaPresente {
    private int contador;
    private Presente lista1[];

    public ListaPresente(int tamanho){
    lista1 = new Presente [tamanho];
    }
    public void adicionaPresenteLista(Presente pres1){
        lista1[contador++] = pres1;
        System.out.println("Presente adicionado!");
        pres1.exibeDados();
    }
    public void visualizaListaPresentes(){
        for (int i = 0; i < contador; i++) {
            if (lista1[i] instanceof Livro){
                System.out.println("O presente eh um livro!");
                lista1[i].exibeDados();}
            else if (lista1[i] instanceof Jogo){
                System.out.println("O presente eh um jogo!");
                lista1[i].exibeDados();}
        }
    }
    public void visualizaListaPresentesFaixaValor(double valor1, double valor2){
        for (int i = 0; i < contador; i++) {
            if ((lista1[i].getValor() >= valor1) && (lista1[i].getValor() <= valor2)) {
                if (lista1[i] instanceof Livro){
                    System.out.println("O presente eh um livro!");
                    lista1[i].exibeDados();}
                else if (lista1[i] instanceof Jogo){
                    System.out.println("O presente eh um jogo!");
                    lista1[i].exibeDados();}}
            else
                System.out.println("Nenhum presente encontrado nessa faixa de valores!");
            }
            }

    public void pesquisaPresente(String busca1){
        for (int i = 0; i < contador; i++) {
            if ((lista1[i].getDescricao()).equalsIgnoreCase(busca1))
                lista1[i].exibeDados();
            else
                System.out.println("Nenhum presente encontrado com a descricao digitada!");
        }
    }
}