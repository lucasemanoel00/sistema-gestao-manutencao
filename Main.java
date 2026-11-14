public class Main {
    
    public static void main(String[] args) {
        

        Equipamento equipamento = new Equipamento("Notebook", Equipamento.TipoEquipamento.NOTEBOOK, Equipamento.StatusEquipamento.EM_MANUTENCAO, Equipamento.SetorEmpresa.TI, "Notebook com defeito");
        Equipamento equipamento2 = new Equipamento("", Equipamento.TipoEquipamento.COMPUTADOR, Equipamento.StatusEquipamento.OPERACIONAL, Equipamento.SetorEmpresa.LOGISTICA, "Computador com defeito");

        System.out.println(equipamento);
        System.out.println(equipamento2);



    }


}
