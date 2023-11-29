public class NodeSecundaria {
    private NodeSecundaria ante;
    private Filme info;
    private NodeSecundaria prox;


    public NodeSecundaria(NodeSecundaria ante, Filme info, NodeSecundaria prox) {
        this.ante = ante;
        this.info = info;
        this.prox = prox;
    }


    public NodeSecundaria getAnte() {
        return ante;
    }


    public void setAnte(NodeSecundaria ante) {
        this.ante = ante;
    }


    public Filme getInfo() {
        return info;
    }


    public void setInfo(Filme info) {
        this.info = info;
    }


    public NodeSecundaria getProx() {
        return prox;
    }


    public void setProx(NodeSecundaria prox) {
        this.prox = prox;
    }


}
