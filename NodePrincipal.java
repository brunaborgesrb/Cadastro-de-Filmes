public class NodePrincipal {
    private NodePrincipal ante;
    private Categoria info;
    private NodePrincipal prox;

    public NodePrincipal(NodePrincipal ante, Categoria info, NodePrincipal prox) {
        this.ante = ante;
        this.info = info;
        this.prox = prox;
    }


    public NodePrincipal(Categoria categoria) {
    }


    public NodePrincipal getAnte() {
        return ante;
    }


    public void setAnte(NodePrincipal ante) {
        this.ante = ante;
    }


    public Categoria getInfo() {
        return info;
    }


    public void setInfo(Categoria info) {
        this.info = info;
    }


    public NodePrincipal getProx() {
        return prox;
    }


    public void setProx(NodePrincipal prox) {
        this.prox = prox;
    }

}
