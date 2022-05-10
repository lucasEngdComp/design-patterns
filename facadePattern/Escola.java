package facadePattern;

public class Escola extends Turma{
    
    public Curso getCurso() {
        return super.curso;
    } 
      
    public Aluno[] getAluno() {
    	return super.alunos;
    }
}


