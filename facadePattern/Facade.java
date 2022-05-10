package facadePattern;

public class Facade {
    protected Turma turma;
    protected Aluno aluno;
    protected Curso curso;
    protected Escola escola;
    
    
   public Facade() {
	   this.turma = new Turma();
	   this.aluno = new Aluno();
	   this.curso = new Curso();
	   this.escola = new Escola();
   }
   
   public void all() {
	  turma.addAluno();
	  turma.setCurso();
   }
   
    
    
    
}
