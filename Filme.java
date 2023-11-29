public class Filme implements Comparable <Filme>{
    private String titulo,genero, classificacao;
    private int ano;

    public Filme(String titulo, String genero, String classificacao, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.ano = ano;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getClassificacao() {
        return classificacao;
    }


    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Filme [titulo=" + titulo + ", genero=" + genero + ", classificacao=" + classificacao + ", ano=" + ano
                + "]";
    }


    public int compareTo(Filme outroFilme) {
        return this.titulo.compareTo(outroFilme.titulo);
    }
}

