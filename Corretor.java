public class Corretor {
    private int id;
    private String nome;
    private String creci; // Registro do corretor
    private String telefone;
    private String email;

    public Corretor(int id, String nome, String creci, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.creci = creci;
        this.telefone = telefone;
        this.email = email;
    }

    public void atualizarDados(String novoNome, String novoTelefone, String novoEmail) {
        this.nome = novoNome;
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }

    public String exibirInformacoes() {
        return "Corretor: " + nome + ", CRECI: " + creci + ", Telefone: " + telefone + ", Email: " + email;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCreci() {
        return creci;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}