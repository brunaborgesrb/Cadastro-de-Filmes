public class Categoria implements Comparable<Categoria> {
    private String descricao;
    private ListaFilmes lista;

    public Categoria(String descricao, ListaFilmes lista) {
        this.descricao = descricao;
        this.lista = lista;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public ListaFilmes getLista() {
        return lista;
    }
    public void setLista(ListaFilmes lista) {
        this.lista = lista;
    }
   
    public String toString() {
        return "Categoria [descricao=" + descricao + ", lista=" + lista + "]";
    }
    
    public int compareTo(Categoria outraCategoria) {
        return this.descricao.compareTo(outraCategoria.descricao);
    }
}

