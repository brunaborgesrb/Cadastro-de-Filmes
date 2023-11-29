public class ListaCategorias {
    private NodePrincipal primeiro;
    private int qtd;
    private NodePrincipal ultimo;


    public void exibirCategorias() {
        NodePrincipal atual = primeiro;


        while (atual != null) {
            System.out.println(atual.getInfo().getDescricao());
            atual = atual.getProx();
        }
    }


    public Categoria buscarCategoria(String descricao) {
        NodePrincipal atual = primeiro;


        while (atual != null && !atual.getInfo().getDescricao().equals(descricao)) {
            atual = atual.getProx();
        }


        return (atual != null) ? atual.getInfo() : null;
    }


    public void removerCategoria(String descricao) {
        NodePrincipal atual = primeiro;


        while (atual != null && !atual.getInfo().getDescricao().equals(descricao)) {
            atual = atual.getProx();
        }


        if (atual != null) {


            if (atual.getAnte() != null) {
                atual.getAnte().setProx(atual.getProx());
            } else {
                primeiro = atual.getProx();
            }


            if (atual.getProx() != null) {
                atual.getProx().setAnte(atual.getAnte());
            } else {
                ultimo = atual.getAnte();
            }


            qtd--;
        }
    }


    public void inserirOrdenado(Categoria categoria) {
        NodePrincipal novoNode = new NodePrincipal(categoria);


        if (primeiro == null) {
            primeiro = novoNode;
            ultimo = novoNode;
        } else {
            NodePrincipal atual = primeiro;
            NodePrincipal anterior = null;


            while (atual != null && atual.getInfo().compareTo(categoria) < 0) {
                anterior = atual;
                atual = atual.getProx();
            }


            if (anterior == null) {
                novoNode.setProx(primeiro);
                primeiro.setAnte(novoNode);
                primeiro = novoNode;
            } else {
                anterior.setProx(novoNode);
                novoNode.setAnte(anterior);


                if (atual != null) {
                    novoNode.setProx(atual);
                    atual.setAnte(novoNode);
                } else {
                    ultimo = novoNode;
                }
            }
        }


        qtd++;
    }
}


