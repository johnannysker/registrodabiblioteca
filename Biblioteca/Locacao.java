package entidades;

import java.util.Date;

public class Locacao {
private Aluno aluno;
private Livro livro;
private Data locacao;
private Data devolucao;

public Locacao(){
    this.aluno = aluno;
    this.livro = livro;
    this.locacao = locacao;
    this.devolucao = devolucao;
}



    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Data getLocacao() {
        return locacao;
    }

    public void setLocacao(Data locacao) {
        this.locacao = locacao;
    }

    public Data getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Data devolucao) {
        this.devolucao = devolucao;
    }

    @Override
    public String toString() {
        return "Locação{" + '\'' +
                "aluno = " + aluno + '\'' +
                "livro = " + livro + '\'' +
                "Locação = " + locacao + '\'' +
                "Devolução = " + devolucao + '\'' +
                '}';
    }
}
