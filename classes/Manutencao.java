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

    
}
