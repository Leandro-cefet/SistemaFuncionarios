package SistemaFuncionarios;

public class Funcionario {

    // Atributos privados
	
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private boolean ativo;

    // Construtor parametrizado
    
    public Funcionario(String nome, String cpf, String cargo, double salario) {

        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }

    // Construtor default
    
    public Funcionario() {

        nome = "Indefinido";
        cpf = "000.000.000-00";
        cargo = "Indefinido";
        salario = 0.0;
        ativo = true;
    }

    // Método para alterar todos os dados
    
    public void alterarDados(String nome, String cpf, String cargo, double salario) {

        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Método para aplicar reajuste salarial
    
    public void aplicarReajuste(double percentual) {salario = salario + (salario * percentual / 100);}

    // Método para demitir funcionário
    
    public void demitir() {ativo = false;}

    // Método para exibir dados
    
    public void exibirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);

        if (ativo == true) 
        {
            System.out.println("Status: ATIVO");
        } 
        else 
        {
            System.out.println("Status: INATIVO");
        }
        
        System.out.println("-----------------------------");
    }

    // Método para retornar salário
    
    public double getSalario() {return salario;}

    // Método para retornar status
    
    public boolean getAtivo() {return ativo;}
}


