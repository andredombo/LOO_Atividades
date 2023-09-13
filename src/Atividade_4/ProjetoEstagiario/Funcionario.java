package Atividade_4.ProjetoEstagiario;
public class Funcionario extends BasePessoa {
    private String contaCorrente;
    private String cracha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public Funcionario(String contaCorrente, String cracha) {
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
    }
    public Funcionario(){
        
    }
}
