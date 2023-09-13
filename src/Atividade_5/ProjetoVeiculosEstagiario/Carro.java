package Atividade_5.ProjetoVeiculosEstagiario;
public class Carro extends BaseVeiculo{
    private int portas;
    private String codigoRenavam;
    private String chassi;
    private String placa;
    private int anoModelo;
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public Carro(int codigo, String nome, String modelo, String cor, int anoFabricacao, int eixos, double pesoLiquido,
            double pesoTotal, int assentos, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores,
            int qtdeOcupantes, int portas, String codigoRenavam, String chassi, String placa, int anoModelo) {
        super(codigo, nome, modelo, cor, anoFabricacao, eixos, pesoLiquido, pesoTotal, assentos, rodas, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes);
        this.portas = portas;
        this.codigoRenavam = codigoRenavam;
        this.chassi = chassi;
        this.placa = placa;
        this.anoModelo = anoModelo;
    }
}
