package classes;
import enums.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solicitacao {
    
    private static int geradorSolicitacao = 0;
    private final int idSolicitacao = ++geradorSolicitacao;
    private Equipamento equipamento;
    private Funcionario funcionarioSolicitante;
    private LocalDate dataSolicitacao;
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Prioridade prioridade;
    private StatusSolicitacao statusSolicitacao;
    private String descricaoSolicitacao;

    public Solicitacao (int dia, int mes, int ano, Prioridade prioridade, Equipamento equipamento, Funcionario funcionarioSolicitante,String descricaoSolicitacao){

        if (dia <= 0) {

            throw new IllegalArgumentException("Erro,data inválida devido ao dia ser menor ou igual a 0 (zero)");

        }
        else if (mes <= 0) {

            throw new IllegalArgumentException("Erro,data inválida devido ao mês ser menor ou igual a 0 (zero)");

        }
        else if (ano <= 0) {
            
            throw new IllegalArgumentException("Erro,data inválida devido ao ano ser menor ou igual a 0 (zero)");

        }
            
        this.dataSolicitacao = LocalDate.of(ano,mes,dia);

        if (prioridade == null) {

            throw new IllegalArgumentException("Erro, prioridade não declarada.");

        }

        this.prioridade = prioridade;

        if (equipamento == null) {

            throw new IllegalArgumentException("Erro,equipamento não declarado.");

        }

        this.equipamento = equipamento;

        if (funcionarioSolicitante == null) {

            throw new IllegalArgumentException("Erro, solicitante não declarado.");

        }

        this.funcionarioSolicitante = funcionarioSolicitante;

        this.statusSolicitacao = StatusSolicitacao.ABERTA;

        if (descricaoSolicitacao == null || descricaoSolicitacao.isBlank()) {

            throw new IllegalArgumentException("Erro, Descrição não foi informada de forma correta!");

        }

        this.descricaoSolicitacao = descricaoSolicitacao;

    }

    public int getIdSolicitacao() {

        return this.idSolicitacao;

    }
    public Equipamento getEquipamento() {

        return this.equipamento;

    }
    public void setEquipamento(Equipamento equipamento) {

         if (equipamento == null) {

            throw new IllegalArgumentException("Erro,equipamento não declarado.");

        }

        this.equipamento = equipamento;

    }
    public Funcionario getFuncionarioSolicitante() {

        return this.funcionarioSolicitante;

    }
    public void setFuncionarioSolicitante(Funcionario funcionarioSolicitante) {

        if (funcionarioSolicitante == null) {

            throw new IllegalArgumentException("Erro, solicitante não declarado.");

        }

        this.funcionarioSolicitante = funcionarioSolicitante;

    }
    public LocalDate getDataSolicitacao() {

        return this.dataSolicitacao;

    }
    public String getDataSolicitacaoFormat() {

        return this.dataSolicitacao.format(FORMATO);

    }
    public void setDataSolicitacao(int dia,int mes,int ano) {

         if (dia <= 0) {

            throw new IllegalArgumentException("Erro,data inválida devido ao dia ser menor ou igual a 0 (zero)");

        }
        else if (mes <= 0) {

            throw new IllegalArgumentException("Erro,data inválida devido ao mês ser menor ou igual a 0 (zero)");

        }
        else if (ano <= 0) {
            
            throw new IllegalArgumentException("Erro,data inválida devido ao ano ser menor ou igual a 0 (zero)");

        }

        this.dataSolicitacao = LocalDate.of(ano,mes,dia);

    }
    public Prioridade getPrioridade() {

        return this.prioridade;

    }
    public void setPrioridade(Prioridade prioridade) {

         if (prioridade == null) {

            throw new IllegalArgumentException("Erro, prioridade não declarada.");

        }

        this.prioridade = prioridade;

    }
    public StatusSolicitacao getStatusSolicitacao() {

        return this.statusSolicitacao;

    }
    public void setStatusSolicitacao(StatusSolicitacao statusSolicitacao) {

         if (statusSolicitacao == null) {

            throw new IllegalArgumentException("Erro, Status da solicitação não declarado.");

        }

        this.statusSolicitacao = statusSolicitacao;

    }
    public String getDescricaoSolicitacao() {

        return this.descricaoSolicitacao;

    }
    public void setDescricaoSolicitacao(String descricaoSolicitacao) {

        if (descricaoSolicitacao == null || descricaoSolicitacao.isBlank()) {

            throw new IllegalArgumentException("Erro, Descrição não foi informada de forma correta!");

        }

        this.descricaoSolicitacao = descricaoSolicitacao;

    } 
    @Override 
    public String toString() {

        return "==== Solicitação %d ==== \n%s \n \n \n%s \nData de solicitação: %s \nPrioridade: %s \nStatus da solicitação: %s \nDescrição da solicitação: %s".formatted(getIdSolicitacao(),getEquipamento(),getFuncionarioSolicitante(),getDataSolicitacaoFormat(),getPrioridade(),getStatusSolicitacao(),getDescricaoSolicitacao());

    }
    

    
    
}
