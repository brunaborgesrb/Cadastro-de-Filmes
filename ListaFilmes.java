public class ListaFilmes {
    private NodeSecundaria primeiro;
    private int qtd;
    private NodeSecundaria ultimo;


    public void inserirOrdenado(NodeSecundaria novoNode) {
        if (primeiro == null) {
            primeiro = novoNode;
            ultimo = novoNode;
        } else {
            NodeSecundaria atual = primeiro;
            NodeSecundaria anterior = null;


            while (atual != null && atual.getInfo().compareTo(novoNode.getInfo()) < 0) {
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


    public void removerFilme(String titulo) {
        NodeSecundaria atual = primeiro;


        while (atual != null && !atual.getInfo().getTitulo().equals(titulo)) {
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


    public Filme buscarFilme(String titulo) {
        NodeSecundaria atual = primeiro;


        while (atual != null && !atual.getInfo().getTitulo().equals(titulo)) {
            atual = atual.getProx();
        }


        return (atual != null) ? atual.getInfo() : null;
    }


    public void exibirFilmes() {
        NodeSecundaria atual = primeiro;


        while (atual != null) {
            System.out.println(atual.getInfo().toString());
            atual = atual.getProx();
        }
    }
}

