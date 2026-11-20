package classes;

import enums.StatusManutencao;
import java.time.LocalDateTime;

public class Manutencao {
    
    private static int geradorId = 0;
    private final int idManutencao = ++geradorId;
    private Solicitacao solicitacao;
    private Tecnico tecnico;
    private LocalDateTime dataInicio;
    private LocalDateTime dataConclusao;
    private String diagnostico;
    private String descricaoServico;
    private StatusManutencao statusManutencao;

    public Manutencao(Solicitacao solicitacao) {

        if (solicitacao == null) {

            throw new IllegalArgumentException("Erro, solicitação não foi inserida de maneira correta");

        }

        this.solicitacao = solicitacao;
        this.statusManutencao = StatusManutencao.PENDENTE;

    }

    public Solicitacao getSolicitacao(){

        return this.solicitacao;

    } 

    public void setSolicitacao(Solicitacao solicitacao) {

        if (solicitacao == null) {

            throw new IllegalArgumentException("Erro. solicitação inserida inválida");

        }

        this.solicitacao = solicitacao;

    }

    public Tecnico getTecnico() {

        return this.tecnico;

    }

    public void atribuirTecnico(Tecnico tecnico) {

        if (tecnico == null) {

            throw new IllegalArgumentException("Erro, técnico inserido inválido");

        }

        if (tecnico.verDisponibilidade() == false) {

            throw new IllegalArgumentException("Erro, técnico não disponivel para a manutenção devido a não ter disponibilidade");

        }
        if (this.statusManutencao != StatusManutencao.PENDENTE) {

            throw new IllegalStateException("Não é possivel atribuir tecnico se a manutenção não está como pendente");

        }

        this.tecnico = tecnico;

    }

    public LocalDateTime getDataInicio() {

        return this.dataInicio;

    }

    public void comecarManutencao() {

        this.dataInicio = LocalDateTime.now();

    }

    public LocalDateTime getDataConclusao() {

        return this.dataConclusao;

    }

    public void concluirManutencao() {

        if (this.statusManutencao != StatusManutencao.EM_ANDAMENTO) {

            throw new IllegalStateException("Erro. Manutenção não está pendente");

        }
        else if (this.tecnico == null) {

            throw new IllegalArgumentException("Erro. técnico não atribuido");

        }
        else if (this.diagnostico == null || this.diagnostico.isBlank()) {

            throw new IllegalArgumentException("Erro. diagnóstico não inserido");

        }
        else if (this.descricaoServico == null || this.descricaoServico.isBlank()) {

            throw new IllegalArgumentException("Erro. descrição não inserida");

        }

        this.dataConclusao = LocalDateTime.now();

    }
    public String getDiagnostico() {

        return this.diagnostico;

    }
    public void setDiaginostico(String diagnostico) {

        if (diagnostico == null || diagnostico.isBlank()) {

            throw new IllegalArgumentException("Erro. diagnóstico implementado está vázio");

        }
        
        this.diagnostico = diagnostico;

    }

    
}
