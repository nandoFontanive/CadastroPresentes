import java.util.Scanner;
public class TesteListaPresentes {
    public static void main(String[] args) {
        ListaPresente lp = new ListaPresente(2);
        Scanner leia = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("*** MENU ***\n" +
                    "*** [ 1 ] ADICIONAR PRESENTE ***\n" +
                    "*** [ 2 ] VISUALIZAR TODOS PRESENTES ***\n" +
                    "*** [ 3 ] VISUALIZAR PRESENTES\tENTRE FAIXA DE VALOR ***\n" +
                    "*** [ 4 ] PESQUISAR PRESENTES ***\n" +
                    "*** [ 0 ] ENCERRAR SISTEMA. ***");

            System.out.println("DIGITE A ESCOLHA DESEJADA (1 A 4, 0 PARA SAIR): ");
            escolha = leia.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("--- ADICIONAR PRESENTE ---");
                    System.out.println("- Deseja adicionar um livro (1) ou jogo (2)? -");

                    int escolhaPresenteJogo = leia.nextInt();
                    leia.nextLine();
                    Presente pr1 = null;
                    if (escolhaPresenteJogo == 1) {
                        System.out.println("Digite o codigo do livro: ");
                        int novoCodigo = leia.nextInt();
                        leia.nextLine();
                        System.out.println("Digite a descricao do livro: ");
                        String novoDescricao = leia.nextLine();
                        System.out.println("Digite o valor do livro: ");
                        double novoValor = leia.nextDouble();
                        System.out.println("Digite o quanto quer esse presente, 1-N?o vivo sem este presente 2-Quero demais este presente 3-Este presente ? legal: ");
                        int novoEscala = leia.nextInt();
                        leia.nextLine();
                        System.out.println("Digite o autor do livro: ");
                        String novoAutor = leia.nextLine();
                        System.out.println("Digite a editora do livro: ");
                        String novoEditora = leia.nextLine();
                        pr1 = new Livro(novoCodigo, novoDescricao, novoValor, novoEscala, novoAutor, novoEditora);
                        System.out.println("Livro adicionado!");
                    }

                    else if(escolhaPresenteJogo == 2){
                        System.out.println("Digite o codigo do jogo: ");
                        int novoCodigo = leia.nextInt();
                        leia.nextLine();
                        System.out.println("Digite a descricao do jogo: ");
                        String novoDescricao = leia.nextLine();
                        System.out.println("Digite o valor do jogo: ");
                        double novoValor = leia.nextDouble();
                        System.out.println("Digite o quanto quer esse presente, 1-N?o vivo sem este presente 2-Quero demais este presente 3-Este presente ? legal: ");
                        int novoEscala = leia.nextInt();
                        leia.nextLine();
                        System.out.println("Digite a plataforma do jogo: ");
                        String novoPlataforma = leia.nextLine();
                        System.out.println("Digite o genero do jogo: ");
                        String novoGenero = leia.nextLine();
                        pr1 = new Jogo(novoCodigo, novoDescricao, novoValor, novoEscala, novoPlataforma, novoGenero);
                        System.out.println("Jogo adicionado!");
                    }

                    lp.adicionaPresenteLista(pr1);//lp1 recebe array pr1, independente de ser livro ou jogo
                    break;

                case 2:
                System.out.println("--- VISUALIZAR TODOS PRESENTES ---");
                lp.visualizaListaPresentes();
                break;

                case 3:
                    System.out.println("--- VISUALIZAR PRESENTE ENTRE FAIXA DE VALOR ---");
                    System.out.println("Digite o valor minimo para o presente: ");
                    double valor1 = leia.nextInt();
                    System.out.println("Digite o valore maximo para o presente: ");
                    double valor2 = leia.nextInt();
                    leia.nextLine();//limpa buffer
                    lp.visualizaListaPresentesFaixaValor(valor1, valor2);
                    break;

                case 4:
                    leia.nextLine();
                    System.out.println("*** PESQUISAR PRESENTES  ***");
                    System.out.println("Digite a descricao do presente para pesquisar: ");
                    String descricao = leia.nextLine();
                    lp.pesquisaPresente(descricao);
                    break;

                case 0:
                    System.out.println("*** FINALIZANDO PROGRAMA ***");
                    break;

                default:
                    System.out.println("*** OPCAO INVALIDA, REINICIANDO O PROGRAMA ***");
                }

        }while (escolha != 0);
    }
}