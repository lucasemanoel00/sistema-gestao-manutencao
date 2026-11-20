package classes;

import enums.StatusManutencao;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Manutencao {
    
    private DateTimeFormatter FORMATO = DateTimeFormatter.ofLocalizedPattern("dd/MM/yyyy \n HH:mm:ss");
    private static int geradorId = 0;
    private final int idManutencao = ++geradorId;
    private final Solicitacao solicitacao;
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
    public int getIdentificadorManutencao() {

        return this.idManutencao;

    }

    public Solicitacao getSolicitacao(){

        return this.solicitacao;

    } 

    public Tecnico getTecnico() {

        return this.tecnico;

    }

    public void atribuirTecnico(Tecnico tecnico) {

        if (this.statusManutencao != StatusManutencao.PENDENTE) {

            throw new IllegalStateException("Erro,Manutenção não está como Pendente");

        }

        if (tecnico == null) {

            throw new IllegalArgumentException("Erro, técnico inserido inválido");

        }

        if (tecnico.verDisponibilidade() == false) {

            throw new IllegalArgumentException("Erro, técnico não disponivel para a manutenção devido a não ter disponibilidade");

        }

        this.tecnico = tecnico;

    }

    public LocalDateTime getDataInicio() {

        return this.dataInicio;

    }
    public String getDataInicioFormat() {

        return this.dataInicio.format(FORMATO);

    }

    public void comecarManutencao() {

        if (this.tecnico == null || !this.tecnico.verDisponibilidade()) {

            throw new IllegalArgumentException("Erro, Técnico não inserido ou indisponivel");

        }
        
        if (this.statusManutencao ==            StatusManutencao.PENDENTE) {
            
            this.dataInicio = LocalDateTime.now();
            this.statusManutencao = StatusManutencao.EM_ANDAMENTO;
            this.tecnico.tecnicoOcupado();
        
        }
        else {

            throw new IllegalStateException("Erro, Status da manutenção não está como pendente para ser iniciada agora");

        }
    }

    public LocalDateTime getDataConclusao() {

        return this.dataConclusao;

    }
    public String getDataConclusaoFormat() {

        return this.dataConclusao.format(FORMATO);

    } 
    public void concluirManutencao() {

        if (this.statusManutencao != StatusManutencao.EM_ANDAMENTO) {

            throw new IllegalStateException("Erro. Manutenção não está em andamento");

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
        this.statusManutencao = StatusManutencao.CONCLUIDA;
        this.tecnico.tecnicoDesocupado();

    }
    public void cancelarManutencao() {

        if (this.statusManutencao == StatusManutencao.CONCLUIDA) {

            throw new IllegalStateException("Erro, Manutenção já concluida");

        }
        if (this.statusManutencao == StatusManutencao.CANCELADA) {

            throw new IllegalStateException("Erro,Manutenção já cancelada anteriormente");

        }


        this.statusManutencao = StatusManutencao.CANCELADA;

        if (this.tecnico != null){
            
            this.tecnico.tecnicoDesocupado();

        }
    }


    public String getDiagnostico() {

        return this.diagnostico;

    }
    public void setDiagnostico(String diagnostico) {

        if (diagnostico == null || diagnostico.isBlank()) {

            throw new IllegalArgumentException("Erro. diagnóstico implementado está vázio");

        }
        
        this.diagnostico = diagnostico;

    }
    public String getDescricaoServico() {

        return this.descricaoServico;

    }
    public void setDescricaoServico(String descricaoServico) {

        if (descricaoServico == null || descricaoServico.isBlank()) {

            throw new IllegalArgumentException("Erro, descrição inválida");

        }

        this.descricaoServico = descricaoServico;

    }
    public StatusManutencao getStatusManutencao() {

        return this.statusManutencao;

    }
    @Override
    public String toString() {

        return "==== Manutenção %d ==== \n %s \n %s \nData de inicio: %s \nData Final: %s \nDiagnóstico: %s \nDescrição: %s \nStatus da Manutenção: %s".formatted(getIdentificadorManutencao(),getSolicitacao(),getTecnico(),getDataInicioFormat(),getDataConclusaoFormat(),getDiagnostico(),getDescricaoServico(),getStatusManutencao());

    }
    
}
