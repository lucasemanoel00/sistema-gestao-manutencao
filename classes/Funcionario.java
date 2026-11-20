package classes;

import enums.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa{
    
    private LocalDate dataContratacao;
    private SetorEmpresa setorEmpresaFuncionario;
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String cargoFuncionario;
    
    public Funcionario(String nomePessoa,String cpf,String telefone,String email,String endereco,int dia,int mes, int ano,SetorEmpresa setorEmpresaFuncionario,String cargoFuncionario) {

        super(nomePessoa, cpf, telefone, email, endereco);

        if (dia<=0 || mes<=0 || ano<=0){

            throw new IllegalArgumentException("Erro, o dia ou mês ou ano é inferior a 0, tente novamente com data válida");

        } 

        LocalDate validarData = LocalDate.of(ano, mes, dia);

        if (validarData.isAfter(LocalDate.now())) {

            throw new IllegalArgumentException("Erro, a data é inválida por ser após o dia atual de hoje");

        }

        this.dataContratacao = validarData;

        if (setorEmpresaFuncionario == null) {

            throw new IllegalArgumentException("Erro, setor da empresa não inserido ou vázio");

        }

        this.setorEmpresaFuncionario = setorEmpresaFuncionario;

        if (cargoFuncionario == null || cargoFuncionario.isBlank()) {

            throw new IllegalArgumentException("Erro, cargo da empresa não inserido ou vázio, tente novamente!");

        }

        this.cargoFuncionario = cargoFuncionario;

    }
    public void setDataContratacao(int dia,int mes,int ano) {

        

        if (dia<=0 || mes<=0 || ano<=0){

            throw new IllegalArgumentException("Erro, o dia ou mês ou ano é inferior a 0, tente novamente com data válida");

        } 

        LocalDate validarData = LocalDate.of(ano, mes,dia);

        if (validarData.isAfter(LocalDate.now())) {

            throw new IllegalArgumentException("Erro, a data é inválida por ser após o dia atual de hoje");

        }

        this.dataContratacao = validarData;

    }

    public LocalDate getDataContratacao() {

        return this.dataContratacao;

    } 
    public String getDataContratacaoFormat() {

        return this.dataContratacao.format(FORMATO);

    }
    public SetorEmpresa getSetorEmpresaFuncio() {

        return this.setorEmpresaFuncionario;

    }
    public void setSetorEmpresaFuncio(SetorEmpresa setorEmpresa) {

        if (setorEmpresa == null) {

            throw new IllegalArgumentException("Erro, setor não registrado de forma correta!");

        }

        this.setorEmpresaFuncionario = setorEmpresa;

    }
    public void setCargoFuncionario(String cargoFuncionario) {

        if (cargoFuncionario == null || cargoFuncionario.isBlank()) {

            throw new IllegalArgumentException("Erro, cargo da empresa não inserido ou vázio, tente novamente!");

        }

        this.cargoFuncionario = cargoFuncionario;

    }
    public String getCargoFuncionario() {

        return this.cargoFuncionario;

    }
    @Override 
    public String toString() {

        return "==== Funcionário %d ==== \nData de contratação: %s \nNome do funcionário: %s \nSetor do funcionário: %s\nCargo funcionário: %s \nCPF: %s \nTelefone: %s \nEmail: %s \nEndereço: %s \n".formatted(getIdentificadorPessoa(),getDataContratacaoFormat(),getNomePessoa(),getSetorEmpresaFuncio(),getCargoFuncionario(),getCpf(),getTelefone(),getEmail(),getEndereco());

    }
    







}





