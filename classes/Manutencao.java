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

    public Manutencao(Solicitacao solicitacao,Tecnico tecnico,String diagnotisco,String descricao,StatusManutencao statusManutencao) {

        if (solicitacao == null) {

            throw new IllegalArgumentException("Erro, solicitação não foi inserida de maneira correta");

        }

        this.solicitacao = solicitacao;

        if (tecnico == null) {

            throw new IllegalArgumentException("Erro, técnico não foi inserido de forma correta");

        }
        if (diagnotisco == null || diagnotisco.isBlank()) {

            throw new IllegalArgumentException("Erro, diagnostico inserido está vazio");

        }
        
        this.diagnostico = diagnotisco;

        if (descricao == null || descricao.isBlank()) {

            throw new IllegalArgumentException("Erro, descrição inserida está vazia");

        }

        this.descricaoServico = descricao;

        if (statusManutencao == null) {

            throw new IllegalArgumentException("Erro. Status de manutenção não definido");

        }

        this.statusManutencao = statusManutencao;

    }
    
    
}
