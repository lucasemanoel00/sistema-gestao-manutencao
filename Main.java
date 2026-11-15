import classes.*;
import enums.*;

public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Lucas", "12345678900", "1234-567890", "Lucas@gmail.com", "Rua N", 1, 10, 2026, SetorEmpresa.ADMINISTRATIVO, "Administrador Júnior II");

        System.out.println(funcionario);


    }

}