    import java.time.LocalDate;
    
    public class Contrato {
        private int id;
        private Imovel imovel; // Objeto da classe Imovel
        private Cliente cliente; // Objeto da classe Cliente
        private Corretor corretor; // Objeto da classe Corretor
        private LocalDate dataInicio;
        private LocalDate data;
        private double valorTotal;
    
        public Contrato(int id, Imovel imovel, Cliente cliente, 
        Corretor corretor, LocalDate dataInicio,
        LocalDate data, double valorTotal) {
            this.id = id;
            this.imovel = imovel;
            this.cliente = cliente;
            this.corretor = corretor;
            this.dataInicio = dataInicio;
            this.data = data;
            this.valorTotal = valorTotal;
        }
    
        public String exibirDetalhes() {
            return "Contrato ID: " + id + ", Imóvel: " + imovel.getTipo() + ", Cliente: " + 
            cliente.getNome() + ", Corretor: " + 
            corretor.getNome() + ", Data de Início: " +
            dataInicio + ", Data de Fim: " +
            data + ", Valor Total: "
            + valorTotal;
        }
    
        // Getters e Setters
        public int getId() {
            return id;
        }
    
        public Imovel getImovel() {
            return imovel;
        }
    
        public Cliente getCliente() {
            return cliente;
        }
    
        public Corretor getCorretor() {
            return corretor;
        }
    
        public LocalDate getDataInicio() {
            return dataInicio;
        }
    
        public LocalDate getData() {
            return data;
        }
    
        public double getValorTotal() {
            return valorTotal;
        }
    }