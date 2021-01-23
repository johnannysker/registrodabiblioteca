package entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private int periodo;
    private double semestre;
    List<Livro> meusLivros;

    //Método toString
    public String toString(){
            return "Nome: " + nome + '\''
                    + "Matricula: " + matricula + '\''
                    + "Curso: " + curso + '\''
                    + "Período: " + periodo + '\''
                    + "Semestre: " + semestre + '\''
                    + "Livros: " + meusLivros;
        }

    //Construtor do objeto
  public Aluno(String nome, int matricula, String curso, int periodo, double semestre){
      meusLivros = new ArrayList<>();
      this.nome = nome;
      this.matricula = matricula;
      this.curso = curso;
      this.periodo = periodo;
      this.semestre = semestre;
  }



  //Esse método adiciona o livro na lista de livros do aluno
    public void adicionarLivro(Livro l){
      meusLivros.add(l);
    }
    //Esse método retorna a quantidade de livros na lista do aluno
    public int getQuantidadeDeLivrosLocados(){
      return meusLivros.size();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getSemestre() {
        return semestre;
    }

    public void setSemestre(double semestre) {
        this.semestre = semestre;
    }

    public List<Livro> getMeusLivros() {
        return meusLivros;
    }

    public void setMeusLivros(List<Livro> meusLivros) {
        this.meusLivros = meusLivros;
    }
}
