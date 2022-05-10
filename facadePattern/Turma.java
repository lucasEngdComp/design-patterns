package facadePattern;

public class Turma {

    protected Aluno[] alunos;
    protected Curso curso;

    public void addAluno(String aluno) {
	this.alunos = aluno;
    }
    
    public void setCurso( Curso curso) {
    	this.curso = curso;
    }
    
}
