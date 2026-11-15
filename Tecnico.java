public class Tecnico extends Funcionario{
    
    private boolean disponibilidade;

    public Tecnico(String nomePessoa,String cpf,String telefone,String email,String endereco,int dia,int mes, int ano,SetorEmpresa setorEmpresaFuncionario,String cargoFuncionario) {

        super(nomePessoa, cpf, telefone, email, endereco, dia, mes, ano, setorEmpresaFuncionario, cargoFuncionario);
        this.disponibilidade = true;

    }
    public boolean  verDisponibilidade() {

        return this.disponibilidade;

    }
    public void tecnicoOcupado() {

        this.disponibilidade = false;

    }
    public void tecnicoDesocupado() {

        this.disponibilidade = true;

    }
    @Override 
    public String toString() {

        return "==== Técnico %d ==== \nData de contratação: %s \nNome do funcionário: %s \nSetor do funcionário: %s\nCPF: %s \nTelefone: %s \nEmail: %s \nEndereço: %s \nDisponível? %s".formatted(getIdentificadorPessoa(),getDataContratacaoFormat(),getNomePessoa(),getSetorEmpresaFuncio(),getCpf(),getTelefone(),getEmail(),getEndereco(),verDisponibilidade() ? "Sim" : "Não");

    }

}
