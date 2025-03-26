public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Cliente(int id, String nome, String cpf, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public void atualizarDados(String novoNome, String novoTelefone, String novoEmail) {
        this.nome = novoNome;
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }

    public String exibirInformacoes() {
        return "Cliente: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone + ", Email: " + email;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}