package entidades;
import java.util.*;

public class Biblioteca {
    private static  List<Aluno> alunos;
    private static List<Livro> livros;
    private static List<Locacao>locados;


    public Biblioteca(){
        alunos = new ArrayList<>();
        livros = new ArrayList<>();
        locados = new ArrayList<>();
    }

    //exibi o menu principal com as opções para a locadora
    public int exibirMenu(){
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("___________________LOCADORA____________________");
        System.out.println("***** 1 - Livro.                *****");
        System.out.println("***** 2 - Aluno.                *****");
        System.out.println("***** 3 - Locação / Devolução.  *****");
        System.out.println("***** 4 - Sair                  *****");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        Escrever e = new Escrever();
        int opcao = e.dnum("ESCOLHA UMA OPÇÃO");
        if (opcao < 1 || opcao > 4){
            System.out.println("Digite uma opção válida!");
        }
        return opcao;

    }
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Locacao> getLocados() {
        return locados;
    }

    public void setLocados(List<Locacao> locados) {
        this.locados = locados;
    }

    /*aqui ficam os métodos
* do menu de livros */
    //Menu de opções para livros
    public int exibirMenuLivro(){
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("__________________LIVROS_______________________");
        System.out.println("***** 1 - Cadastrar Livro.      *****");
        System.out.println("***** 2 - Alterar Livro.        *****");
        System.out.println("***** 3 - Consultar Livro.      *****");
        System.out.println("***** 4 - Remover Livro.        *****");
        System.out.println("***** 5 - Menu Principal.       *****");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        Escrever e = new Escrever();
        int op = e.dnum("ESCOLHA UMA OPÇÃO");
        if (op < 1 || op > 5){
            System.out.println("digite uma opção válida");
        }
        return op;

    }

    //A) - Método que adiciona um livro na lista de livros da biblioteca
    public void cadastrarLivro(){
        Escrever e = new Escrever();
        Livro l = new Livro();
        String nomelivro = e.dtext("Digite o nome do livro.");
        l.setNome(nomelivro);
        int id = e.dnum("Digite o ID do livro.");
        l.setId(id);
        int edicao = e.dnum("Digite a edição do livro");
        l.setEdicao(edicao);
        String assunto = e.dtext("Digite o assunto do livro.");
        l.setAssunto(assunto);
        livros.add(l);
        System.out.println("Livro cadastrado com sucesso!");
    }
    //B) - Método que modifica alguns dados do livro
    public void alterarLivro(){
        Escrever e = new Escrever();
        int id = e.dnum("Digite o ID do livro.");
        Livro n = null;
        for (Livro l : livros){
            if (id == l.getId()){
                n = l;
            }
        }
        if(n != null){
            String nome = e.dtext("Digite o nome do livro.");
            n.setNome(nome);
            String assunto = e.dtext("Digite o assunto do livro.");
            n.setAssunto(assunto);
            int edicao = e.dnum("Digite a edição do livro");
            n.setEdicao(edicao);
            System.out.println("Assunto modificado com sucesso!");
        }else {
            System.out.println("Livro inexistente!");
        }
    }
    //C) - Método que busca e mostra os dados do livro
    public void consultarLivro(){
        Escrever e = new Escrever();
        boolean achou = false;
        int id = e.dnum("Digite o ID do livro:");
        for(Livro l : livros){
            if(l.getId() == id){
                achou = true;
                System.out.println(l);
            }
        }
        if(!achou){
            System.out.println("Livro não cadastrado!");
        }
    }

