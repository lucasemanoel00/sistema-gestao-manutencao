import classes.*;
import enums.*;

public class TesteManutencao {

    public static void main(String[] args) {

        // 1. Criando funcionário solicitante
        Funcionario funcionario = new Funcionario(
                "Lucas",
                "12345678901",
                "81987654321",
                "lucas@gmail.com",
                "Rua das Flores, Recife - PE",
                15, 3, 2000,
                SetorEmpresa.TI,
                "Analista"
        );

        // 2. Criando equipamento
        Equipamento equipamento = new Equipamento(
                "Computador Dell OptiPlex",
                TipoEquipamento.COMPUTADOR,
                StatusEquipamento.COM_DEFEITO,
                SetorEmpresa.TI,
                "Computador utilizado pela equipe de desenvolvimento"
        );

        // 3. Criando solicitação
        Solicitacao solicitacao = new Solicitacao(
                20, 11, 2026,
                Prioridade.ALTA,
                equipamento,
                funcionario,
                "Computador não está ligando"
        );

        // 4. Criando técnico
        Tecnico tecnico = new Tecnico(
                "Carlos Henrique",
                "12345678902",
                "81987654322",
                "carlos@gmail.com",
                "Rua das Flores, Recife - PE",
                15, 3, 1998,
                SetorEmpresa.TI,
                "Técnico de Manutenção"
        );

        // 5. Criando manutenção
        Manutencao manutencao = new Manutencao(solicitacao);

        System.out.println("\n===== TESTE 1: MANUTENÇÃO PENDENTE =====");
        System.out.println(manutencao);

        // 6. Atribuindo técnico
        manutencao.atribuirTecnico(tecnico);

        System.out.println("\n===== TESTE 2: TÉCNICO ATRIBUÍDO =====");
        System.out.println("Técnico disponível: " + tecnico.verDisponibilidade());
        System.out.println(manutencao);

        // 7. Iniciando manutenção
        manutencao.comecarManutencao();

        System.out.println("\n===== TESTE 3: MANUTENÇÃO INICIADA =====");
        System.out.println("Técnico disponível: " + tecnico.verDisponibilidade());
        System.out.println(manutencao);

        // 8. Inserindo diagnóstico e descrição
        manutencao.setDiagnostico("Fonte de alimentação danificada");

        manutencao.setDescricaoServico(
                "Substituição da fonte de alimentação e testes de funcionamento"
        );

        // 9. Concluindo manutenção
        manutencao.concluirManutencao();

        System.out.println("\n===== TESTE 4: MANUTENÇÃO CONCLUÍDA =====");
        System.out.println("Técnico disponível: " + tecnico.verDisponibilidade());
        System.out.println(manutencao);

        // 10. Testando cancelamento de manutenção pendente
        Manutencao manutencao2 = new Manutencao(solicitacao);

        System.out.println("\n===== TESTE 5: CANCELAMENTO PENDENTE =====");

        manutencao2.cancelarManutencao();

        System.out.println(manutencao2);

        // 11. Testando cancelamento de manutenção concluída
        System.out.println("\n===== TESTE 6: CANCELAMENTO DE CONCLUÍDA =====");

        try {
            manutencao.cancelarManutencao();
        } catch (IllegalStateException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}





