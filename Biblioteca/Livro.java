package entidades;

public class Livro {
    private String nome;
    private int id;
    private String assunto;
    private int edicao;
    private boolean emUso = false;

    public Livro(){
        this.nome = nome;
        this.id = id;
        this.edicao = edicao;

    }



    @Override
    public String toString() {
        return "Livro: " + '\'' +
                "nome = '" + nome + '\'' +
                ", id = " + id +
                ", assunto = '" + assunto + '\'' +
                ", edição = " + edicao +
                ", Situação = " + foiLocado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public boolean isEmUso() {
        return emUso;
    }

    public void setEmUso(boolean emUso) {
        this.emUso = emUso;
    }
    public String foiLocado(){
        if(emUso){
            return "Locado";
        }else{
            return "Disponível";
        }
    }
}
