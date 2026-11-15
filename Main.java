import classes.*;
import enums.*;

public class Main {
    public static void main(String[] args) {

        Equipamento equipamento = new Equipamento(
            "Computador Dell OptiPlex",
            TipoEquipamento.COMPUTADOR,
            StatusEquipamento.COM_DEFEITO,
            SetorEmpresa.TI,
            "Computador utilizado pela equipe de desenvolvimento"
        );

        Funcionario funcionario = new Funcionario(
            "Carlos Henrique",
            "12345678901",
            "81999999999",
            "carlos@empresa.com",
            "Rua das Flores, Recife",15,11,2026,
            SetorEmpresa.TI,
            "Analista de Sistemas"
        );

        Solicitacao solicitacao = new Solicitacao(11,11,2026,Prioridade.ALTA,equipamento,funcionario,"DESCRICAO");

        System.out.println(equipamento);

        System.out.println(funcionario);

        System.out.println(solicitacao);

        Tecnico tecnico = new Tecnico(
    "Roberto Almeida",
    "12345678902",
    "81988888888",
    "roberto@empresa.com",
    "Rua do Sol, Recife",
    15, 3, 2023,
    SetorEmpresa.TI,
    "Técnico de Manutenção"
);

    System.out.println("\n" + tecnico);

    }
}