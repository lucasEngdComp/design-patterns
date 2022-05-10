package facadePattern;

public class Aluno extends Turma{
    private String nomeDoAluno;
    private String matriculaString;
    
    public Aluno getAlunos() {
	return super.alunos;
    }
    
    public String getMatricula() {
	return this.matriculaString;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }
    
    
}
