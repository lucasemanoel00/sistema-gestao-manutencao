public class Pessoa {
    
    private static int geradorId = 0;
    private final int identificadorPessoa = ++geradorId;
    private String nomePessoa;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Pessoa (String nomePessoa,String cpf,String telefone,String email,String endereco) {

        if (nomePessoa == null || nomePessoa.isBlank()) {

            throw new IllegalArgumentException("Erro, nome da pessoa vázio ou inválido, tente novamente!");

        }

        this.nomePessoa = nomePessoa;
        
        if (cpf == null ||cpf.isBlank() ||cpf.length()!=11) {

            throw new IllegalArgumentException("ERRO, CPF inválido, tente novamente!");

        }

        this.cpf = cpf;

        if (telefone == null || telefone.isBlank()) {

            throw new IllegalArgumentException("ERRO, telefone inválido, tente novamente!");

        }
        
        this.telefone = telefone;
        
        if (email == null || !email.contains("@") || email.isBlank()) {

            throw new IllegalArgumentException("Email vazio ou incorreto ou com a falta de '@', tente novamente!");

        }

        this.email = email;
        
        if (endereco == null || endereco.isBlank()) {

            throw new IllegalArgumentException("Erro, endereço inválido ou vazio tente novamente!");

        }

        this.endereco = endereco;

    }
    public int getIdentificadorPessoa() {
        return identificadorPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {

        if (nomePessoa == null || nomePessoa.isBlank()) {

            throw new IllegalArgumentException("Erro, nome da pessoa vázio ou inválido, tente novamente!");

        }

        this.nomePessoa = nomePessoa;

    }

    public String getCpf() {

        return cpf;

    }

    public void setCpf(String cpf) {

        if (cpf == null || cpf.isBlank() || cpf.length()!=11) {

            throw new IllegalArgumentException("ERRO, CPF inválido, tente novamente!");

        }

        this.cpf = cpf;

    }

    public String getTelefone() {

        return telefone;

    }

    public void setTelefone(String telefone) {

        if (telefone == null || telefone.isBlank()) {

            throw new IllegalArgumentException("ERRO, telefone inválido, tente novamente!");

        }

        this.telefone = telefone;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        if (email == null || !email.contains("@") || email.isBlank()) {

            throw new IllegalArgumentException("Email vazio ou incorreto ou com a falta de '@', tente novamente!");

        }

        this.email = email;

    }

    public String getEndereco() {

        return endereco;

    }

    public void setEndereco(String endereco) {

        if (endereco == null || endereco.isBlank()) {

            throw new IllegalArgumentException("Erro, endereço inválido ou vazio tente novamente!");

        }

        this.endereco = endereco;

    }
    @Override 
    public String toString() {

        return "==== Pessoa %d ==== \nNome da pessoa: %s \nCPF: %s \nTelefone: %s \nEmail: %s \nEndereço: %s".formatted(getIdentificadorPessoa(),getNomePessoa(),getCpf(),getTelefone(),getEmail(),getEndereco());

    }
    



}
