import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCategorias listaCategorias = new ListaCategorias();
        Scanner s =  new Scanner(System.in);
        int opcao;
        do {
            exibirMenu();
            opcao = s.nextInt();


            switch (opcao) {
                case 1:
                    cadastrarFilme(listaCategorias, s);
                    break;
                case 2:
                    removerFilme(listaCategorias, s);
                    break;
                case 3:
                    exibirDadosFilme(listaCategorias, s);
                    break;
                case 4:
                    editarDadosFilme(listaCategorias, s);
                    break;
                case 5:
                    exibirTodosFilmes(listaCategorias);
                    break;
                case 6:
                    exibirFilmesPorCategoria(listaCategorias, s);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);


        s.close();
    }


    private static void exibirMenu() {
        System.out.println("\n==== Menu ====");
        System.out.println("1. Cadastrar Filme");
        System.out.println("2. Remover Filme");
        System.out.println("3. Exibir Dados do Filme");
        System.out.println("4. Editar Dados do Filme");
        System.out.println("5. Exibir Todos os Filmes");
        System.out.println("6. Exibir Filmes por Categoria");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    private static void cadastrarFilme(ListaCategorias listaCategorias, Scanner s) {
        s.nextLine(); 
        System.out.print("Digite o título do filme: ");
        String titulo = s.nextLine();
        System.out.print("Digite o gênero do filme: ");
        String genero = s.nextLine();
        System.out.print("Digite a classificação do filme: ");
        String classificacao = s.nextLine();
        System.out.print("Digite o ano do filme: ");
        int ano = s.nextInt();
        s.nextLine(); 
        System.out.print("Digite a categoria do filme: ");
        String categoriaDescricao = s.nextLine();


        Categoria categoria = listaCategorias.buscarCategoria(categoriaDescricao);


        if (categoria == null) {
            categoria = new Categoria(categoriaDescricao);
            listaCategorias.inserirOrdenado(categoria);
        }


        Filme filme = new Filme(titulo, genero, classificacao, ano);
        NodeSecundaria novoNodeFilme = new NodeSecundaria(filme);


        categoria.getLista().inserirOrdenado(novoNodeFilme);
        System.out.println("Filme cadastrado com sucesso!");
    }


    private static void removerFilme(ListaCategorias listaCategorias, Scanner s) {
        s.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite o título do filme a ser removido: ");
        String titulo = s.nextLine();


        boolean removido = listaCategorias.removerFilme(titulo);


        if (removido) {
            System.out.println("Filme removido com sucesso!");
        } else {
            System.out.println("Filme não cadastrado.");
        }
    }


    private static void exibirDadosFilme(ListaCategorias listaCategorias, Scanner s) {
        s.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite o título do filme a ser consultado: ");
        String titulo = s.nextLine();


        Filme filme = listaCategorias.buscarFilme(titulo);


        if (filme != null) {
            System.out.println(filme.toString());
        } else {
            System.out.println("Filme não cadastrado.");
        }
    }


    private static void editarDadosFilme(ListaCategorias listaCategorias, Scanner scanner) {
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite o título do filme a ser editado: ");
        String titulo = scanner.nextLine();


        boolean editado = listaCategorias.editarFilme(titulo, scanner);


        if (editado) {
            System.out.println("Dados do filme editados com sucesso!");
        } else {
            System.out.println("Filme não cadastrado.");
        }
    }

    private static void exibirTodosFilmes(ListaCategorias listaCategorias) {
        listaCategorias.exibirTodosFilmes();
    }

    private static void exibirFilmesPorCategoria(ListaCategorias listaCategorias, Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Digite a categoria desejada: ");
        String categoriaDescricao = scanner.nextLine();

        Categoria categoria = listaCategorias.buscarCategoria(categoriaDescricao);


        if (categoria != null) {
            categoria.getLista().exibirFilmes();
        } else {
            System.out.println("Categoria não cadastrada.");
        }
    }
    }

