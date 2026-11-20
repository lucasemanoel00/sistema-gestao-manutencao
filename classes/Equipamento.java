package classes;
import enums.*;

public class Equipamento {
    
    private static int geradorId = 1000;
    private final int identificador = ++geradorId;
    private String nomeEquipamento;
    private TipoEquipamento tipoEquipamento;
    private StatusEquipamento statusEquipamento;
    private SetorEmpresa setorEmpresa;
    private String descricao;


    public Equipamento(String nomeEquipamento,TipoEquipamento tipoEquipamento,StatusEquipamento statusEquipamento,SetorEmpresa setorEmpresa,String descricao) {

        if (nomeEquipamento == null || nomeEquipamento.isBlank()){
            
           throw new IllegalArgumentException("Erro, nome do equipamento não informado,tente novamente!");
        
        }

         this.nomeEquipamento = nomeEquipamento;
        
        if (tipoEquipamento == null) {

           throw new IllegalArgumentException("Erro, tipo do equipamento não informado,tente novamente!");
        
        }

         this.tipoEquipamento = tipoEquipamento;

        if (statusEquipamento == null) {

            throw new IllegalArgumentException("Erro, STATUS do equipamento não informado,tente novamente!");

        }

        this.statusEquipamento = statusEquipamento;

        if (setorEmpresa == null) {

            throw new IllegalArgumentException("Erro, SETOR do equipamento não informado,tente novamente!");

        }

        this.setorEmpresa = setorEmpresa;

        if (descricao == null || descricao.isBlank()) {
        
            throw new IllegalArgumentException("Erro, DESCRIÇÃO do equipamento não informado,tente novamente!");

        }

        this.descricao = descricao;

    }
    public int getIdentificadorEquipamento() {

        return this.identificador;

    }
    public String getNomeEquipamento() {

        return this.nomeEquipamento;

    }
    public void setNomeEquipamento(String nomeEquipamento) {

        if (nomeEquipamento == null || nomeEquipamento.isBlank() ) {

            throw new IllegalArgumentException("Nome da máquina não especificada.");

        }

        this.nomeEquipamento = nomeEquipamento;

    }
    public TipoEquipamento getTipoEquipamento() {

        return this.tipoEquipamento;

    }
    public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {

        if (tipoEquipamento == null) {

            throw new IllegalArgumentException("Tipo de máquina não especificada, tente novamente!");

        }

        this.tipoEquipamento = tipoEquipamento;

    }
    public StatusEquipamento getStatusEquipamento() {

        return this.statusEquipamento;

    }
    public void setStatusEquipamento(StatusEquipamento statusEquipamento) {

        if (statusEquipamento == null) {

            throw new IllegalArgumentException("Erro, STATUS do equipamento não informado,tente novamente!");

        }

        this.statusEquipamento = statusEquipamento;

    }
    public SetorEmpresa getSetorEmpresa() {

        return this.setorEmpresa;

    }
    public void setSetorEmpresa(SetorEmpresa setorEmpresa) {

        if (setorEmpresa == null) {

            throw new IllegalArgumentException("Erro,o setor da empresa não foi fornecido, tente novamente");

        }

        this.setorEmpresa = setorEmpresa;

    } 
    public String getDescricao() {

        return this.descricao;

    }
    public void setDescricao(String descricao) {

        if  (descricao ==null ||descricao.isBlank()) {

            throw new IllegalArgumentException("Erro, descrição vazia ou não informada,tente novamente!");

        }

        this.descricao = descricao;

    }
    @Override 
    public String toString() {

        return "====== EQUIPAMENTO: %d ====== \nNome do equipamento: %s \nTipo da equipamento: %s \nStatus da equipamento: %s \nSetor da empresa: %s \nDescrição do equipamento: %s".formatted(getIdentificadorEquipamento(),getNomeEquipamento(),getTipoEquipamento(),getStatusEquipamento(),getSetorEmpresa(),getDescricao());

    }

}
