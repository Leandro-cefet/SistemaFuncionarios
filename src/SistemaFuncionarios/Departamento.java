package SistemaFuncionarios;

public class Departamento {

    // Atributos privados
	
    private String nomeDepartamento;
    private Funcionario[] funcionarios;
    private int contador;

    // Construtor parametrizado
    
    public Departamento(String nomeDepartamento) {

        this.nomeDepartamento = nomeDepartamento;

        funcionarios = new Funcionario[5];

        contador = 0;
    }

    // Método para adicionar funcionário
    
    public void adicionarFuncionario(Funcionario f) {

        if (contador < funcionarios.length) 
        {

            funcionarios[contador] = f;

            contador++;

        } 
        else 
        {

            System.out.println("Departamento lotado. Não é possível adicionar mais funcionários.");
        }
    }

    // Método para listar funcionários
    
    public void listarFuncionarios() {

        System.out.println("Departamento: " + nomeDepartamento);
        System.out.println();

        for (int i = 0; i < contador; i++) 
        {

            funcionarios[i].exibirDados();
        }
    }

    // Método para calcular folha salarial
    
    public double calcularFolhaSalarial() {

        double total = 0;

        for (int i = 0; i < contador; i++) 
        {

            if (funcionarios[i].getAtivo() == true) 
            {

                total = total + funcionarios[i].getSalario();
            }
        }

        return total;
    }
}