    //D) - Método que apaga um livro dos registro da locadora
    public void removeLivro(){
        Escrever e = new Escrever();
        int id = e.dnum("Digite o ID do livro que será apagado.");
        Livro rmv = null;
        for(Livro l : livros){
            if (l.getId() == id){
                rmv = l;
            }
        }
        if (rmv != null){
            livros.remove(rmv);
            System.out.println("Livro removido com sucesso!");
        }else{
            System.out.println("Livro não encontrado!");
        }
    }
    /*Aqui ficam os métodos
     do menu de alunos*/
    //Exibi o menu das opções para aluno
    public int exibirMenuAluno(){
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("__________________ALUNO_______________________");
        System.out.println("***** 1 - Cadastrar Aluno.      *****");
        System.out.println("***** 2 - Alterar Aluno.        *****");
        System.out.println("***** 3 - Consultar Aluno.      *****");
        System.out.println("***** 4 - Remover Aluno.        *****");
        System.out.println("***** 5 - Menu Principal.       *****");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        Escrever e = new Escrever();
        int op = e.dnum("ESCOLHA UMA OPÇÃO");
        if(op < 1 || op > 5){
            System.out.println("Digite uma opção válida!");
        }
        return op;

    }
    //A) - Método que adiciona um aluno na lista de alunos da biblioteca
    public void cadastrarAluno(){
        Escrever e = new Escrever();
        String nome = e.dtext("Digite o nome do aluno.");
        int matricula = e.dnum("Digite a matricula do aluno.");
        String cursoDoAluno = e.dtext("Digite o curso do aluno.");
        int periodo = e.dnum("Digite o período do curso.");
        double semestre = e.dflut("Digite o semestre do curso.");
        Aluno novoAluno = new Aluno(nome, matricula, cursoDoAluno, periodo, semestre);
        novoAluno.setNome(nome);
        novoAluno.setMatricula(matricula);
        novoAluno.setCurso(cursoDoAluno);
        novoAluno.setPeriodo(periodo);
        novoAluno.setSemestre(semestre);
        alunos.add(novoAluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }
    //B) - Método que altera alguns dados do aluno
    public void alterarAluno(){
        Escrever es = new Escrever();
        int matricula = es.dnum("Digite a matricula do aluno");
        Aluno e = null;
        for(Aluno a : alunos){
            if(a.getMatricula() == matricula){
                e = a;
            }
        }
        if(e != null){
            String curso = es.dtext("Digite o curso do aluno");
            e.setCurso(curso);
            double semestre = es.dflut("Digite o semestre do ano.");
            e.setSemestre(semestre);
            int periodo = es.dnum("Digite o período co curso");
            e.setPeriodo(periodo);
            System.out.println("Dados modificados com sucesso!");
        }else{
            System.out.println("Aluno inexistente");
        }
    }

    //C) - Método que mostra os dados do aluno e quais livros ele locou
    public void consultarAluno(){
        Escrever e = new Escrever();
        boolean naoTem = true;
        int matricula = e.dnum("Digite a matricula do aluno para exibição.");
        for(Aluno a: alunos){
            if(a.getMatricula() == matricula){
                naoTem = false;
                System.out.println(a);
            }
        }
        if(naoTem){
            System.out.println("Aluno inexistente.");
        }
    }

    //D) - Buscar e remover aluno dos registro da biblioteca
    public void removerAluno(){
        Escrever e = new Escrever();
        int matricula = e.dnum("Digite a matricula do aluno.");
        Aluno banido = null;
        for(Aluno b : alunos){
            if(b.getMatricula() == matricula){
                banido = b;
            }
        }
        if(banido != null){
            alunos.remove(banido);
            System.out.println("Aluno removido com sucesso!");
        }else{
            System.out.println("Matricula não encontrada!");
        }
    }

    /*aqui ficam os métodos
    * do menu da biblioteca */
    //Exibi o menu de opções para a locação ou devoluções
    public int exibirMenuLocacaoDevolucao(){
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("_____________LOCAÇÃO/DEVOLUÇÃO_________________");
        System.out.println("***** 1 - Locar Livro.                 *****");
        System.out.println("***** 2 - Devolver Livro.              *****");
        System.out.println("***** 3 - Encontrar Livro Locado.      *****");
        System.out.println("***** 4 - Menu Principal.              *****");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        Escrever e = new Escrever();
        int op = e.dnum("ESCOLHA UMA OPÇÃO");
        if (op < 1 || op > 4){
            System.out.println("Digite uma opção válida");
        }
        return op;

    }
    //A) - Método que adiciona uma locação na lista de locados
    public void locarLivro(){
        Escrever e = new Escrever();
        int matricula = e.dnum("Digite a matricula do aluno:");
        Aluno a1 = null;
        Livro l1 = null;
        for (Aluno a : alunos) {
            if(a.getMatricula() == matricula){//saber se o aluno estar matriculado.
                    a1 = a;
                    break;
            }
        }
        int idLivro = e.dnum("Digite o ID do livro:");
        for(Livro l : livros){//Saber se o livro estar cadastrado
            if(l.getId() == idLivro){
                l1 = l;
                break;
            }
        }
        //Adicionar o livro na lista de livros do aluno
        if(a1 != null && l1 != null){
            if(l1.isEmUso() != true && a1.getQuantidadeDeLivrosLocados() < 3){//Verificar se o aluno tem menos de 3 livros locados

                //Muda o status do livro para em uso
                l1.setEmUso(true);
                a1.adicionarLivro(l1);
                //Criar uma locação
                Locacao lc = new Locacao();
                //Adicionar o aluno, livro, data de locação e entrega na locação
                lc.setAluno(a1);
                lc.setLivro(l1);
                Data dataLocacao = new Data(e.dtext("Digite a data da locação no formato dd/MM/yyyy:"));
                Data dataEntrega = new Data(e.dtext("Digite a data da devolução no formato dd/MM/yyyy:"));

                //Adicionar a locação na lista de locados
                locados.add(lc);
                System.out.println("Livro locado com sucesso!");
            }else{
                System.out.println("O livro " + l1.getNome() + " já foi locado ou o aluno " + a1.getNome() +
                        " excedeu o numero de locações, Verifique essas informações.");
            }

        }else{
            System.out.println("Aluno ou livro inexistente! Verifique se os dados estão corretos.");
        }

    }

    //B) - Busca uma locação para remoção da lista de locados
    public void devolverLivro(){
        Escrever e = new Escrever();
        int matricula = e.dnum("Digite a matricula do aluno");
        int idLivro = e.dnum("Digite o ID do livro.");
        Locacao d = null;
        for(Locacao l: locados){
            if(l.getAluno().getMatricula() == matricula && l.getLivro().getId() == idLivro){
                d = l;
                break;
            }
        }
        if(d != null){
            d.getAluno().meusLivros.remove(d.getLivro());
            d.getLivro().setEmUso(false);
            locados.remove(d);
            System.out.println("Livro devolvido com sucesso!");
        }else{
            System.out.println("Locação não encontrada! Verifique se os dados estão corretos.");
        }

    }

    //C) - Método que procura o ID do livro e mostra o aluno que o locou, caso esteja locado
    public void encontrarLivroLocado(){
        Escrever e = new Escrever();
        boolean locado = false;
        int idLivro = e.dnum("Digite o ID do livro.");
        for(Locacao l: locados){
            if(l.getLivro().getId() == idLivro){
                locado = true;
                System.out.println("O livro está em posse do aluno: " + l.getAluno());
            }
        }
        if(!locado){
            System.out.println("O livro não foi locado.");
        }
    }

    //Método Main de exibição da interface da biblioteca

    public static void main(String[] args) {
        Biblioteca ler = new Biblioteca();
        while(true){
            int op = ler.exibirMenu();
            if(op == 4){
                break;
            }
            if(op == 1){
                int op2 = 0;
                while(op2 != 5){
                    op2 = ler.exibirMenuLivro();
                    if(op2 == 1){
                        ler.cadastrarLivro();
                    }else if (op2 == 2){
                        ler.alterarLivro();
                    }else if (op2 == 3){
                        ler.consultarLivro();
                    }else if (op2 == 4){
                        ler.removeLivro();
                    }
                }
            }else if (op == 2){

                int op3 = 0;

                while(op3 != 5){
                    op3 = ler.exibirMenuAluno();
                  if (op3 == 1){
                      ler.cadastrarAluno();
                  }else if (op3 == 2){
                      ler.alterarAluno();
                  }else if (op3 == 3){
                      ler.consultarAluno();
                  }else if (op3 == 4){
                      ler.removerAluno();
                  }
                }

            }else if (op == 3){
                int op4 = 0;
                while(op4 != 4){
                    op4 = ler.exibirMenuLocacaoDevolucao();
                    if(op4 == 1){
                        ler.locarLivro();
                    }else if (op4 == 2){
                        ler.devolverLivro();
                    }else if (op4 == 3){
                        ler.encontrarLivroLocado();
                    }
                }

            }
        }
        System.out.println("**************************");
        System.out.println("*******VOLTE SEMPRE*******");
        System.out.println("**************************");
    }
}