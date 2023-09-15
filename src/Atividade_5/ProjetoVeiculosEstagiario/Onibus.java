package Atividade_5.ProjetoVeiculosEstagiario;
public class Onibus extends BaseVeiculo{
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
    public String getCodgioRenavam() {
        return codigoRenavam;
    }
    public void setCodgioRenavam(String codgioRenavam) {
        this.codigoRenavam = codgioRenavam;
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
    public Onibus(int codigo, String nome, String modelo, String cor, int anoFabricacao, int eixos, double pesoLiquido,
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
    public void Imprimir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano fabricacao: " + this.anoFabricacao);
        System.out.println("Eixos: " + this.eixos);
        System.out.println("Peso liquido: " + this.pesoLiquido);
        System.out.println("Peso total: " + this.pesoTotal);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Rodas: " + this.rodas);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Tipo de combustivel: " + this.tipoCombustivel);
        System.out.println("Nome proprietario: " + this.nomeProprietario);
        System.out.println("EstadoUF: " + this.estadoUF);
        System.out.println("CidadeUF: " + cidadeUF);
        System.out.println("Tipo de veiculo: " + this.tipoVeiculo);
        System.out.println("Quantidade de motores: " + this.qtdeMotores);
        System.out.println("Quantidade de ocupantes: " + this.qtdeOcupantes);
        System.out.println("Portas: " + this.portas);
        System.out.println("Codigo Renavam: " + this.codigoRenavam);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano do modelo: " + this.anoModelo);
    }
}
