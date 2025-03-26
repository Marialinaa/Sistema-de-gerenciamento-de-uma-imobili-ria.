public class Imovel {
    private int id;
    private String tipo; // Ex: casa, apartamento, terreno
    private String endereco;
    private double valor;
    private String status; // Ex: disponível, vendido, alugado
    private String descricao;
    private double area; // em metros quadrados

    public Imovel(int id, String tipo, String endereco, double valor, String status, String descricao, double area) {
        this.id = id;
        this.tipo = tipo;
        this.endereco = endereco;
        this.valor = valor;
        this.status = status;
        this.descricao = descricao;
        this.area = area;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void atualizarValor(double novoValor) {
        this.valor = novoValor;
    }

    public String exibirDetalhes() {
        return "Imóvel: " + tipo + ", Endereço: " + endereco + ", Valor: " + valor + ", Status: " + status + ", Descrição: " + descricao + ", Área: " + area + " m²";
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getArea() {
        return area;
    }
}