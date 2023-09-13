package Atividade_5.ProjetoVeiculosEstagiario;
public class Aviao extends BaseVeiculo{
    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Aviao(int codigo, String nome, String modelo, String cor, int anoFabricacao, int eixos, double pesoLiquido,
            double pesoTotal, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores,
            int qtdeOcupantes, int portas) {
        super(codigo, nome, modelo, cor, anoFabricacao, eixos, pesoLiquido, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes);
        this.portas = portas;
    } 
}
